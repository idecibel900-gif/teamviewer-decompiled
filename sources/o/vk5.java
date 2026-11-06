package o;

import android.media.AudioManager;
import com.teamviewer.remotecontrolviewlib.activity.PilotSessionActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vk5 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ PilotSessionActivity n;

    public /* synthetic */ vk5(PilotSessionActivity pilotSessionActivity, byte b) {
        this.m = b;
        this.n = pilotSessionActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        PilotSessionActivity pilotSessionActivity = this.n;
        switch (b) {
            case 0:
                int i = PilotSessionActivity.U;
                AudioManager audioManager = (AudioManager) pilotSessionActivity.getSystemService("audio");
                if (audioManager != null) {
                    my.b(audioManager);
                }
                break;
            default:
                int i2 = PilotSessionActivity.U;
                pilotSessionActivity.K();
                break;
        }
        return f88Var;
    }
}
