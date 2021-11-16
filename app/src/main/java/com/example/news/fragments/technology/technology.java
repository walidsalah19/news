package com.example.news.fragments.technology;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.news.R;
import com.example.news.getcatagory.recycler_adapter;
import com.example.news.jason_class.main_class;
import com.example.news.jason_class.mode_class;
import com.example.news.retrofit.api;
import com.example.news.retrofit.retrofit;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link technology#newInstance} factory method to
 * create an instance of this fragment.
 */
public class technology extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView entertainment;
    private recycler_adapter adapter;
    private String api_code="7e4e275d671b4482a755d80a262e8bc7";
    private  ArrayList<mode_class> list;
    public technology() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment technology.
     */
    // TODO: Rename and change types and number of parameters
    public static technology newInstance(String param1, String param2) {
        technology fragment = new technology();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_technology, container, false);
        get_data();
        recyvler_intial(v);
        return v;
    }
    private void recyvler_intial(View v)
    {
        entertainment=v.findViewById(R.id.technology_recyclerview);
        entertainment.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter =new recycler_adapter( list,getActivity());
        entertainment.setAdapter(adapter);
       adapter.notifyDataSetChanged();
    }
    public void get_data()
    {
        list=new ArrayList<mode_class>();
        api api= retrofit.getRetrofit();
        Call<main_class> call=api.calldata_category("eg","technology",api_code);
        call.enqueue(new Callback<main_class>() {
            @Override
            public void onResponse(Call<main_class> call, Response<main_class> response) {
                if (response.isSuccessful())
                {
                    list.addAll(response.body().getArticles());
                    adapter.notifyDataSetChanged();
                }
                else
                {
                    Log.d("Home",response.code()+"error");
                }

            }

            @Override
            public void onFailure(Call<main_class> call, Throwable t) {
                Log.d("Home",t.getMessage()+"erorr");
            }
        });

    }
}