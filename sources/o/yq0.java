package o;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yq0 extends rf2 {
    public final /* synthetic */ Chip C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq0(Chip chip, Chip chip2) {
        super(chip2);
        this.C = chip;
    }

    @Override // o.rf2
    public final void m(ArrayList arrayList) {
        ar0 ar0Var;
        arrayList.add(0);
        Rect rect = Chip.G;
        Chip chip = this.C;
        if (!chip.d() || (ar0Var = chip.q) == null || !ar0Var.W || chip.t == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // o.rf2
    public final void p(int i, g4 g4Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = g4Var.a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.G);
            return;
        }
        Chip chip = this.C;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        g4Var.b(a4.e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
