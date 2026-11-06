package o;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gy0 implements w75 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ my0 b;

    public /* synthetic */ gy0(my0 my0Var, byte b) {
        this.a = b;
        this.b = my0Var;
    }

    @Override // o.w75
    public final void a(Context context) {
        byte b = this.a;
        my0 my0Var = this.b;
        switch (b) {
            case 0:
                context.getClass();
                Bundle bundleX0 = ((a65) my0Var.p.f302o).x0("android:support:activity-result");
                if (bundleX0 != null) {
                    ky0 ky0Var = my0Var.u;
                    LinkedHashMap linkedHashMap = ky0Var.b;
                    LinkedHashMap linkedHashMap2 = ky0Var.a;
                    Bundle bundle = ky0Var.g;
                    ArrayList<Integer> integerArrayList = bundleX0.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleX0.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleX0.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            ky0Var.d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = bundleX0.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i = 0; i < size; i++) {
                            String str = stringArrayList.get(i);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    e8.g(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i);
                            num2.getClass();
                            int iIntValue = num2.intValue();
                            String str2 = stringArrayList.get(i);
                            str2.getClass();
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                            ky0Var.b.put(str3, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
            default:
                wt2 wt2Var = (wt2) ((xt2) my0Var).H.n;
                wt2Var.v.b(wt2Var, wt2Var, null);
                break;
        }
    }
}
