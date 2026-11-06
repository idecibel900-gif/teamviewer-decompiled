package o;

import com.teamviewer.remotecontrolviewmodellib.swig.ToolbarButtonState;
import com.teamviewer.remotecontrolviewmodellib.swig.ToolbarButtonStateSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.ToolbarClientButtonStateSignalCallbackImpl;

/* JADX INFO: loaded from: classes.dex */
public final class bl5 extends ToolbarClientButtonStateSignalCallbackImpl {
    public final /* synthetic */ cl5 a;

    public bl5(cl5 cl5Var) {
        this.a = cl5Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083 A[LOOP:0: B:10:0x0021->B:32:0x0083, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0029 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    @Override // com.teamviewer.remotecontrolviewmodellib.swig.ToolbarClientButtonStateSignalCallback
    public final void OnCallback(ToolbarButtonState toolbarButtonState) {
        int length;
        int i;
        tg0 tg0Var;
        tg0 tg0Var2;
        oz7 oz7Var;
        if (toolbarButtonState != null) {
            int iToolbarButtonState_id_get = ToolbarButtonStateSWIGJNI.ToolbarButtonState_id_get(toolbarButtonState.a, toolbarButtonState);
            tg0[] tg0VarArr = tg0.n;
            tg0[] tg0VarArr2 = (tg0[]) tg0.class.getEnumConstants();
            if (iToolbarButtonState_id_get >= tg0VarArr2.length || iToolbarButtonState_id_get < 0) {
                length = tg0VarArr2.length;
                i = 0;
                while (true) {
                    if (i < length) {
                        hk0.g(ua5.k(iToolbarButtonState_id_get, tg0.class, "No enum ", " with value "));
                        return;
                    }
                    tg0Var = tg0VarArr2[i];
                    if (tg0Var.m == iToolbarButtonState_id_get) {
                        tg0Var2 = tg0Var;
                        break;
                    }
                    i++;
                }
            } else {
                tg0Var2 = tg0VarArr2[iToolbarButtonState_id_get];
                if (tg0Var2.m != iToolbarButtonState_id_get) {
                    length = tg0VarArr2.length;
                    i = 0;
                    while (true) {
                        if (i < length) {
                            hk0.g(ua5.k(iToolbarButtonState_id_get, tg0.class, "No enum ", " with value "));
                            return;
                        }
                        tg0Var = tg0VarArr2[i];
                        if (tg0Var.m == iToolbarButtonState_id_get) {
                            tg0Var2 = tg0Var;
                            break;
                        }
                        i++;
                    }
                }
            }
            int iOrdinal = tg0Var2.ordinal();
            cl5 cl5Var = this.a;
            if (iOrdinal == 0) {
                oz7Var = (oz7) cl5Var.W0(0);
            } else if (iOrdinal == 2) {
                oz7Var = (oz7) cl5Var.W0(4);
            } else if (iOrdinal == 3) {
                oz7Var = (oz7) cl5Var.W0(3);
            } else if (iOrdinal != 4) {
                oz7Var = iOrdinal != 5 ? null : (oz7) cl5Var.W0(2);
            } else {
                oz7Var = (oz7) cl5Var.W0(5);
            }
            if (oz7Var != null) {
                oz7Var.d.setValue(Boolean.valueOf(ToolbarButtonStateSWIGJNI.ToolbarButtonState_visible_get(toolbarButtonState.a, toolbarButtonState)));
                oz7Var.e.setValue(Boolean.valueOf(ToolbarButtonStateSWIGJNI.ToolbarButtonState_enabled_get(toolbarButtonState.a, toolbarButtonState)));
            }
        }
    }
}
