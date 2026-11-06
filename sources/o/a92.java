package o;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class a92 {
    public static final Object j = new Object();
    public static volatile a92 k;
    public final ReentrantReadWriteLock a;
    public final ax b;
    public volatile byte c;
    public final Handler d;
    public final w82 e;
    public final z82 f;
    public final vv g;
    public final boolean h;
    public final bk1 i;

    public a92(yr2 yr2Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = (byte) 3;
        z82 z82Var = yr2Var.a;
        this.f = z82Var;
        boolean z = yr2Var.b;
        this.h = z;
        this.i = yr2Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new ax(0);
        this.g = new vv((byte) 14);
        w82 w82Var = new w82(this);
        this.e = w82Var;
        reentrantReadWriteLock.writeLock().lock();
        if (!z) {
            try {
                this.c = (byte) 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                z82Var.a(new v82(w82Var));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static a92 a() {
        a92 a92Var;
        synchronized (j) {
            try {
                a92Var = k;
                if (!(a92Var != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a92Var;
    }

    public static boolean d() {
        return k != null;
    }

    public final int b(int i, CharSequence charSequence) {
        if (!(c() == 1)) {
            hk0.l("Not initialized yet");
            return 0;
        }
        io1.A(charSequence, "charSequence cannot be null");
        iu iuVar = this.e.b;
        iuVar.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            a68[] a68VarArr = (a68[]) spanned.getSpans(i, i + 1, a68.class);
            if (a68VarArr.length > 0) {
                return spanned.getSpanStart(a68VarArr[0]);
            }
        }
        return ((m92) iuVar.K(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new m92(i))).n;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.h)) {
            hk0.l("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (c() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                this.a.writeLock().unlock();
                return;
            }
            this.c = (byte) 0;
            this.a.writeLock().unlock();
            w82 w82Var = this.e;
            a92 a92Var = w82Var.a;
            try {
                a92Var.f.a(new v82(w82Var));
            } catch (Throwable th) {
                a92Var.f(th);
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = (byte) 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new y82(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x009c A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:38:0x0057, B:41:0x005c, B:43:0x0060, B:45:0x006d, B:52:0x008c, B:54:0x0096, B:56:0x0099, B:58:0x009c, B:60:0x00ac, B:61:0x00af), top: B:105:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:38:0x0057, B:41:0x005c, B:43:0x0060, B:45:0x006d, B:52:0x008c, B:54:0x0096, B:56:0x0099, B:58:0x009c, B:60:0x00ac, B:61:0x00af), top: B:105:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fc  */
    public final CharSequence g(int i, int i2, int i3, CharSequence charSequence) throws Throwable {
        CharSequence charSequence2;
        Throwable th;
        int i4;
        int i5;
        a68[] a68VarArr;
        int spanStart;
        u88 u88Var = null;
        if (!(c() == 1)) {
            hk0.l("Not initialized yet");
            return null;
        }
        if (i < 0) {
            hk0.g("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            hk0.g("end cannot be negative");
            return null;
        }
        if (!(i <= i2)) {
            hk0.g("start should be <= than end");
            return null;
        }
        if (charSequence == null) {
            return null;
        }
        if (!(i <= charSequence.length())) {
            hk0.g("start should be < than charSequence length");
            return null;
        }
        if (!(i2 <= charSequence.length())) {
            hk0.g("end should be < than charSequence length");
            return null;
        }
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        boolean z = i3 == 1;
        iu iuVar = this.e.b;
        iuVar.getClass();
        boolean z2 = charSequence instanceof f77;
        if (z2) {
            ((f77) charSequence).a();
        }
        if (z2) {
            u88Var = new u88((Spannable) charSequence);
            if (u88Var != null) {
                for (a68 a68Var : a68VarArr) {
                    spanStart = u88Var.n.getSpanStart(a68Var);
                    int spanEnd = u88Var.n.getSpanEnd(a68Var);
                    if (spanStart != i2) {
                        u88Var.removeSpan(a68Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            }
            ((f77) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    u88Var = new u88((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((f77) charSequence2).b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, a68.class) <= i2) {
                u88Var = new u88();
                u88Var.m = false;
                u88Var.n = new SpannableString(charSequence);
            }
            if (u88Var != null && (a68VarArr = (a68[]) u88Var.n.getSpans(i, i2, a68.class)) != null && a68VarArr.length > 0) {
                while (i < r0) {
                    spanStart = u88Var.n.getSpanStart(a68Var);
                    int spanEnd2 = u88Var.n.getSpanEnd(a68Var);
                    if (spanStart != i2) {
                        u88Var.removeSpan(a68Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd2, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5 || i4 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                try {
                    u88 u88Var2 = (u88) iuVar.K(charSequence2, i4, i5, Integer.MAX_VALUE, z, new wk0((Object) u88Var, iuVar.f1103o, (byte) 24));
                    if (u88Var2 != null) {
                        Spannable spannable = u88Var2.n;
                        if (z2) {
                            ((f77) charSequence2).b();
                        }
                        return spannable;
                    }
                    if (!z2) {
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((f77) charSequence2).b();
                    throw th;
                }
            }
            ((f77) charSequence2).b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z2) {
            throw th;
        }
        ((f77) charSequence2).b();
        throw th;
    }

    public final void h(x82 x82Var) {
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new y82(Arrays.asList(x82Var), this.c, null));
            } else {
                this.b.add(x82Var);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        w82 w82Var = this.e;
        w82Var.getClass();
        Bundle bundle = editorInfo.extras;
        br4 br4Var = (br4) w82Var.c.n;
        int iA = br4Var.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) br4Var.p).getInt(iA + br4Var.m) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
