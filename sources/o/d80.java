package o;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d80 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Context n;

    public /* synthetic */ d80(Context context, byte b) {
        this.m = b;
        this.n = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        Context context = this.n;
        switch (b) {
            case 0:
                context.getClass();
                Object systemService = context.getSystemService("audio");
                systemService.getClass();
                AudioDeviceInfo audioDeviceInfoA = my.a((AudioManager) systemService);
                if (audioDeviceInfoA == null) {
                    return null;
                }
                String string = audioDeviceInfoA.getProductName().toString();
                String address = Build.VERSION.SDK_INT >= 28 ? audioDeviceInfoA.getAddress() : String.valueOf(audioDeviceInfoA.getId());
                address.getClass();
                return new b80(string, address);
            case 1:
                zu1.E(context);
                return f88Var;
            case 2:
                zu1.D(context);
                return f88Var;
            case 3:
                zu1.E(context);
                return f88Var;
            case 4:
                zu1.D(context);
                return f88Var;
            default:
                String string2 = context.getString(R.string.legal_agreement_privacy_policy_url);
                string2.getClass();
                Uri uri = Uri.parse(string2);
                uri.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uri);
                intent.addFlags(268435456);
                try {
                    context.startActivity(intent);
                    break;
                } catch (ActivityNotFoundException unused) {
                }
                return f88Var;
        }
    }
}
