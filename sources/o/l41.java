package o;

import android.content.Context;
import android.content.SharedPreferences;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class l41 implements ia3, ja3 {
    public final wk0 d;
    public boolean e;
    public final wk0 f;
    public final LinkedList a = new LinkedList();
    public final LinkedList b = new LinkedList();
    public final LinkedList c = new LinkedList();
    public final k41 g = new k41(this, 0 == true ? 1 : 0);

    /* JADX WARN: Multi-variable type inference failed */
    public l41(Context context) {
        this.d = new wk0(context, (byte) 7);
        this.f = new wk0(context, (byte) 26);
        ye4.a("ConnectionHistory", "loading history....");
        for (h41 h41Var : new LinkedList()) {
            synchronized (this.b) {
                this.b.add(h41Var);
            }
        }
        try {
            Object object = new ObjectInputStream(new ByteArrayInputStream(this.f.p("RECENT_CONNECTION_LIST", new byte[0]))).readObject();
            object.getClass();
            for (byte[] bArr : (byte[][]) object) {
                DyngateID dyngateID = h41.l;
                h41 h41VarK = mo8.k(bArr);
                if (h41VarK != null) {
                    synchronized (this.b) {
                        this.b.add(h41VarK);
                    }
                } else {
                    ye4.c("ConnectionHistory", "loadConnectionHistory(): deserialization error");
                }
            }
        } catch (StreamCorruptedException e) {
            e41.s("loadConnectionHistory(): StreamCorruptedException: ", e.getMessage(), "ConnectionHistory");
        } catch (IOException e2) {
            e41.s("loadConnectionHistory(): IOException: ", e2.getMessage(), "ConnectionHistory");
        } catch (ClassNotFoundException e3) {
            e41.s("loadConnectionHistory(): ClassNotFoundException: ", e3.getMessage(), "ConnectionHistory");
        }
        ye4.a("ConnectionHistory", "... loading history done");
        SharedPreferences sharedPreferences = h57.a;
        if (sharedPreferences == null) {
            im3.e0("sharedPreferences");
            throw null;
        }
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.g);
    }

    public final void a() {
        synchronized (this.b) {
            this.b.clear();
        }
        this.c.clear();
        EventHub.e(EventHub.e.f(), EventType.EVENT_CLEAR_CONNECTION_HISTORY);
    }

    public final String b(String str) {
        DyngateID dyngateIDFromLong;
        SharedPreferences sharedPreferences = h57.a;
        if (sharedPreferences == null) {
            im3.e0("sharedPreferences");
            throw null;
        }
        if (sharedPreferences.getBoolean("REMEMBER_HISTORY_PASSWORD", false)) {
            boolean z = this.e;
            if (!z && !z) {
                this.c.clear();
                HashSet hashSet = new HashSet();
                synchronized (this.b) {
                    try {
                        for (int size = this.b.size(); size > 0 && this.b.size() - size < 5; size--) {
                            h41 h41Var = (h41) this.b.get(size - 1);
                            if (h41Var != null && h41Var.c.equals(h41.l)) {
                                Iterator it = this.c.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        if (h41Var.h == fu6.LoginFailed) {
                                            break;
                                        }
                                        this.c.add(h41Var);
                                        break;
                                    }
                                } while (!h41Var.d.equals(((h41) it.next()).d));
                            } else if (h41Var != null && !hashSet.contains(h41Var.c) && h41Var.h != fu6.LoginFailed) {
                                this.c.add(h41Var);
                                hashSet.add(h41Var.c);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.e = true;
            }
            try {
                Pattern patternCompile = Pattern.compile("\\s");
                patternCompile.getClass();
                String strReplaceAll = patternCompile.matcher(str).replaceAll("");
                strReplaceAll.getClass();
                dyngateIDFromLong = DyngateID.FromLong(Long.parseLong(strReplaceAll));
            } catch (NumberFormatException unused) {
                ye4.a("ConnectionHistory", "getPassword: no ID");
                dyngateIDFromLong = null;
            }
            if (dyngateIDFromLong == null || !dyngateIDFromLong.IsValid()) {
                for (h41 h41Var2 : this.c) {
                    if (h41Var2.d.equals(str)) {
                        return h41Var2.a;
                    }
                }
            } else {
                for (h41 h41Var3 : this.c) {
                    if (h41Var3.c.equals(dyngateIDFromLong)) {
                        return h41Var3.a;
                    }
                }
            }
        }
        return null;
    }

    public final void c(DyngateID dyngateID, String str, e51 e51Var, String str2, boolean z) {
        String str3;
        ye4.a("ConnectionHistory", "************ connection started to: " + dyngateID + " " + e51Var.name() + " ************");
        SharedPreferences sharedPreferences = h57.a;
        if (sharedPreferences == null) {
            im3.e0("sharedPreferences");
            throw null;
        }
        if (!sharedPreferences.getBoolean("REMEMBER_HISTORY_PASSWORD", false) || !z) {
            LinkedList linkedList = this.b;
            int size = linkedList.size() - 1;
            if (size < 0) {
                str = "";
                break;
            }
            while (true) {
                int i = size - 1;
                h41 h41Var = (h41) linkedList.get(size);
                if (im3.n(h41Var != null ? h41Var.c : null, dyngateID) && (str3 = h41Var.a) != null && str3.length() != 0) {
                    str = h41Var.a;
                    break;
                } else {
                    if (i < 0) {
                        str = "";
                        break;
                    }
                    size = i;
                }
            }
        }
        h41 h41Var2 = new h41(dyngateID, str, e51Var, str2);
        h41Var2.f = new Date();
        LinkedList linkedList2 = this.a;
        Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            if (((h41) it.next()).c.equals(dyngateID)) {
                ye4.a.g("ConnectionHistory", "Connection to: " + dyngateID + " already running!");
            }
        }
        linkedList2.add(h41Var2);
    }
}
