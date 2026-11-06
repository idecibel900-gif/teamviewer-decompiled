package io.sentry;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f4 implements t2 {
    public String A;
    public final ArrayList B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public Date L;
    public final HashMap M;
    public ConcurrentHashMap O;
    public final File m;
    public final Callable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f193o;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public boolean v;
    public String w;
    public String y;
    public String z;
    public List x = new ArrayList();
    public String N = null;
    public String p = Locale.getDefault().toString();

    public f4(File file, Date date, ArrayList arrayList, String str, String str2, String str3, String str4, int i, String str5, Callable callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, HashMap map) {
        this.m = file;
        this.L = date;
        this.w = str5;
        this.n = callable;
        this.f193o = i;
        this.q = str6 == null ? "" : str6;
        this.r = str7 == null ? "" : str7;
        this.u = str8 != null ? str8 : "";
        this.v = bool != null ? bool.booleanValue() : false;
        this.y = str9 != null ? str9 : "0";
        this.s = "";
        this.t = "android";
        this.z = "android";
        this.A = str10 != null ? str10 : "";
        this.B = arrayList;
        this.C = str.isEmpty() ? "unknown" : str;
        this.D = str4;
        this.E = "";
        this.F = str11 != null ? str11 : "";
        this.G = str2;
        this.H = str3;
        this.I = io.sentry.config.a.n();
        this.J = str12 != null ? str12 : "production";
        this.K = str13;
        if (!str13.equals("normal") && !this.K.equals("timeout") && !this.K.equals("backgrounded")) {
            this.K = "normal";
        }
        this.M = map;
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        cVar.r("android_api_level");
        cVar.x(g1Var, Integer.valueOf(this.f193o));
        cVar.r("device_locale");
        cVar.x(g1Var, this.p);
        cVar.r("device_manufacturer");
        cVar.A(this.q);
        cVar.r("device_model");
        cVar.A(this.r);
        cVar.r("device_os_build_number");
        cVar.A(this.s);
        cVar.r("device_os_name");
        cVar.A(this.t);
        cVar.r("device_os_version");
        cVar.A(this.u);
        cVar.r("device_is_emulator");
        cVar.B(this.v);
        cVar.r("architecture");
        cVar.x(g1Var, this.w);
        cVar.r("device_cpu_frequencies");
        cVar.x(g1Var, this.x);
        cVar.r("device_physical_memory_bytes");
        cVar.A(this.y);
        cVar.r("platform");
        cVar.A(this.z);
        cVar.r("build_id");
        cVar.A(this.A);
        cVar.r("transaction_name");
        cVar.A(this.C);
        cVar.r("duration_ns");
        cVar.A(this.D);
        cVar.r("version_name");
        cVar.A(this.F);
        cVar.r("version_code");
        cVar.A(this.E);
        ArrayList arrayList = this.B;
        if (!arrayList.isEmpty()) {
            cVar.r("transactions");
            cVar.x(g1Var, arrayList);
        }
        cVar.r("transaction_id");
        cVar.A(this.G);
        cVar.r("trace_id");
        cVar.A(this.H);
        cVar.r("profile_id");
        cVar.A(this.I);
        cVar.r("environment");
        cVar.A(this.J);
        cVar.r("truncation_reason");
        cVar.A(this.K);
        if (this.N != null) {
            cVar.r("sampled_profile");
            cVar.A(this.N);
        }
        String str = ((io.sentry.vendor.gson.stream.c) cVar.n).p;
        cVar.u("");
        cVar.r("measurements");
        cVar.x(g1Var, this.M);
        cVar.u(str);
        cVar.r("timestamp");
        cVar.x(g1Var, this.L);
        ConcurrentHashMap concurrentHashMap = this.O;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                f.b(this.O, str2, cVar, str2, g1Var);
            }
        }
        cVar.m();
    }
}
