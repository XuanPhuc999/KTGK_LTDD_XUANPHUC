package ltdd.tuan_1.btgk_xuanphuc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterProgramLanguage extends BaseAdapter {

    private Context context;
    private int layout;
    private List<ProgramLanguage> arraylist;

    public AdapterProgramLanguage(Context context, int layout, List<ProgramLanguage> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view =inflater.inflate(layout, null);

        ProgramLanguage programLanguage =arraylist.get(i);

        TextView textView1 =view.findViewById(R.id.name);
        TextView textView2 = view.findViewById(R.id.mota);
        ImageView imageView = view.findViewById(R.id.imageProgram);

        textView1.setText(programLanguage.getNameLanguage());
        textView2.setText(programLanguage.getDescrep());
        imageView.setImageResource(programLanguage.getImage());

        return view;
    }
}
