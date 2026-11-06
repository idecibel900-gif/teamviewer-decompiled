package o;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class om0 extends Property {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ om0(Class cls, String str, byte b) {
        super(cls, str);
        this.a = b;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((SwitchCompat) obj).L);
            case 6:
                return Float.valueOf(of8.a.i((View) obj));
            default:
                WeakHashMap weakHashMap = be8.a;
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                rm0 rm0Var = (rm0) obj;
                PointF pointF = (PointF) obj2;
                rm0Var.getClass();
                rm0Var.a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                rm0Var.b = iRound;
                int i = rm0Var.f + 1;
                rm0Var.f = i;
                if (i == rm0Var.g) {
                    of8.a(rm0Var.e, rm0Var.a, iRound, rm0Var.c, rm0Var.d);
                    rm0Var.f = 0;
                    rm0Var.g = 0;
                }
                break;
            case 1:
                rm0 rm0Var2 = (rm0) obj;
                PointF pointF2 = (PointF) obj2;
                rm0Var2.getClass();
                rm0Var2.c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                rm0Var2.d = iRound2;
                int i2 = rm0Var2.g + 1;
                rm0Var2.g = i2;
                if (rm0Var2.f == i2) {
                    of8.a(rm0Var2.e, rm0Var2.a, rm0Var2.b, rm0Var2.c, iRound2);
                    rm0Var2.f = 0;
                    rm0Var2.g = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                of8.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                of8.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                of8.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 6:
                float fFloatValue = ((Float) obj2).floatValue();
                of8.a.n((View) obj, fFloatValue);
                break;
            default:
                WeakHashMap weakHashMap = be8.a;
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
