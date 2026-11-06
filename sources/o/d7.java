package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.lifecycle.LiveData;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class d7 extends BaseAdapter {
    public final /* synthetic */ byte m = 1;
    public final gv2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f591o;

    public d7(n16 n16Var, gv2 gv2Var) {
        this.n = gv2Var;
        ArrayList arrayList = n16Var.q;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (im3.n(((e26) obj).d.getValue(), Boolean.TRUE)) {
                arrayList2.add(obj);
            }
        }
        this.f591o = arrayList2;
        nw4 nw4Var = new nw4(arrayList);
        nm nmVar = new nm(2);
        nmVar.g(nw4Var);
        nmVar.i(new LiveData[0]);
        ArrayList arrayList3 = nmVar.a;
        LiveData[] liveDataArr = (LiveData[]) arrayList3.toArray(new LiveData[arrayList3.size()]);
        lo4 lo4Var = new lo4();
        c7 c7Var = new c7(lo4Var, liveDataArr, (byte) 3);
        c7Var.a();
        for (LiveData liveData : liveDataArr) {
            lo4Var.b(liveData, new a7(new t(c7Var, (byte) 26), (byte) 7));
        }
        lo4Var.observe(this.n, new b7(new o43(this, arrayList, (byte) 24), (byte) 22));
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        switch (this.m) {
            case 0:
                break;
        }
        return this.f591o.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        switch (this.m) {
            case 0:
                return (hc3) this.f591o.get(i);
            default:
                return (e26) this.f591o.get(i);
        }
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        int id;
        switch (this.m) {
            case 0:
                id = ((hc3) this.f591o.get(i)).getId();
                break;
            default:
                id = ((e26) this.f591o.get(i)).a;
                break;
        }
        return id;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        switch (this.m) {
            case 0:
                hc3 hc3Var = (hc3) this.f591o.get(i);
                if (hc3Var != null) {
                    if (hc3Var instanceof g26) {
                        return 2;
                    }
                    if (hc3Var instanceof f26) {
                        return 1;
                    }
                    if (hc3Var instanceof tc3) {
                        return 0;
                    }
                }
                return super.getItemViewType(i);
            default:
                return super.getItemViewType(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x010a  */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        e26 e26Var;
        byte b = this.m;
        final byte b2 = 1;
        gv2 gv2Var = this.n;
        final byte b3 = 0;
        viewGroup.getClass();
        switch (b) {
            case 0:
                if (view == null) {
                    hc3 hc3Var = (hc3) this.f591o.get(i);
                    if (hc3Var == null) {
                        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.quickaction_item_separator, viewGroup, false);
                    } else if (hc3Var instanceof g26) {
                        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.quickaction_item_switch, viewGroup, false);
                        View viewFindViewById = view.findViewById(R.id.list_item_dialog_switch_text);
                        viewFindViewById.getClass();
                        View viewFindViewById2 = view.findViewById(R.id.list_item_dialog_switch_icon);
                        viewFindViewById2.getClass();
                        view.setTag(new z6((TextView) viewFindViewById, (ImageView) viewFindViewById2, (SwitchCompat) view.findViewById(R.id.quick_action_switch_button), (TextView) view.findViewById(R.id.list_item_dialog_description)));
                    } else if (hc3Var instanceof f26) {
                        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.quickaction_item_button, viewGroup, false);
                        View viewFindViewById3 = view.findViewById(R.id.list_item_dialog_button_text);
                        viewFindViewById3.getClass();
                        View viewFindViewById4 = view.findViewById(R.id.list_item_dialog_button_icon);
                        viewFindViewById4.getClass();
                        view.setTag(new z6((TextView) viewFindViewById3, (ImageView) viewFindViewById4, null, null));
                    } else {
                        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.quickaction_item_separator, viewGroup, false);
                    }
                }
                view.getClass();
                Object tag = view.getTag();
                final z6 z6Var = tag instanceof z6 ? (z6) tag : null;
                if (z6Var != null) {
                    Object obj = this.f591o.get(i);
                    f26 f26Var = obj instanceof f26 ? (f26) obj : null;
                    if (f26Var != null) {
                        nw4 nw4Var = f26Var.c;
                        nw4 nw4Var2 = f26Var.b;
                        nw4Var2.removeObservers(gv2Var);
                        nw4Var2.observe(gv2Var, new b7(new Function1() { // from class: o.x6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                byte b4 = b3;
                                f88 f88Var = f88.a;
                                z6 z6Var2 = z6Var;
                                switch (b4) {
                                    case 0:
                                        Integer num = (Integer) obj2;
                                        TextView textView = z6Var2.a;
                                        num.getClass();
                                        textView.setText(num.intValue());
                                        break;
                                    case 1:
                                        Integer num2 = (Integer) obj2;
                                        ImageView imageView = z6Var2.b;
                                        num2.getClass();
                                        imageView.setImageResource(num2.intValue());
                                        break;
                                    case 2:
                                        Boolean bool = (Boolean) obj2;
                                        SwitchCompat switchCompat = z6Var2.c;
                                        if (switchCompat != null) {
                                            bool.getClass();
                                            switchCompat.setChecked(bool.booleanValue());
                                        }
                                        break;
                                    default:
                                        Integer num3 = (Integer) obj2;
                                        TextView textView2 = z6Var2.d;
                                        if (textView2 != null) {
                                            num3.getClass();
                                            textView2.setText(num3.intValue());
                                        }
                                        break;
                                }
                                return f88Var;
                            }
                        }, b3));
                        nw4Var.removeObservers(gv2Var);
                        nw4Var.observe(gv2Var, new b7(new Function1() { // from class: o.x6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                byte b4 = b2;
                                f88 f88Var = f88.a;
                                z6 z6Var2 = z6Var;
                                switch (b4) {
                                    case 0:
                                        Integer num = (Integer) obj2;
                                        TextView textView = z6Var2.a;
                                        num.getClass();
                                        textView.setText(num.intValue());
                                        break;
                                    case 1:
                                        Integer num2 = (Integer) obj2;
                                        ImageView imageView = z6Var2.b;
                                        num2.getClass();
                                        imageView.setImageResource(num2.intValue());
                                        break;
                                    case 2:
                                        Boolean bool = (Boolean) obj2;
                                        SwitchCompat switchCompat = z6Var2.c;
                                        if (switchCompat != null) {
                                            bool.getClass();
                                            switchCompat.setChecked(bool.booleanValue());
                                        }
                                        break;
                                    default:
                                        Integer num3 = (Integer) obj2;
                                        TextView textView2 = z6Var2.d;
                                        if (textView2 != null) {
                                            num3.getClass();
                                            textView2.setText(num3.intValue());
                                        }
                                        break;
                                }
                                return f88Var;
                            }
                        }, b3));
                        if (f26Var instanceof g26) {
                            g26 g26Var = (g26) f26Var;
                            LiveData liveData = g26Var.h;
                            LiveData liveData2 = g26Var.g;
                            liveData2.removeObservers(gv2Var);
                            final byte b4 = 2;
                            liveData2.observe(gv2Var, new b7(new Function1() { // from class: o.x6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    byte b5 = b4;
                                    f88 f88Var = f88.a;
                                    z6 z6Var2 = z6Var;
                                    switch (b5) {
                                        case 0:
                                            Integer num = (Integer) obj2;
                                            TextView textView = z6Var2.a;
                                            num.getClass();
                                            textView.setText(num.intValue());
                                            break;
                                        case 1:
                                            Integer num2 = (Integer) obj2;
                                            ImageView imageView = z6Var2.b;
                                            num2.getClass();
                                            imageView.setImageResource(num2.intValue());
                                            break;
                                        case 2:
                                            Boolean bool = (Boolean) obj2;
                                            SwitchCompat switchCompat = z6Var2.c;
                                            if (switchCompat != null) {
                                                bool.getClass();
                                                switchCompat.setChecked(bool.booleanValue());
                                            }
                                            break;
                                        default:
                                            Integer num3 = (Integer) obj2;
                                            TextView textView2 = z6Var2.d;
                                            if (textView2 != null) {
                                                num3.getClass();
                                                textView2.setText(num3.intValue());
                                            }
                                            break;
                                    }
                                    return f88Var;
                                }
                            }, b3));
                            SwitchCompat switchCompat = z6Var.c;
                            if (switchCompat != null) {
                                switchCompat.setOnClickListener(new y6(g26Var, z6Var, b3));
                            }
                            if (liveData != null) {
                                liveData.removeObservers(gv2Var);
                            }
                            if (liveData != null) {
                                final byte b5 = 3;
                                liveData.observe(gv2Var, new b7(new Function1() { // from class: o.x6
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b6 = b5;
                                        f88 f88Var = f88.a;
                                        z6 z6Var2 = z6Var;
                                        switch (b6) {
                                            case 0:
                                                Integer num = (Integer) obj2;
                                                TextView textView = z6Var2.a;
                                                num.getClass();
                                                textView.setText(num.intValue());
                                                break;
                                            case 1:
                                                Integer num2 = (Integer) obj2;
                                                ImageView imageView = z6Var2.b;
                                                num2.getClass();
                                                imageView.setImageResource(num2.intValue());
                                                break;
                                            case 2:
                                                Boolean bool = (Boolean) obj2;
                                                SwitchCompat switchCompat2 = z6Var2.c;
                                                if (switchCompat2 != null) {
                                                    bool.getClass();
                                                    switchCompat2.setChecked(bool.booleanValue());
                                                }
                                                break;
                                            default:
                                                Integer num3 = (Integer) obj2;
                                                TextView textView2 = z6Var2.d;
                                                if (textView2 != null) {
                                                    num3.getClass();
                                                    textView2.setText(num3.intValue());
                                                }
                                                break;
                                        }
                                        return f88Var;
                                    }
                                }, b3));
                            }
                        }
                    }
                }
                break;
            default:
                if (view == null) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.predefined_shortcut_item_button, viewGroup, false);
                    View viewFindViewById5 = view.findViewById(R.id.predefined_text);
                    viewFindViewById5.getClass();
                    View viewFindViewById6 = view.findViewById(R.id.predefined_icon);
                    viewFindViewById6.getClass();
                    view.setTag(new bq5((TextView) viewFindViewById5, (ImageView) viewFindViewById6));
                }
                Object tag2 = view.getTag();
                final bq5 bq5Var = tag2 instanceof bq5 ? (bq5) tag2 : null;
                if (bq5Var != null && (e26Var = (e26) this.f591o.get(i)) != null) {
                    nw4 nw4Var3 = e26Var.c;
                    nw4 nw4Var4 = e26Var.b;
                    Function1 function1 = new Function1() { // from class: o.aq5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            byte b6 = b3;
                            f88 f88Var = f88.a;
                            bq5 bq5Var2 = bq5Var;
                            Integer num = (Integer) obj2;
                            switch (b6) {
                                case 0:
                                    TextView textView = bq5Var2.a;
                                    num.getClass();
                                    textView.setText(num.intValue());
                                    break;
                                default:
                                    ImageView imageView = bq5Var2.b;
                                    num.getClass();
                                    imageView.setImageResource(num.intValue());
                                    break;
                            }
                            return f88Var;
                        }
                    };
                    byte b6 = 22;
                    nw4Var4.observe(gv2Var, new b7(function1, b6));
                    nw4Var3.removeObservers(gv2Var);
                    nw4Var3.observe(gv2Var, new b7(new Function1() { // from class: o.aq5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            byte b7 = b2;
                            f88 f88Var = f88.a;
                            bq5 bq5Var2 = bq5Var;
                            Integer num = (Integer) obj2;
                            switch (b7) {
                                case 0:
                                    TextView textView = bq5Var2.a;
                                    num.getClass();
                                    textView.setText(num.intValue());
                                    break;
                                default:
                                    ImageView imageView = bq5Var2.b;
                                    num.getClass();
                                    imageView.setImageResource(num.intValue());
                                    break;
                            }
                            return f88Var;
                        }
                    }, b6));
                }
                break;
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        switch (this.m) {
            case 0:
                Boolean bool = (Boolean) ((hc3) this.f591o.get(i)).c().getValue();
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            default:
                Boolean bool2 = (Boolean) ((e26) this.f591o.get(i)).e.getValue();
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return false;
        }
    }

    public d7(tc3 tc3Var, gv2 gv2Var) {
        byte b = 0;
        this.n = gv2Var;
        ArrayList arrayListR = tc3Var.r();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListR) {
            if (im3.n(((hc3) obj).a().getValue(), Boolean.TRUE)) {
                arrayList.add(obj);
            }
        }
        this.f591o = arrayList;
        nw4 nw4Var = new nw4(arrayListR);
        nm nmVar = new nm(2);
        nmVar.g(nw4Var);
        nmVar.i(new LiveData[0]);
        ArrayList arrayList2 = nmVar.a;
        LiveData[] liveDataArr = (LiveData[]) arrayList2.toArray(new LiveData[arrayList2.size()]);
        lo4 lo4Var = new lo4();
        c7 c7Var = new c7(lo4Var, liveDataArr, b);
        c7Var.a();
        for (LiveData liveData : liveDataArr) {
            lo4Var.b(liveData, new a7(new t(c7Var, (byte) 6), b));
        }
        lo4Var.observe(this.n, new b7(new g0(this, arrayListR, (byte) 1), b));
    }
}
