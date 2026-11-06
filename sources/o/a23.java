package o;

import com.teamviewer.apidefinitions.legacydevices.models.Device;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceListResponse;
import com.teamviewer.apidefinitions.manageddevices.models.GroupListEntry;
import com.teamviewer.apidefinitions.manageddevices.models.GroupListResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a23 extends og7 implements iw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ String f286o;
    public /* synthetic */ int p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a23(Object obj, Object obj2, hc1 hc1Var, byte b) {
        super(3, hc1Var);
        this.m = b;
        this.q = obj;
        this.r = obj2;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj4 = this.r;
        Object obj5 = this.q;
        String str = (String) obj;
        int iIntValue = ((Number) obj2).intValue();
        hc1 hc1Var = (hc1) obj3;
        switch (b) {
            case 0:
                a23 a23Var = new a23((r13) obj5, (j23) obj4, hc1Var, (byte) 0);
                a23Var.f286o = str;
                a23Var.p = iIntValue;
                return a23Var.invokeSuspend(f88Var);
            default:
                a23 a23Var2 = new a23((hl4) obj5, (ll2) obj4, hc1Var, (byte) 1);
                a23Var2.f286o = str;
                a23Var2.p = iIntValue;
                return a23Var2.invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        Object objD;
        Object objK;
        byte b = this.m;
        Object obj2 = this.r;
        Object obj3 = this.q;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                String str = this.f286o;
                int i = this.p;
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    k33 k33Var = ((r13) obj3).a;
                    i33 i33Var = k33Var instanceof i33 ? (i33) k33Var : null;
                    if (i33Var == null) {
                        return new tc6(new sc6(new IllegalStateException("No legacy group selected")));
                    }
                    int i2 = i33Var.m;
                    nx3 nx3Var = ((j23) obj2).b;
                    Integer num = new Integer(i);
                    this.f286o = null;
                    this.p = i;
                    this.n = true;
                    objD = nx3Var.D(i2, str, num, this);
                    if (objD == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objD = ((tc6) obj).m;
                }
                if (!(objD instanceof sc6)) {
                    DeviceListResponse deviceListResponse = (DeviceListResponse) objD;
                    List<Device> items = deviceListResponse.getItems();
                    ArrayList arrayList = new ArrayList(mv0.Z(items, 10));
                    Iterator<T> it = items.iterator();
                    while (it.hasNext()) {
                        arrayList.add(et1.O((Device) it.next()));
                    }
                    objD = new hw7(arrayList, deviceListResponse.getNextPaginationToken());
                }
                return new tc6(objD);
            default:
                String str2 = this.f286o;
                int i3 = this.p;
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    Integer num2 = new Integer(i3);
                    this.f286o = null;
                    this.p = i3;
                    this.n = true;
                    objK = ((xl4) ((hl4) obj3)).k(str2, num2, this);
                    if (objK == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objK = ((tc6) obj).m;
                }
                boolean z3 = objK instanceof sc6;
                ((ll2) obj2).m = z3;
                if (!z3) {
                    GroupListResponse groupListResponse = (GroupListResponse) objK;
                    List<GroupListEntry> items2 = groupListResponse.getItems();
                    ArrayList arrayList2 = new ArrayList(mv0.Z(items2, 10));
                    for (GroupListEntry groupListEntry : items2) {
                        arrayList2.add(new l33(new j33(groupListEntry.getGroupId()), groupListEntry.getDisplayName(), 12));
                    }
                    objK = new hw7(arrayList2, groupListResponse.getNextPaginationToken());
                }
                return new tc6(objK);
        }
    }
}
