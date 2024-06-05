package com.example.myrecycleview.activitys;

import android.os.Bundle;
import android.widget.SearchView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;


import androidx.recyclerview.widget.RecyclerView;


import com.example.myrecycleview.R;
import com.example.myrecycleview.models.DataModel;
import com.example.myrecycleview.adapters.CustomeAdapter;
import com.example.myrecycleview.services.MyData;

public class MainActivity extends AppCompatActivity {

    private ArrayList<DataModel> dataSet;

    private RecyclerView recyclerView;

    private LinearLayoutManager layoutManager;

    private CustomeAdapter addapter;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        SearchView searchView = findViewById(R.id.searchView);

        recyclerView = findViewById(R.id.recycleViewResult);

        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        dataSet = new ArrayList<>();


        for (int i = 0; i < MyData.actorNames.length; i++) {

            dataSet.add(new DataModel(

                    MyData.actorNames[i],

                    MyData.actorDescriptions[i],

                    MyData.actorImages[i],

                    MyData.id_[i]


            ));

        }

        addapter = new CustomeAdapter(dataSet);

        recyclerView.setAdapter(addapter);
    }


//    Did't has time to finish this
//    private void filterData(String query) {
//        ArrayList<DataModel> filteredData = new ArrayList<>();
//
//        for (DataModel dataModel : dataSet) {
//            if (dataModel.getName().toLowerCase().contains(query.toLowerCase())) {
//                filteredData.add(dataModel);
//            }
//        }
//
//        addapter.setData(filteredData);
//    }
}