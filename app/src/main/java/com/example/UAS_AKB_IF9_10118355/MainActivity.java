package com.example.UAS_AKB_IF9_10118355;

// 08 Agustus 2021 - 10118355 - Siti Alawiah - IF 9

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvWisata;
    private ArrayList<Wisata> list = new ArrayList<>();
    private String title= "WISATA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvWisata=findViewById(R.id.rv_wisata);
        rvWisata.setHasFixedSize(true);

        list.addAll(WisataData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvWisata.setLayoutManager(new LinearLayoutManager(this));
        ListWisataAdapter listWisataAdapter=new ListWisataAdapter(list);
        rvWisata.setAdapter(listWisataAdapter);

        listWisataAdapter.setOnItemClickCallback(new ListWisataAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Wisata data) {
                showSelectedItem(data);

                Intent moveIntent = new Intent(MainActivity.this, Wisata_Detail_Activity.class);
                moveIntent.putExtra(Wisata_Detail_Activity.Extra_Name, data.getName());
                moveIntent.putExtra(Wisata_Detail_Activity.Extra_Description, data.getDescription());
                moveIntent.putExtra(Wisata_Detail_Activity.Extra_Address, data.getAddress());
                moveIntent.putExtra(Wisata_Detail_Activity.Extra_Photo, data.getPhoto());
                moveIntent.putExtra(Wisata_Detail_Activity.Extra_Map, data.getMap());
                startActivity(moveIntent);
            }
        });
    }
    private void showSelectedItem(Wisata wisata) {
        Toast.makeText(this, "Informasi Wisata " + wisata.getName(), Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        setModee(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {

            case R.id.action_profil:
                Intent moveIntent2 = new Intent(MainActivity.this, Profil.class);
                startActivity(moveIntent2);
                break;
        }
    }

    public void setModee(int selectedMode) {
        switch (selectedMode) {

            case R.id.action_info:
                Intent moveIntent2 = new Intent(MainActivity.this, Info.class);
                startActivity(moveIntent2);
                break;
        }
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() !=null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
