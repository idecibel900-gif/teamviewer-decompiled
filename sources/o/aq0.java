package o;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.material.chip.ChipGroup;

/* JADX INFO: loaded from: classes.dex */
public final class aq0 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aq0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((CheckBoxPreference) obj).y(z);
                break;
            case 1:
                ChipGroup chipGroup = (ChipGroup) obj;
                if (!chipGroup.y) {
                    if (chipGroup.getCheckedChipIds().isEmpty() && chipGroup.t) {
                        chipGroup.d(compoundButton.getId(), true);
                        chipGroup.c(compoundButton.getId(), false);
                    } else {
                        int id = compoundButton.getId();
                        int i = chipGroup.x;
                        if (z) {
                            if (i != -1 && i != id && chipGroup.s) {
                                chipGroup.d(i, false);
                            }
                            chipGroup.setCheckedId(id);
                        } else if (i == id) {
                            chipGroup.setCheckedId(-1);
                        }
                    }
                    break;
                }
                break;
            case 2:
                ((SwitchPreference) obj).y(z);
                break;
            default:
                ((SwitchPreferenceCompat) obj).y(z);
                break;
        }
    }
}
