package o;

import com.teamviewer.apidefinitions.manageddevices.models.DeviceFilteringModel;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceListEntry;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceListResponse;
import com.teamviewer.apidefinitions.manageddevices.models.FilterPaginationModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b23 extends og7 implements iw2 {
    public final /* synthetic */ byte m = 0;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ String f385o;
    public final /* synthetic */ j23 p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b23(y13 y13Var, j23 j23Var, hc1 hc1Var) {
        super(3, hc1Var);
        this.q = y13Var;
        this.p = j23Var;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        f88 f88Var = f88.a;
        j23 j23Var = this.p;
        Object obj4 = this.q;
        String str = (String) obj;
        ((Number) obj2).intValue();
        hc1 hc1Var = (hc1) obj3;
        switch (b) {
            case 0:
                b23 b23Var = new b23(j23Var, (r13) obj4, hc1Var);
                b23Var.f385o = str;
                return b23Var.invokeSuspend(f88Var);
            default:
                b23 b23Var2 = new b23((y13) obj4, j23Var, hc1Var);
                b23Var2.f385o = str;
                return b23Var2.invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        Object objE;
        Object objH;
        byte b = this.m;
        j23 j23Var = this.p;
        ne1 ne1Var = ne1.m;
        Object obj2 = this.q;
        switch (b) {
            case 0:
                String str = this.f385o;
                byte b2 = this.n;
                if (b2 == 0) {
                    ct1.a0(obj);
                    hl4 hl4Var = j23Var.a;
                    if (str == null) {
                        DeviceFilteringModel deviceFilteringModelE = j23.e(j23Var, (r13) obj2, null, null, 14);
                        this.f385o = null;
                        this.n = (byte) 1;
                        objE = ((xl4) hl4Var).d(deviceFilteringModelE, this);
                        if (objE == ne1Var) {
                            return ne1Var;
                        }
                    } else {
                        FilterPaginationModel filterPaginationModel = new FilterPaginationModel(str, 200, null, 4, null);
                        this.f385o = null;
                        this.n = (byte) 2;
                        objE = ((xl4) hl4Var).e(filterPaginationModel, this);
                        if (objE == ne1Var) {
                            return ne1Var;
                        }
                    }
                } else {
                    if (b2 != 1 && b2 != 2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objE = ((tc6) obj).m;
                }
                if (!(objE instanceof sc6)) {
                    DeviceListResponse deviceListResponse = (DeviceListResponse) objE;
                    List<DeviceListEntry> items = deviceListResponse.getItems();
                    ArrayList arrayList = new ArrayList(mv0.Z(items, 10));
                    Iterator<T> it = items.iterator();
                    while (it.hasNext()) {
                        arrayList.add(et1.P((DeviceListEntry) it.next()));
                    }
                    objE = new hw7(arrayList, deviceListResponse.getNextPaginationToken());
                }
                return new tc6(objE);
            default:
                y13 y13Var = (y13) obj2;
                String str2 = this.f385o;
                byte b3 = this.n;
                if (b3 == 0) {
                    ct1.a0(obj);
                    if (y13Var.b.length() == 0) {
                        objH = new hw7(ea2.m, null);
                    } else if (y13Var.a.a instanceof i33) {
                        this.f385o = null;
                        this.n = (byte) 1;
                        objH = j23Var.f(y13Var, str2, this);
                        if (objH == ne1Var) {
                            return ne1Var;
                        }
                    } else {
                        this.f385o = null;
                        this.n = (byte) 2;
                        objH = j23Var.h(y13Var, str2, this);
                        if (objH == ne1Var) {
                            return ne1Var;
                        }
                    }
                } else {
                    if (b3 != 1 && b3 != 2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objH = ((tc6) obj).m;
                }
                return new tc6(objH);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b23(j23 j23Var, r13 r13Var, hc1 hc1Var) {
        super(3, hc1Var);
        this.p = j23Var;
        this.q = r13Var;
    }
}
