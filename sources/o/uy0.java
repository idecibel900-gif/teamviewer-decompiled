package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class uy0 {
    public final List a;
    public final List b;
    public final List c;
    public List d;
    public List e;
    public final kh7 f;
    public final kh7 g;

    public uy0(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        final byte b = 0;
        this.f = new kh7(new Function0(this) { // from class: o.sy0
            public final /* synthetic */ uy0 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                ea2 ea2Var = ea2.m;
                int i = 0;
                uy0 uy0Var = this.n;
                switch (b2) {
                    case 0:
                        List list6 = uy0Var.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i < size) {
                            qv0.c0(arrayList, (List) ((Function0) list6.get(i)).a());
                            i++;
                        }
                        uy0Var.d = ea2Var;
                        return arrayList;
                    default:
                        List list7 = uy0Var.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i < size2) {
                            qv0.c0(arrayList2, (List) ((Function0) list7.get(i)).a());
                            i++;
                        }
                        uy0Var.e = ea2Var;
                        return arrayList2;
                }
            }
        });
        final byte b2 = 1;
        this.g = new kh7(new Function0(this) { // from class: o.sy0
            public final /* synthetic */ uy0 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                ea2 ea2Var = ea2.m;
                int i = 0;
                uy0 uy0Var = this.n;
                switch (b3) {
                    case 0:
                        List list6 = uy0Var.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i < size) {
                            qv0.c0(arrayList, (List) ((Function0) list6.get(i)).a());
                            i++;
                        }
                        uy0Var.d = ea2Var;
                        return arrayList;
                    default:
                        List list7 = uy0Var.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i < size2) {
                            qv0.c0(arrayList2, (List) ((Function0) list7.get(i)).a());
                            i++;
                        }
                        uy0Var.e = ea2Var;
                        return arrayList2;
                }
            }
        });
    }
}
