package o;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o55 {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public io.sentry.l6 l;
    public Bundle n;
    public RemoteViews q;
    public RemoteViews r;
    public String s;
    public long t;
    public final boolean u;
    public final Notification v;
    public final ArrayList w;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean k = true;
    public boolean m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1632o = 0;
    public int p = 0;

    public o55(Context context, String str) {
        Notification notification = new Notification();
        this.v = notification;
        this.a = context;
        this.s = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.w = new ArrayList();
        this.u = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void a(k55 k55Var) {
        this.b.add(k55Var);
    }

    public final Notification b() {
        Bundle bundle;
        j93 j93Var = new j93(this);
        o55 o55Var = (o55) j93Var.p;
        io.sentry.l6 l6Var = o55Var.l;
        if (l6Var != null) {
            l6Var.d(j93Var);
        }
        Notification notificationBuild = ((Notification.Builder) j93Var.f1141o).build();
        RemoteViews remoteViews = o55Var.q;
        if (remoteViews != null) {
            notificationBuild.contentView = remoteViews;
        }
        if (l6Var != null) {
            o55Var.l.getClass();
        }
        if (l6Var != null && (bundle = notificationBuild.extras) != null) {
            CharSequence charSequence = (CharSequence) l6Var.b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", l6Var.i());
        }
        return notificationBuild;
    }

    public final void d(int i, boolean z) {
        Notification notification = this.v;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void e(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.b = bitmap;
            iconCompat = iconCompat2;
        }
        this.h = iconCompat;
    }

    public final void f(Uri uri) {
        Notification notification = this.v;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
    }

    public final void g(io.sentry.l6 l6Var) {
        if (this.l != l6Var) {
            this.l = l6Var;
            if (((o55) l6Var.a) != this) {
                l6Var.a = this;
                g(l6Var);
            }
        }
    }

    public final void h(String str) {
        this.v.tickerText = c(str);
    }
}
