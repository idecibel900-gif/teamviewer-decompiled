package o;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.teamviewer.remotecontrolviewlib.view.session.RcSessionBottomToolbarView;
import com.teamviewer.remotecontrolviewlib.view.session.RcSessionExtraToolbarView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q16 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ImageView n;

    public /* synthetic */ q16(ImageView imageView, byte b) {
        this.m = b;
        this.n = imageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string;
        byte b = this.m;
        f88 f88Var = f88.a;
        ImageView imageView = this.n;
        switch (b) {
            case 0:
                int i = RcSessionBottomToolbarView.s;
                imageView.setImageDrawable((Drawable) obj);
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                int i2 = RcSessionBottomToolbarView.s;
                bool.getClass();
                imageView.setEnabled(bool.booleanValue());
                break;
            case 2:
                Integer num = (Integer) obj;
                int i3 = RcSessionBottomToolbarView.s;
                num.getClass();
                int iIntValue = num.intValue();
                string = iIntValue != 0 ? imageView.getContext().getString(iIntValue) : "";
                string.getClass();
                imageView.setTooltipText(string);
                imageView.setContentDescription(string);
                break;
            case 3:
                int i4 = RcSessionExtraToolbarView.n;
                imageView.setImageDrawable((Drawable) obj);
                break;
            case 4:
                Boolean bool2 = (Boolean) obj;
                int i5 = RcSessionExtraToolbarView.n;
                bool2.getClass();
                imageView.setEnabled(bool2.booleanValue());
                break;
            default:
                Integer num2 = (Integer) obj;
                int i6 = RcSessionExtraToolbarView.n;
                num2.getClass();
                int iIntValue2 = num2.intValue();
                string = iIntValue2 != 0 ? imageView.getContext().getString(iIntValue2) : "";
                string.getClass();
                imageView.setTooltipText(string);
                imageView.setContentDescription(string);
                break;
        }
        return f88Var;
    }
}
