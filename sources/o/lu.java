package o;

import com.teamviewer.corelib.logging.NativeLogger;
import java.io.File;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lu {
    public static final List b = qf0.L("TVLog.html", "TVLogOld.html", "TVLogUniversalAddon.html", "TVLogOldUniversalAddon.html");
    public static final byte c = 4;
    public final NativeLogger a;

    public lu(fi7 fi7Var) {
        File filesDir = fi7Var.getFilesDir();
        filesDir.getClass();
        String path = new File(filesDir, "TVLog.html").getPath();
        String path2 = new File(filesDir, "TVLogOld.html").getPath();
        path.getClass();
        path2.getClass();
        NativeLogger nativeLogger = new NativeLogger(fi7Var, path, path2);
        this.a = nativeLogger;
        nativeLogger.b(c);
    }

    public final synchronized void a(String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);
        formatter.format(str, Arrays.copyOf(objArr, objArr.length));
        this.a.a(4, "TVClipboard", sb.toString());
        formatter.close();
    }
}
