package o;

import com.teamviewer.apidefinitions.legacydevices.models.Group;
import com.teamviewer.apidefinitions.legacydevices.models.GroupListResponse;
import com.teamviewer.apidefinitions.legacydevices.models.GroupShareRight;
import com.teamviewer.apidefinitions.legacydevices.models.GroupShareStatus;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v33 extends og7 implements iw2 {
    public boolean m;
    public /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ int f2270o;
    public final /* synthetic */ nx3 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v33(nx3 nx3Var, hc1 hc1Var) {
        super(3, hc1Var);
        this.p = nx3Var;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        v33 v33Var = new v33(this.p, (hc1) obj3);
        v33Var.n = (String) obj;
        v33Var.f2270o = iIntValue;
        return v33Var.invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        Object objV;
        String str = this.n;
        int i = this.f2270o;
        boolean z = this.m;
        if (!z) {
            ct1.a0(obj);
            Integer num = new Integer(i);
            this.n = null;
            this.f2270o = i;
            this.m = true;
            objV = this.p.v(str, num, this);
            ne1 ne1Var = ne1.m;
            if (objV == ne1Var) {
                return ne1Var;
            }
        } else {
            if (!z) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(obj);
            objV = ((tc6) obj).m;
        }
        if (!(objV instanceof sc6)) {
            GroupListResponse groupListResponse = (GroupListResponse) objV;
            List<Group> items = groupListResponse.getItems();
            ArrayList arrayList = new ArrayList(mv0.Z(items, 10));
            for (Group group : items) {
                group.getClass();
                i33 i33Var = new i33(group.getGroupId());
                String name = group.getName();
                boolean z2 = false;
                boolean z3 = group.getShareStatus() == GroupShareStatus.NotShared;
                boolean z4 = group.getShareStatus() == GroupShareStatus.SharedAndOwned;
                boolean z5 = group.getShareStatus() == GroupShareStatus.Shared && (group.getShareRight() == GroupShareRight.ReadWrite || group.getShareRight() == GroupShareRight.FullControl);
                if (z3 || z4 || z5) {
                    z2 = true;
                }
                arrayList.add(new l33(i33Var, name, true, z2));
            }
            objV = new hw7(arrayList, groupListResponse.getNextPaginationToken());
        }
        return new tc6(objV);
    }
}
