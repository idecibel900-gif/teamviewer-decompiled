package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.teamviewer.remotecontrollib.swig.NearbyDevicesDyngateIds;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ea extends BaseExpandableListAdapter {
    public final ExpandableListView a;
    public final List b;
    public final iw2 c;
    public final hw2 d;
    public final ArrayList e;
    public final ArrayList f;

    public ea(ExpandableListView expandableListView, List list, b9 b9Var, t0 t0Var) {
        expandableListView.getClass();
        b9Var.getClass();
        t0Var.getClass();
        this.a = expandableListView;
        this.b = list;
        this.c = b9Var;
        this.d = t0Var;
        this.e = new ArrayList();
        this.f = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vd5 vd5Var = (vd5) it.next();
            ArrayList arrayList = this.e;
            String str = ((o15) vd5Var.m).c;
            str.getClass();
            arrayList.add(str);
            Iterable iterable = (Iterable) vd5Var.n;
            ArrayList arrayList2 = new ArrayList(mv0.Z(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                String str2 = ((o15) it2.next()).c;
                str2.getClass();
                arrayList2.add(str2);
            }
            this.f.add(new ArrayList(arrayList2));
        }
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getChild(int i, int i2) {
        return (String) ((List) this.f.get(i)).get(i2);
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getChildId(int i, int i2) {
        return i2;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getChildView(final int i, final int i2, boolean z, View view, ViewGroup viewGroup) {
        DyngateID dyngateIDInvalidDyngateID;
        int i3;
        Context context;
        if (view == null) {
            Object systemService = (viewGroup == null || (context = viewGroup.getContext()) == null) ? null : context.getSystemService("layout_inflater");
            systemService.getClass();
            view = ((LayoutInflater) systemService).inflate(R.layout.dialog_add_nearby_devices_dropdown_group_item_body, (ViewGroup) null);
        }
        TextView textView = view != null ? (TextView) view.findViewById(R.id.nearby_device_name) : null;
        if (textView != null) {
            textView.setText((String) ((List) this.f.get(i)).get(i2));
        }
        ImageButton imageButton = view != null ? (ImageButton) view.findViewById(R.id.nearby_add_btn) : null;
        final boolean z2 = i == 0;
        int i4 = z2 ? R.drawable.ic_nearby_plus : R.drawable.ic_nearby_added;
        if (imageButton != null) {
            imageButton.setImageResource(i4);
        }
        final o15 o15Var = (o15) ((List) ((vd5) this.b.get(i)).n).get(i2);
        NearbyDevicesDyngateIds nearbyDevicesDyngateIds = o15Var.f;
        if (nearbyDevicesDyngateIds == null || (dyngateIDInvalidDyngateID = (DyngateID) lv0.o0(nearbyDevicesDyngateIds)) == null) {
            dyngateIDInvalidDyngateID = DyngateID.InvalidDyngateID();
            dyngateIDInvalidDyngateID.getClass();
        }
        final DyngateID dyngateID = dyngateIDInvalidDyngateID;
        if (imageButton != null) {
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: o.ca
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    long j = o15Var.e;
                    ea eaVar = this;
                    boolean z3 = z2;
                    if (j > 0) {
                        eaVar.d.invoke(Long.valueOf(j), Boolean.valueOf(z3));
                        return;
                    }
                    eaVar.c.d(dyngateID, (String) ((List) eaVar.f.get(i)).get(i2), Boolean.valueOf(z3));
                }
            });
        }
        ImageView imageView = view != null ? (ImageView) view.findViewById(R.id.nearby_device_status_icon) : null;
        if (imageView != null) {
            bc3 bc3Var = o15Var.g;
            int i5 = bc3Var == null ? -1 : n15.a[bc3Var.ordinal()];
            if (i5 == 1) {
                i3 = R.drawable.online_indicator;
            } else if (i5 != 2) {
                i3 = i5 != 3 ? R.drawable.offline_indicator : R.drawable.busy_indicator;
            } else {
                i3 = R.drawable.away_indicator;
            }
            imageView.setImageResource(i3);
        }
        ImageView imageView2 = view != null ? (ImageView) view.findViewById(R.id.device_avatar_image) : null;
        if (imageView2 != null) {
            cc3 cc3Var = o15Var.h;
            imageView2.setImageResource((cc3Var != null ? n15.b[cc3Var.ordinal()] : -1) != 1 ? R.drawable.user_placeholder_image : R.drawable.device_icon);
        }
        if (imageView2 != null) {
            String str = o15Var.d;
            str.getClass();
            Context context2 = imageView2.getContext();
            context2.getClass();
            if (str.length() > 0) {
                String strL = bc7.L(str, "[size]", "64");
                ge3 ge3Var = new ge3(context2);
                ge3Var.c = strL;
                ge3Var.d = new cj3(context2, imageView2, (byte) 8);
                s07.a(context2).a(ge3Var.a());
            }
        }
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getChildrenCount(int i) {
        return ((List) this.f.get(i)).size();
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getGroup(int i) {
        return (o15) ((vd5) this.b.get(i)).m;
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getGroupCount() {
        return this.e.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getGroupId(int i) {
        return i;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        Context context;
        if (view == null) {
            Object systemService = (viewGroup == null || (context = viewGroup.getContext()) == null) ? null : context.getSystemService("layout_inflater");
            systemService.getClass();
            view = ((LayoutInflater) systemService).inflate(R.layout.dialog_nearby_devices_dropdown_group_item_header, (ViewGroup) null);
        }
        TextView textView = view != null ? (TextView) view.findViewById(R.id.nearby_group_title) : null;
        ImageView imageView = view != null ? (ImageView) view.findViewById(R.id.nearby_expandable_list_indicator) : null;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        if (textView != null) {
            String str = ((o15) ((vd5) this.b.get(i)).m).c;
            str.getClass();
            textView.setText(str);
        }
        if (textView != null) {
            textView.setOnClickListener(new da((byte) 0, i, this));
        }
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }
}
