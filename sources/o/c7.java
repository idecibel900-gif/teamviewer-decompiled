package o;

import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class c7 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ lo4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ LiveData[] f495o;

    public /* synthetic */ c7(lo4 lo4Var, LiveData[] liveDataArr, byte b) {
        this.m = b;
        this.n = lo4Var;
        this.f495o = liveDataArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        i3 i3Var = i3.Allowed;
        i3 i3Var2 = i3.AfterConfirmation;
        f88 f88Var = f88.a;
        z = false;
        boolean z = false;
        LiveData[] liveDataArr = this.f495o;
        lo4 lo4Var = this.n;
        boolean zBooleanValue = true;
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList(liveDataArr.length);
                for (LiveData liveData : liveDataArr) {
                    arrayList.add((List) liveData.getValue());
                }
                lo4Var.setValue((List[]) arrayList.toArray(new List[0]));
                return f88Var;
            case 1:
                ArrayList arrayList2 = new ArrayList(liveDataArr.length);
                for (LiveData liveData2 : liveDataArr) {
                    Object value = liveData2.getValue();
                    if (value == null) {
                        yq4.l("null cannot be cast to non-null type kotlin.Boolean");
                        return null;
                    }
                    arrayList2.add((Boolean) value);
                }
                for (Boolean bool : (Boolean[]) arrayList2.toArray(new Boolean[0])) {
                    zBooleanValue &= bool.booleanValue();
                }
                lo4Var.setValue(Boolean.valueOf(zBooleanValue));
                return f88Var;
            case 2:
                ArrayList arrayList3 = new ArrayList(liveDataArr.length);
                for (LiveData liveData3 : liveDataArr) {
                    Object value2 = liveData3.getValue();
                    if (value2 == null) {
                        yq4.l("null cannot be cast to non-null type kotlin.Boolean");
                        return null;
                    }
                    arrayList3.add((Boolean) value2);
                }
                boolean zBooleanValue2 = false;
                for (Boolean bool2 : (Boolean[]) arrayList3.toArray(new Boolean[0])) {
                    zBooleanValue2 |= bool2.booleanValue();
                }
                lo4Var.setValue(Boolean.valueOf(zBooleanValue2));
                return f88Var;
            case 3:
                ArrayList arrayList4 = new ArrayList(liveDataArr.length);
                for (LiveData liveData4 : liveDataArr) {
                    arrayList4.add((List) liveData4.getValue());
                }
                lo4Var.setValue((List[]) arrayList4.toArray(new List[0]));
                return f88Var;
            case 4:
                ArrayList arrayList5 = new ArrayList(liveDataArr.length);
                for (LiveData liveData5 : liveDataArr) {
                    Object value3 = liveData5.getValue();
                    if (value3 == null) {
                        yq4.l("null cannot be cast to non-null type com.teamviewer.teamviewerlib.session.settings.Access");
                        return null;
                    }
                    arrayList5.add((i3) value3);
                }
                lo4Var.setValue(Boolean.valueOf(us1.C(((i3[]) arrayList5.toArray(new i3[0]))[0], i3Var2)));
                return f88Var;
            case 5:
                ArrayList arrayList6 = new ArrayList(liveDataArr.length);
                for (LiveData liveData6 : liveDataArr) {
                    Object value4 = liveData6.getValue();
                    if (value4 == null) {
                        yq4.l("null cannot be cast to non-null type com.teamviewer.teamviewerlib.session.settings.Access");
                        return null;
                    }
                    arrayList6.add((i3) value4);
                }
                lo4Var.setValue(Boolean.valueOf(us1.C(((i3[]) arrayList6.toArray(new i3[0]))[0], i3Var, i3Var2)));
                return f88Var;
            case 6:
                ArrayList arrayList7 = new ArrayList(liveDataArr.length);
                for (LiveData liveData7 : liveDataArr) {
                    Object value5 = liveData7.getValue();
                    if (value5 == null) {
                        yq4.l("null cannot be cast to non-null type kotlin.Boolean");
                        return null;
                    }
                    arrayList7.add((Boolean) value5);
                }
                Boolean[] boolArr = (Boolean[]) arrayList7.toArray(new Boolean[0]);
                if (boolArr[0].booleanValue() && boolArr[1].booleanValue()) {
                    z = true;
                }
                lo4Var.setValue(Boolean.valueOf(z));
                return f88Var;
            case 7:
                ArrayList arrayList8 = new ArrayList(liveDataArr.length);
                for (LiveData liveData8 : liveDataArr) {
                    Object value6 = liveData8.getValue();
                    if (value6 == null) {
                        yq4.l("null cannot be cast to non-null type com.teamviewer.teamviewerlib.session.settings.Access");
                        return null;
                    }
                    arrayList8.add((i3) value6);
                }
                lo4Var.setValue(Boolean.valueOf(us1.C(((i3[]) arrayList8.toArray(new i3[0]))[0], i3Var, i3Var2)));
                return f88Var;
            default:
                ArrayList arrayList9 = new ArrayList(liveDataArr.length);
                for (LiveData liveData9 : liveDataArr) {
                    arrayList9.add((Integer) liveData9.getValue());
                }
                Integer[] numArr = (Integer[]) arrayList9.toArray(new Integer[0]);
                Integer num = numArr[0];
                if (num == null) {
                    num = numArr[1];
                }
                num.getClass();
                lo4Var.setValue(Integer.valueOf(num.intValue()));
                return f88Var;
        }
    }
}
