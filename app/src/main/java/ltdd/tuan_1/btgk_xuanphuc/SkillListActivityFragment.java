package ltdd.tuan_1.btgk_xuanphuc;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SkillListActivityFragment extends Fragment {
    private ListView listView;

    private ArrayList<ProgramLanguage> arrayList;
    private AdapterProgramLanguage adapterProgramLanguage;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.skill_list_layout, container, false);
        listView = view.findViewById(R.id.list_view_PrgLanguage);
        arrayList = new ArrayList<>();

        arrayList.add(new ProgramLanguage("C", "Kinh nghiệm: 5 năm", R.drawable.c));
        arrayList.add(new ProgramLanguage("Java", "Kinh nghiệm: 2 năm", R.drawable.java));
        arrayList.add(new ProgramLanguage("Python", "Kinh nghiệm: 10 năm", R.drawable.python));
        arrayList.add(new ProgramLanguage("Javascript", "Kinh nghiệm: 4 năm", R.drawable.javascript));

        adapterProgramLanguage = new AdapterProgramLanguage(getContext(), R.layout.fragment_skill_list, arrayList);
        listView.setAdapter(adapterProgramLanguage);

        listView.setClickable(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(),DetailActivity.class);
                ProgramLanguage programLanguage = arrayList.get(i);
                intent.putExtra("name",programLanguage.getNameLanguage());
                intent.putExtra("exp",programLanguage.getDescrep());
                intent.putExtra("image",programLanguage.getImage());
                startActivity(intent);
            }
        });

        return view;
    }
}