package o;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.settings.Settings;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sj4 {
    public static Intent a(Context context, String str, String str2, Uri uri, String... strArr) {
        List<ResolveInfo> listQueryIntentActivities;
        Intent intent = new Intent("android.intent.action.SENDTO");
        Uri uri2 = Uri.parse("mailto:");
        uri2.getClass();
        intent.setData(uri2);
        intent.putExtra("android.intent.extra.EMAIL", strArr);
        intent.putExtra("android.intent.extra.SUBJECT", str);
        intent.putExtra("android.intent.extra.TEXT", str2);
        if (uri != null) {
            context.getClass();
            intent.addFlags(1);
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(65536L));
                    listQueryIntentActivities.getClass();
                } else {
                    listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
                    listQueryIntentActivities.getClass();
                }
                Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
                while (it.hasNext()) {
                    context.grantUriPermission(it.next().activityInfo.packageName, uri, 1);
                }
            } catch (ActivityNotFoundException unused) {
                ye4.a("FileManager", "Could not query activity for this intent");
            }
            intent.putExtra("android.intent.extra.STREAM", uri);
        }
        return intent;
    }

    public static Intent b(Context context) {
        context.getClass();
        ye4.a("MailHelper", "Create crash log mail intent.");
        Settings.i.n();
        String string = Settings.e().toString();
        string.getClass();
        String string2 = context.getString(R.string.tv_options_CrashLogDefaultReceiver);
        string2.getClass();
        String string3 = context.getString(R.string.tv_options_CrashLogDefaultSubject);
        String str = n37.f;
        if (str == null) {
            im3.e0("versionString");
            throw null;
        }
        String str2 = string3 + " (" + string + ") Build: " + str;
        String string4 = context.getString(R.string.tv_options_CrashLogDefaultText);
        string4.getClass();
        return a(context, str2, string4, yl7.m(context, "crashlog.zip"), string2);
    }
}
