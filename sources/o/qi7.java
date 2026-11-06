package o;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;

/* JADX INFO: loaded from: classes.dex */
public final class qi7 {
    public static qi7 g;
    public final fi7 a;
    public final ClipboardManager b;
    public mt6 c;
    public boolean d;
    public String e;
    public final pi7 f;

    /* JADX WARN: Type inference failed for: r2v4, types: [o.pi7] */
    public qi7(fi7 fi7Var) {
        this.a = fi7Var;
        Object systemService = fi7Var.getSystemService("clipboard");
        systemService.getClass();
        this.b = (ClipboardManager) systemService;
        this.e = "";
        this.f = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: o.pi7
            @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
            public final void onPrimaryClipChanged() {
                qi7 qi7Var = this.a;
                if (qi7Var.b().length() == 0) {
                    return;
                }
                if (qi7Var.d) {
                    qi7Var.d = false;
                    return;
                }
                ye4.a.e("Android Clipboard content changed. new content length: %d", Integer.valueOf(qi7Var.b().length()));
                mt6 mt6Var = qi7Var.c;
                if (mt6Var != null) {
                    String strB = qi7Var.b();
                    if (strB.length() > 0) {
                        ye4.a("SessionRemoteControl", "sending clipboard data. content length: " + strB.length());
                        bk7 bk7Var = bk7.TVCmdClipboard;
                        KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
                        ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
                        ak7VarN.f(xi7.m, strB);
                        mt6Var.m.f(ak7VarN, true);
                    }
                }
            }
        };
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                this.b.clearPrimaryClip();
            } catch (Exception unused) {
                c(null);
            }
        } else {
            c(null);
        }
        this.e = "";
    }

    public final String b() {
        ClipData primaryClip = this.b.getPrimaryClip();
        String strM = "";
        if (primaryClip == null) {
            return "";
        }
        int itemCount = primaryClip.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            CharSequence charSequenceCoerceToText = primaryClip.getItemAt(i).coerceToText(this.a);
            charSequenceCoerceToText.getClass();
            if (charSequenceCoerceToText.length() > 0) {
                strM = ua5.m(strM, strM.length() == 0 ? charSequenceCoerceToText.toString() : "\n" + ((Object) charSequenceCoerceToText));
            }
        }
        return strM;
    }

    public final void c(String str) {
        if (str != null && !str.equals(b())) {
            this.d = true;
        }
        if (str == null || !str.equals(this.e)) {
            try {
                ye4.a.e("Setting Android Clipboard. new content length: %d", Integer.valueOf(str != null ? str.length() : 0));
                this.e = str;
                this.b.setPrimaryClip(ClipData.newPlainText("TVClipboard", str));
            } catch (IllegalStateException unused) {
                ye4.c("TVClipboard", "setText not allowed due to illegal state.");
            } catch (SecurityException unused2) {
                ye4.c("TVClipboard", "setText not allowed due to security exception.");
            } catch (RuntimeException e) {
                e41.s("setText failed: ", e.getMessage(), "TVClipboard");
                bu7.MAIN.a(new be3(str, this, (byte) 12));
            }
        }
    }
}
