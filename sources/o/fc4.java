package o;

import android.os.Bundle;
import android.util.SparseArray;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lo/fc4;", "T", "Lo/gk7;", "<init>", "()V", "o/ec4", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class fc4<T> extends gk7 {
    public static final SparseArray i1 = new SparseArray(1);
    public List e1;
    public Object f1;
    public int g1;
    public ArrayAdapter h1;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.gk7, o.v02, o.ut2
    public final void X(Bundle bundle) {
        super.X(bundle);
        if (bundle != null) {
            int i = bundle.getInt("WRAPPER_KEY");
            this.g1 = i;
            Object obj = i1.get(i);
            ec4 ec4Var = obj instanceof ec4 ? (ec4) obj : null;
            this.h1 = ec4Var != null ? ec4Var.a : null;
            this.f1 = ec4Var != null ? ec4Var.b : null;
        } else {
            List list = this.e1;
            if (list != null) {
                this.g1 = hashCode();
                this.h1 = new ArrayAdapter(r0(), R.layout.dialog_preferences_list, list);
            }
        }
        ListView listView = new ListView(E());
        listView.setAdapter((ListAdapter) this.h1);
        listView.setChoiceMode(1);
        listView.setDivider(null);
        listView.setPadding(0, H().getDimensionPixelSize(R.dimen.pref_listview_padding_top), 0, 0);
        listView.setOnItemClickListener(new dc4(this, listView, (byte) 0));
        ArrayAdapter arrayAdapter = this.h1;
        Object obj2 = this.f1;
        if (obj2 != null) {
            listView.setItemChecked(arrayAdapter != 0 ? arrayAdapter.getPosition(obj2) : 0, true);
        } else if (listView.getCount() > 0) {
            listView.setItemChecked(0, true);
        }
        this.Y0 = false;
        K0(listView);
    }

    @Override // o.ut2
    public final void a0() {
        this.S = true;
        this.h1 = null;
    }

    @Override // o.gk7, o.v02, o.ut2
    public final void h0(Bundle bundle) {
        super.h0(bundle);
        ec4 ec4Var = new ec4(this.h1, this.f1);
        bundle.putInt("WRAPPER_KEY", this.g1);
        i1.put(this.g1, ec4Var);
    }
}
