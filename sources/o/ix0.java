package o;

import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import java.util.Comparator;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ix0 implements Comparator {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ ix0(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.m;
        Object obj3 = this.n;
        switch (b) {
            case 0:
                Set set = (Set) obj3;
                return Boolean.valueOf(!lv0.h0(set, bt1.B((l33) obj))).compareTo(Boolean.valueOf(!lv0.h0(set, bt1.B((l33) obj2))));
            case 1:
                oz3 oz3Var = (oz3) obj;
                Function1 function1 = (Function1) obj3;
                oz3Var.getClass();
                String string = function1.invoke(oz3Var).toString();
                oz3 oz3Var2 = (oz3) obj2;
                oz3Var2.getClass();
                return db8.q(string, function1.invoke(oz3Var2).toString());
            case 2:
                int iCompare = ((Comparator) obj3).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                LayoutNode layoutNode = ((fp6) obj).c;
                LayoutNode layoutNode2 = ((fp6) obj2).c;
                return layoutNode.J() == layoutNode2.J() ? im3.t(layoutNode.G(), layoutNode2.G()) : Float.compare(layoutNode.J(), layoutNode2.J());
            case 3:
                int iCompare2 = ((ix0) obj3).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : Integer.valueOf(((fp6) obj).f).compareTo(Integer.valueOf(((fp6) obj2).f));
            case 4:
                int iCompare3 = ((ox0) obj3).compare(obj, obj2);
                return iCompare3 != 0 ? iCompare3 : Integer.valueOf(((SupportSession) obj).getSessioncode()).compareTo(Integer.valueOf(((SupportSession) obj2).getSessioncode()));
            default:
                int iCompare4 = ((dj6) obj3).compare(obj, obj2);
                return iCompare4 != 0 ? iCompare4 : Integer.valueOf(((SupportSession) obj2).getSessioncode()).compareTo(Integer.valueOf(((SupportSession) obj).getSessioncode()));
        }
    }
}
