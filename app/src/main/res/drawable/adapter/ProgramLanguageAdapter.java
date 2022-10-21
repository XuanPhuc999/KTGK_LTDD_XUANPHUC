package ltdd.tuan_1.recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ltdd.tuan_1.recyclerview.R;
import ltdd.tuan_1.recyclerview.model.ProgramLanguage;

public class ProgramLanguageAdapter  extends RecyclerView.Adapter<ProgramLanguageAdapter.ProgramLanguageViewHolder> {
    private List<ProgramLanguage> languagePrgList;

    public ProgramLanguageAdapter(List<ProgramLanguage> languagePrgList) {
        this.languagePrgList = languagePrgList;
    }

    @NonNull
    @Override
    public ProgramLanguageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_prg_language,parent, false);

        return new ProgramLanguageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgramLanguageViewHolder holder, int position) {
        ProgramLanguage programLanguage = languagePrgList.get(position);
        if (programLanguage == null) {
            return;
        }
        holder.tvName.setText(programLanguage.getNameLanguage());
        holder.tvDescrip.setText(programLanguage.getDescrep());
        holder.imgViewLanguage.setImageResource(programLanguage.getImage());
    }

    @Override
    public int getItemCount() {
        if (languagePrgList != null) {
            return languagePrgList.size();
        }
        return 0;
    }

    public class ProgramLanguageViewHolder extends RecyclerView.ViewHolder {
        private TextView tvDescrip, tvName;
        private ImageView imgViewLanguage;
        public ProgramLanguageViewHolder(@NonNull View itemView) {
            super(itemView);
            tvDescrip = itemView.findViewById(R.id.mota);
            tvName = itemView.findViewById(R.id.name);
            imgViewLanguage = itemView.findViewById(R.id.imageProgram);
        }
    }

}
