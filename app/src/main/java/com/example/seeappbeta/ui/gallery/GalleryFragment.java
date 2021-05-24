package com.example.seeappbeta.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.seeappbeta.R;

import java.util.ArrayList;
import java.util.List;

public class GalleryFragment extends Fragment{

    private List<String> mLista = new ArrayList<>();
    private ArrayAdapter<String> mAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        Button mBtnAñadir = (Button) view.findViewById(R.id.btnAmbulances);
        ListView mListView = (ListView) view.findViewById(R.id.listView);
        EditText mEditText = (EditText) view.findViewById(R.id.ubiAmbulanceUser);
        TextView mTextView = (TextView) view.findViewById(R.id.textView5);


        return view;
    }

}