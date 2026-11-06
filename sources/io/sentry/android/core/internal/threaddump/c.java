package io.sentry.android.core.internal.threaddump;

import io.sentry.f6;
import io.sentry.g6;
import io.sentry.g7;
import io.sentry.m7;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.a0;
import io.sentry.protocol.c0;
import io.sentry.protocol.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.fx3;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final Pattern h = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");
    public static final Pattern i = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");
    public static final Pattern j = Pattern.compile("----- pid (\\d+) at .*");
    public static final Pattern k = Pattern.compile("\\s*\\|\\s*sysTid=(\\d+).*");
    public static final Pattern l = Pattern.compile(" *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?");
    public static final Pattern m = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");
    public static final Pattern n = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f110o = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern p = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern q = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern r = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern s = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");
    public static final Pattern t = Pattern.compile(" *- waiting to lock an unknown object");
    public static final Pattern u = Pattern.compile("\\s+");
    public final g7 a;
    public final boolean b;
    public Long c;
    public final m7 d;
    public final m7 g = new m7((byte) 1, false);
    public final HashMap e = new HashMap();
    public final ArrayList f = new ArrayList();

    public c(g7 g7Var, boolean z) {
        this.a = g7Var;
        this.b = z;
        this.d = new m7(g7Var, (byte) 0);
    }

    public static void a(e0 e0Var, g6 g6Var) {
        Map map = e0Var.v;
        if (map == null) {
            map = new HashMap();
        }
        g6 g6Var2 = (g6) map.get(g6Var.n);
        if (g6Var2 != null) {
            g6Var2.m = Math.max(g6Var2.m, g6Var.m);
        } else {
            String str = g6Var.n;
            g6 g6Var3 = new g6();
            g6Var3.m = g6Var.m;
            g6Var3.n = str;
            g6Var3.f196o = g6Var.f196o;
            g6Var3.p = g6Var.p;
            g6Var3.q = g6Var.q;
            g6Var3.r = io.sentry.util.b.r(g6Var.r);
            map.put(str, g6Var3);
        }
        e0Var.v = map;
    }

    public static Long b(Matcher matcher, int i2) {
        String strGroup = matcher.group(i2);
        if (strGroup == null || strGroup.length() == 0) {
            return null;
        }
        return Long.valueOf(Long.parseLong(strGroup));
    }

    public static boolean c(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0301  */
    /* JADX WARN: Code duplicated, block: B:105:0x030e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0354  */
    /* JADX WARN: Code duplicated, block: B:123:0x0377  */
    /* JADX WARN: Code duplicated, block: B:125:0x0382  */
    /* JADX WARN: Code duplicated, block: B:131:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:134:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:135:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:137:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:139:0x03df  */
    /* JADX WARN: Code duplicated, block: B:140:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:142:0x040c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0417  */
    /* JADX WARN: Code duplicated, block: B:146:0x0421  */
    /* JADX WARN: Code duplicated, block: B:153:0x045c  */
    /* JADX WARN: Code duplicated, block: B:155:0x0462 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x0464  */
    /* JADX WARN: Code duplicated, block: B:157:0x0486  */
    /* JADX WARN: Code duplicated, block: B:159:0x048c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x048e  */
    /* JADX WARN: Code duplicated, block: B:161:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:163:0x04b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:165:0x04db  */
    /* JADX WARN: Code duplicated, block: B:167:0x04e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:168:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:170:0x0512  */
    /* JADX WARN: Code duplicated, block: B:171:0x0514  */
    /* JADX WARN: Code duplicated, block: B:173:0x051d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:174:0x051f  */
    /* JADX WARN: Code duplicated, block: B:177:0x0544  */
    /* JADX WARN: Code duplicated, block: B:178:0x0546  */
    /* JADX WARN: Code duplicated, block: B:180:0x054f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x0551  */
    /* JADX WARN: Code duplicated, block: B:182:0x055e  */
    /* JADX WARN: Code duplicated, block: B:184:0x0564  */
    /* JADX WARN: Code duplicated, block: B:191:0x0593  */
    /* JADX WARN: Code duplicated, block: B:217:0x057f A[EDGE_INSN: B:217:0x057f->B:188:0x057f BREAK  A[LOOP:1: B:89:0x02c5->B:187:0x056d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x057f A[EDGE_INSN: B:218:0x057f->B:188:0x057f BREAK  A[LOOP:1: B:89:0x02c5->B:187:0x056d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x02db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x056d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x01d8 A[PHI: r21 r23 r25 r26 r28 r31 r34
      0x01d8: PHI (r21v2 java.util.regex.Matcher) = (r21v3 java.util.regex.Matcher), (r21v4 java.util.regex.Matcher) binds: [B:63:0x01d2, B:189:0x058f] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r23v2 java.util.regex.Pattern) = (r23v3 java.util.regex.Pattern), (r23v4 java.util.regex.Pattern) binds: [B:63:0x01d2, B:189:0x058f] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r25v1 java.util.regex.Matcher) = (r25v2 java.util.regex.Matcher), (r25v3 java.util.regex.Matcher) binds: [B:63:0x01d2, B:189:0x058f] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r26v1 java.util.regex.Matcher) = (r26v2 java.util.regex.Matcher), (r26v3 java.util.regex.Matcher) binds: [B:63:0x01d2, B:189:0x058f] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r28v1 java.util.ArrayList) = (r28v2 java.util.ArrayList), (r28v3 java.util.ArrayList) binds: [B:63:0x01d2, B:189:0x058f] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r31v2 java.lang.String) = (r4v1 java.lang.String), (r31v4 java.lang.String) binds: [B:63:0x01d2, B:189:0x058f] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r34v2 int) = (r2v1 int), (r34v5 int) binds: [B:63:0x01d2, B:189:0x058f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:95:0x02df  */
    /* JADX WARN: Code duplicated, block: B:97:0x02e9  */
    public final void d(b bVar) {
        Pattern pattern;
        Matcher matcher;
        Pattern pattern2;
        ArrayList arrayList;
        Matcher matcher2;
        Matcher matcher3;
        g7 g7Var;
        ArrayList arrayList2;
        Matcher matcher4;
        Matcher matcher5;
        Matcher matcher6;
        Matcher matcher7;
        Matcher matcher8;
        Matcher matcher9;
        Matcher matcher10;
        Matcher matcher11;
        Matcher matcher12;
        Matcher matcher13;
        Matcher matcher14;
        a0 a0Var;
        c0 c0Var;
        a aVarA;
        String str;
        Matcher matcher15;
        Matcher matcher16;
        Matcher matcher17;
        String strGroup;
        String strGroup2;
        a0 a0Var2;
        String strGroup3;
        Integer numValueOf;
        String strGroup4;
        String strA;
        HashMap map;
        String strGroup5;
        String strGroup6;
        String strGroup7;
        Integer numValueOf2;
        Long lB;
        b bVar2 = bVar;
        int i2 = bVar2.a;
        Pattern pattern3 = h;
        String str2 = "";
        Matcher matcher18 = pattern3.matcher("");
        Pattern pattern4 = i;
        Matcher matcher19 = pattern4.matcher("");
        Matcher matcher20 = j.matcher("");
        while (true) {
            int i3 = bVar2.c;
            ArrayList<e0> arrayList3 = this.f;
            if (i3 >= i2) {
                for (e0 e0Var : arrayList3) {
                    Boolean bool = Boolean.TRUE;
                    if (bool.equals(e0Var.t)) {
                        e0Var.f228o = "main";
                        e0Var.q = bool;
                        e0Var.r = Boolean.valueOf(!this.b);
                    } else {
                        Boolean bool2 = Boolean.FALSE;
                        e0Var.q = bool2;
                        e0Var.r = bool2;
                        e0Var.t = bool2;
                    }
                }
                return;
            }
            a aVarA2 = bVar2.a();
            String str3 = "Internal error while parsing thread dump.";
            g7 g7Var2 = this.a;
            if (aVarA2 == null) {
                g7Var2.getLogger().g(f6.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return;
            }
            String str4 = aVarA2.a;
            Long lValueOf = null;
            if (c(matcher18, str4) || c(matcher19, str4)) {
                bVar2.c--;
                e0 e0Var2 = new e0();
                Matcher matcher21 = pattern3.matcher(str2);
                Matcher matcher22 = pattern4.matcher(str2);
                pattern = pattern3;
                if (bVar2.c >= i2) {
                    matcher = matcher18;
                    pattern2 = pattern4;
                    matcher3 = matcher19;
                    matcher2 = matcher20;
                    arrayList = arrayList3;
                    e0Var2 = null;
                } else {
                    a aVarA3 = bVar2.a();
                    if (aVarA3 == null) {
                        g7Var2.getLogger().g(f6.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                        matcher = matcher18;
                        pattern2 = pattern4;
                        matcher3 = matcher19;
                        matcher2 = matcher20;
                        arrayList = arrayList3;
                        e0Var2 = null;
                    } else {
                        String str5 = aVarA3.a;
                        matcher = matcher18;
                        pattern2 = pattern4;
                        if (c(matcher21, str5)) {
                            Long lB2 = b(matcher21, 4);
                            if (lB2 == null) {
                                g7Var2.getLogger().g(f6.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                                matcher3 = matcher19;
                                matcher2 = matcher20;
                                arrayList = arrayList3;
                                e0Var2 = null;
                            } else {
                                e0Var2.m = lB2;
                                String strGroup8 = matcher21.group(1);
                                e0Var2.f228o = strGroup8;
                                if ("main".equals(strGroup8)) {
                                    e0Var2.t = Boolean.TRUE;
                                }
                                String strGroup9 = matcher21.group(5);
                                if (strGroup9 != null) {
                                    if (strGroup9.contains(" ")) {
                                        e0Var2.p = strGroup9.substring(0, strGroup9.indexOf(32));
                                    } else {
                                        e0Var2.p = strGroup9;
                                    }
                                }
                                g7Var = (g7) this.d.n;
                                arrayList2 = new ArrayList();
                                matcher4 = l.matcher(str2);
                                matcher5 = m.matcher(str2);
                                matcher6 = n.matcher(str2);
                                matcher7 = f110o.matcher(str2);
                                matcher8 = q.matcher(str2);
                                matcher3 = matcher19;
                                matcher9 = p.matcher(str2);
                                matcher2 = matcher20;
                                matcher10 = s.matcher(str2);
                                Matcher matcher23 = r.matcher(str2);
                                arrayList = arrayList3;
                                matcher11 = t.matcher(str2);
                                matcher12 = u.matcher(str2);
                                matcher13 = k.matcher(str2);
                                str2 = str2;
                                matcher14 = matcher23;
                                a0Var = null;
                                while (true) {
                                    if (bVar2.c >= i2) {
                                        aVarA = bVar2.a();
                                        if (aVarA == null) {
                                            g7Var2.getLogger().g(f6.WARNING, str3, new Object[0]);
                                        } else {
                                            str = aVarA.a;
                                            if (c(matcher13, str)) {
                                                lB = b(matcher13, 1);
                                                if (lB != null && lB.equals(this.c)) {
                                                    e0Var2.t = Boolean.TRUE;
                                                }
                                                i2 = i2;
                                            } else {
                                                i2 = i2;
                                                if (c(matcher5, str)) {
                                                    a0Var = new a0();
                                                    strGroup5 = matcher5.group(1);
                                                    strGroup6 = matcher5.group(2);
                                                    if (strGroup5 != null && !strGroup5.isEmpty()) {
                                                        strGroup6 = fx3.g(strGroup5, ".", strGroup6);
                                                    }
                                                    a0Var.r = strGroup6;
                                                    a0Var.q = matcher5.group(3);
                                                    a0Var.p = matcher5.group(4);
                                                    strGroup7 = matcher5.group(5);
                                                    if (strGroup7 != null || strGroup7.length() == 0) {
                                                        numValueOf2 = null;
                                                    } else {
                                                        int i4 = Integer.parseInt(strGroup7);
                                                        numValueOf2 = Integer.valueOf(i4);
                                                        if (i4 < 0) {
                                                            numValueOf2 = null;
                                                        }
                                                    }
                                                    a0Var.s = numValueOf2;
                                                    a0Var.w = m7.f(strGroup6, g7Var.getInAppIncludes(), g7Var.getInAppExcludes());
                                                    arrayList2.add(a0Var);
                                                } else {
                                                    matcher13 = matcher13;
                                                    if (c(matcher4, str)) {
                                                        a0Var2 = new a0();
                                                        a0Var2.x = matcher4.group(3);
                                                        a0Var2.q = matcher4.group(6);
                                                        strGroup3 = matcher4.group(7);
                                                        if (strGroup3 != null || strGroup3.length() == 0) {
                                                            numValueOf = null;
                                                        } else {
                                                            numValueOf = Integer.valueOf(Integer.parseInt(strGroup3));
                                                        }
                                                        a0Var2.s = numValueOf;
                                                        a0Var2.C = "0x" + matcher4.group(2);
                                                        a0Var2.z = "native";
                                                        strGroup4 = matcher4.group(8);
                                                        if (strGroup4 == null) {
                                                            strA = null;
                                                        } else {
                                                            strA = io.sentry.config.a.a(strGroup4);
                                                        }
                                                        if (strA != null) {
                                                            map = this.e;
                                                            if (!map.containsKey(strA)) {
                                                                DebugImage debugImage = new DebugImage();
                                                                debugImage.setDebugId(strA);
                                                                debugImage.setType("elf");
                                                                debugImage.setCodeFile(matcher4.group(4));
                                                                debugImage.setCodeId(strGroup4);
                                                                map.put(strA, debugImage);
                                                            }
                                                            a0Var2.D = "rel:".concat(strA);
                                                        } else {
                                                            matcher5 = matcher5;
                                                            str3 = str3;
                                                        }
                                                        arrayList2.add(a0Var2);
                                                        a0Var = null;
                                                    } else {
                                                        matcher5 = matcher5;
                                                        str3 = str3;
                                                        if (c(matcher6, str)) {
                                                            a0Var = new a0();
                                                            strGroup = matcher6.group(1);
                                                            strGroup2 = matcher6.group(2);
                                                            if (strGroup != null && !strGroup.isEmpty()) {
                                                                strGroup2 = fx3.g(strGroup, ".", strGroup2);
                                                            }
                                                            a0Var.r = strGroup2;
                                                            a0Var.q = matcher6.group(3);
                                                            a0Var.w = m7.f(strGroup2, g7Var.getInAppIncludes(), g7Var.getInAppExcludes());
                                                            a0Var.y = Boolean.TRUE;
                                                            arrayList2.add(a0Var);
                                                        } else if (c(matcher7, str)) {
                                                            if (a0Var != null) {
                                                                g6 g6Var = new g6();
                                                                g6Var.m = 1;
                                                                g6Var.n = matcher7.group(1);
                                                                g6Var.f196o = matcher7.group(2);
                                                                g6Var.p = matcher7.group(3);
                                                                a0Var.H = g6Var;
                                                                a(e0Var2, g6Var);
                                                            }
                                                        } else if (c(matcher8, str)) {
                                                            if (a0Var != null) {
                                                                g6 g6Var2 = new g6();
                                                                g6Var2.m = 2;
                                                                g6Var2.n = matcher8.group(1);
                                                                g6Var2.f196o = matcher8.group(2);
                                                                g6Var2.p = matcher8.group(3);
                                                                a0Var.H = g6Var2;
                                                                a(e0Var2, g6Var2);
                                                            }
                                                        } else if (c(matcher9, str)) {
                                                            if (a0Var != null) {
                                                                g6 g6Var3 = new g6();
                                                                g6Var3.m = 4;
                                                                g6Var3.n = matcher9.group(1);
                                                                g6Var3.f196o = matcher9.group(2);
                                                                g6Var3.p = matcher9.group(3);
                                                                a0Var.H = g6Var3;
                                                                a(e0Var2, g6Var3);
                                                            }
                                                        } else if (c(matcher10, str)) {
                                                            if (a0Var != null) {
                                                                g6 g6Var4 = new g6();
                                                                g6Var4.m = 8;
                                                                g6Var4.n = matcher10.group(1);
                                                                g6Var4.f196o = matcher10.group(2);
                                                                g6Var4.p = matcher10.group(3);
                                                                g6Var4.q = b(matcher10, 4);
                                                                a0Var.H = g6Var4;
                                                                a(e0Var2, g6Var4);
                                                            }
                                                            matcher16 = matcher11;
                                                            matcher17 = matcher12;
                                                            matcher15 = matcher14;
                                                        } else {
                                                            matcher15 = matcher14;
                                                            if (c(matcher15, str)) {
                                                                matcher16 = matcher11;
                                                                if (c(matcher16, str)) {
                                                                    if (str.length() != 0) {
                                                                        break;
                                                                    }
                                                                    matcher17 = matcher12;
                                                                    if (c(matcher17, str)) {
                                                                        break;
                                                                    }
                                                                } else if (a0Var != null) {
                                                                    g6 g6Var5 = new g6();
                                                                    g6Var5.m = 8;
                                                                    a0Var.H = g6Var5;
                                                                    a(e0Var2, g6Var5);
                                                                }
                                                            } else {
                                                                if (a0Var != null) {
                                                                    g6 g6Var6 = new g6();
                                                                    g6Var6.m = 8;
                                                                    g6Var6.n = matcher15.group(1);
                                                                    g6Var6.f196o = matcher15.group(2);
                                                                    g6Var6.p = matcher15.group(3);
                                                                    a0Var.H = g6Var6;
                                                                    a(e0Var2, g6Var6);
                                                                }
                                                                matcher16 = matcher11;
                                                            }
                                                            matcher17 = matcher12;
                                                        }
                                                    }
                                                    matcher16 = matcher11;
                                                    matcher17 = matcher12;
                                                    matcher15 = matcher14;
                                                }
                                                matcher14 = matcher15;
                                                matcher12 = matcher17;
                                                matcher11 = matcher16;
                                                matcher5 = matcher5;
                                                matcher13 = matcher13;
                                                i2 = i2;
                                                str3 = str3;
                                                bVar2 = bVar;
                                            }
                                            matcher5 = matcher5;
                                            str3 = str3;
                                            matcher16 = matcher11;
                                            matcher17 = matcher12;
                                            matcher15 = matcher14;
                                            matcher14 = matcher15;
                                            matcher12 = matcher17;
                                            matcher11 = matcher16;
                                            matcher5 = matcher5;
                                            matcher13 = matcher13;
                                            i2 = i2;
                                            str3 = str3;
                                            bVar2 = bVar;
                                        }
                                    }
                                    i2 = i2;
                                    break;
                                }
                                Collections.reverse(arrayList2);
                                c0Var = new c0(arrayList2);
                                c0Var.f226o = Boolean.TRUE;
                                if (arrayList2.isEmpty()) {
                                    e0Var2 = null;
                                } else {
                                    e0Var2.u = c0Var;
                                }
                            }
                        } else {
                            if (c(matcher22, str5)) {
                                Long lB3 = b(matcher22, 3);
                                if (lB3 == null) {
                                    g7Var2.getLogger().g(f6.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                                    matcher3 = matcher19;
                                    matcher2 = matcher20;
                                    arrayList = arrayList3;
                                    e0Var2 = null;
                                } else {
                                    e0Var2.m = lB3;
                                    e0Var2.f228o = matcher22.group(1);
                                    if (lB3.equals(this.c)) {
                                        e0Var2.t = Boolean.TRUE;
                                    }
                                }
                            }
                            g7Var = (g7) this.d.n;
                            arrayList2 = new ArrayList();
                            matcher4 = l.matcher(str2);
                            matcher5 = m.matcher(str2);
                            matcher6 = n.matcher(str2);
                            matcher7 = f110o.matcher(str2);
                            matcher8 = q.matcher(str2);
                            matcher3 = matcher19;
                            matcher9 = p.matcher(str2);
                            matcher2 = matcher20;
                            matcher10 = s.matcher(str2);
                            Matcher matcher24 = r.matcher(str2);
                            arrayList = arrayList3;
                            matcher11 = t.matcher(str2);
                            matcher12 = u.matcher(str2);
                            matcher13 = k.matcher(str2);
                            str2 = str2;
                            matcher14 = matcher24;
                            a0Var = null;
                            while (true) {
                                if (bVar2.c >= i2) {
                                    aVarA = bVar2.a();
                                    if (aVarA == null) {
                                        g7Var2.getLogger().g(f6.WARNING, str3, new Object[0]);
                                    } else {
                                        str = aVarA.a;
                                        if (c(matcher13, str)) {
                                            lB = b(matcher13, 1);
                                            if (lB != null) {
                                                e0Var2.t = Boolean.TRUE;
                                            }
                                            i2 = i2;
                                        } else {
                                            i2 = i2;
                                            if (c(matcher5, str)) {
                                                a0Var = new a0();
                                                strGroup5 = matcher5.group(1);
                                                strGroup6 = matcher5.group(2);
                                                if (strGroup5 != null) {
                                                    strGroup6 = fx3.g(strGroup5, ".", strGroup6);
                                                }
                                                a0Var.r = strGroup6;
                                                a0Var.q = matcher5.group(3);
                                                a0Var.p = matcher5.group(4);
                                                strGroup7 = matcher5.group(5);
                                                if (strGroup7 != null) {
                                                    numValueOf2 = null;
                                                } else {
                                                    numValueOf2 = null;
                                                }
                                                a0Var.s = numValueOf2;
                                                a0Var.w = m7.f(strGroup6, g7Var.getInAppIncludes(), g7Var.getInAppExcludes());
                                                arrayList2.add(a0Var);
                                            } else {
                                                matcher13 = matcher13;
                                                if (c(matcher4, str)) {
                                                    a0Var2 = new a0();
                                                    a0Var2.x = matcher4.group(3);
                                                    a0Var2.q = matcher4.group(6);
                                                    strGroup3 = matcher4.group(7);
                                                    if (strGroup3 != null) {
                                                        numValueOf = null;
                                                    } else {
                                                        numValueOf = null;
                                                    }
                                                    a0Var2.s = numValueOf;
                                                    a0Var2.C = "0x" + matcher4.group(2);
                                                    a0Var2.z = "native";
                                                    strGroup4 = matcher4.group(8);
                                                    if (strGroup4 == null) {
                                                        strA = null;
                                                    } else {
                                                        strA = io.sentry.config.a.a(strGroup4);
                                                    }
                                                    if (strA != null) {
                                                        map = this.e;
                                                        if (!map.containsKey(strA)) {
                                                            DebugImage debugImage2 = new DebugImage();
                                                            debugImage2.setDebugId(strA);
                                                            debugImage2.setType("elf");
                                                            debugImage2.setCodeFile(matcher4.group(4));
                                                            debugImage2.setCodeId(strGroup4);
                                                            map.put(strA, debugImage2);
                                                        }
                                                        a0Var2.D = "rel:".concat(strA);
                                                    } else {
                                                        matcher5 = matcher5;
                                                        str3 = str3;
                                                    }
                                                    arrayList2.add(a0Var2);
                                                    a0Var = null;
                                                } else {
                                                    matcher5 = matcher5;
                                                    str3 = str3;
                                                    if (c(matcher6, str)) {
                                                        a0Var = new a0();
                                                        strGroup = matcher6.group(1);
                                                        strGroup2 = matcher6.group(2);
                                                        if (strGroup != null) {
                                                            strGroup2 = fx3.g(strGroup, ".", strGroup2);
                                                        }
                                                        a0Var.r = strGroup2;
                                                        a0Var.q = matcher6.group(3);
                                                        a0Var.w = m7.f(strGroup2, g7Var.getInAppIncludes(), g7Var.getInAppExcludes());
                                                        a0Var.y = Boolean.TRUE;
                                                        arrayList2.add(a0Var);
                                                    } else if (c(matcher7, str)) {
                                                        if (a0Var != null) {
                                                            g6 g6Var7 = new g6();
                                                            g6Var7.m = 1;
                                                            g6Var7.n = matcher7.group(1);
                                                            g6Var7.f196o = matcher7.group(2);
                                                            g6Var7.p = matcher7.group(3);
                                                            a0Var.H = g6Var7;
                                                            a(e0Var2, g6Var7);
                                                        }
                                                    } else if (c(matcher8, str)) {
                                                        if (a0Var != null) {
                                                            g6 g6Var8 = new g6();
                                                            g6Var8.m = 2;
                                                            g6Var8.n = matcher8.group(1);
                                                            g6Var8.f196o = matcher8.group(2);
                                                            g6Var8.p = matcher8.group(3);
                                                            a0Var.H = g6Var8;
                                                            a(e0Var2, g6Var8);
                                                        }
                                                    } else if (c(matcher9, str)) {
                                                        if (a0Var != null) {
                                                            g6 g6Var9 = new g6();
                                                            g6Var9.m = 4;
                                                            g6Var9.n = matcher9.group(1);
                                                            g6Var9.f196o = matcher9.group(2);
                                                            g6Var9.p = matcher9.group(3);
                                                            a0Var.H = g6Var9;
                                                            a(e0Var2, g6Var9);
                                                        }
                                                    } else if (c(matcher10, str)) {
                                                        if (a0Var != null) {
                                                            g6 g6Var10 = new g6();
                                                            g6Var10.m = 8;
                                                            g6Var10.n = matcher10.group(1);
                                                            g6Var10.f196o = matcher10.group(2);
                                                            g6Var10.p = matcher10.group(3);
                                                            g6Var10.q = b(matcher10, 4);
                                                            a0Var.H = g6Var10;
                                                            a(e0Var2, g6Var10);
                                                        }
                                                        matcher16 = matcher11;
                                                        matcher17 = matcher12;
                                                        matcher15 = matcher14;
                                                    } else {
                                                        matcher15 = matcher14;
                                                        if (c(matcher15, str)) {
                                                            matcher16 = matcher11;
                                                            if (c(matcher16, str)) {
                                                                if (str.length() != 0) {
                                                                    break;
                                                                    break;
                                                                }
                                                                matcher17 = matcher12;
                                                                if (c(matcher17, str)) {
                                                                    break;
                                                                    break;
                                                                }
                                                            } else if (a0Var != null) {
                                                                g6 g6Var11 = new g6();
                                                                g6Var11.m = 8;
                                                                a0Var.H = g6Var11;
                                                                a(e0Var2, g6Var11);
                                                            }
                                                        } else {
                                                            if (a0Var != null) {
                                                                g6 g6Var12 = new g6();
                                                                g6Var12.m = 8;
                                                                g6Var12.n = matcher15.group(1);
                                                                g6Var12.f196o = matcher15.group(2);
                                                                g6Var12.p = matcher15.group(3);
                                                                a0Var.H = g6Var12;
                                                                a(e0Var2, g6Var12);
                                                            }
                                                            matcher16 = matcher11;
                                                        }
                                                        matcher17 = matcher12;
                                                    }
                                                }
                                                matcher16 = matcher11;
                                                matcher17 = matcher12;
                                                matcher15 = matcher14;
                                            }
                                            matcher14 = matcher15;
                                            matcher12 = matcher17;
                                            matcher11 = matcher16;
                                            matcher5 = matcher5;
                                            matcher13 = matcher13;
                                            i2 = i2;
                                            str3 = str3;
                                            bVar2 = bVar;
                                        }
                                        matcher5 = matcher5;
                                        str3 = str3;
                                        matcher16 = matcher11;
                                        matcher17 = matcher12;
                                        matcher15 = matcher14;
                                        matcher14 = matcher15;
                                        matcher12 = matcher17;
                                        matcher11 = matcher16;
                                        matcher5 = matcher5;
                                        matcher13 = matcher13;
                                        i2 = i2;
                                        str3 = str3;
                                        bVar2 = bVar;
                                    }
                                }
                                i2 = i2;
                                break;
                            }
                            Collections.reverse(arrayList2);
                            c0Var = new c0(arrayList2);
                            c0Var.f226o = Boolean.TRUE;
                            if (arrayList2.isEmpty()) {
                                e0Var2 = null;
                            } else {
                                e0Var2.u = c0Var;
                            }
                        }
                    }
                }
                if (e0Var2 != null) {
                    arrayList.add(e0Var2);
                }
            } else {
                if (c(matcher20, str4)) {
                    this.c = b(matcher20, 1);
                } else {
                    boolean zStartsWith = str4.startsWith("Free memory until OOME ");
                    m7 m7Var = this.g;
                    if (zStartsWith) {
                        m7Var.c().u = m7.i(str4.substring(23));
                    } else if (str4.startsWith("Free memory until GC ")) {
                        m7Var.c().t = m7.i(str4.substring(21));
                    } else if (str4.startsWith("Free memory ")) {
                        m7Var.c().s = m7.i(str4.substring(12));
                    } else if (str4.startsWith("Total memory ")) {
                        m7Var.c().v = m7.i(str4.substring(13));
                    } else if (str4.startsWith("Max memory ")) {
                        m7Var.c().w = m7.i(str4.substring(11));
                    } else if (str4.startsWith("Total time waiting for GC to complete: ")) {
                        m7Var.c().r = m7.j(str4.substring(39));
                    } else if (str4.startsWith("Total GC time: ")) {
                        m7Var.c().n = m7.j(str4.substring(15));
                    } else if (str4.startsWith("Total GC count: ")) {
                        io.sentry.protocol.c cVarC = m7Var.c();
                        try {
                            lValueOf = Long.valueOf(Long.parseLong(str4.substring(16).trim()));
                        } catch (NumberFormatException unused) {
                        }
                        cVarC.m = lValueOf;
                    } else if (str4.startsWith("Total blocking GC time: ")) {
                        m7Var.c().p = m7.j(str4.substring(24));
                    } else if (str4.startsWith("Total blocking GC count: ")) {
                        io.sentry.protocol.c cVarC2 = m7Var.c();
                        try {
                            lValueOf = Long.valueOf(Long.parseLong(str4.substring(25).trim()));
                        } catch (NumberFormatException unused2) {
                        }
                        cVarC2.f225o = lValueOf;
                    } else if (str4.startsWith("Total pre-OOME GC count: ")) {
                        io.sentry.protocol.c cVarC3 = m7Var.c();
                        try {
                            lValueOf = Long.valueOf(Long.parseLong(str4.substring(25).trim()));
                        } catch (NumberFormatException unused3) {
                        }
                        cVarC3.q = lValueOf;
                    }
                }
                i2 = i2;
                pattern = pattern3;
                str2 = str2;
                matcher = matcher18;
                pattern2 = pattern4;
                matcher3 = matcher19;
                matcher2 = matcher20;
            }
            bVar2 = bVar;
            pattern3 = pattern;
            matcher18 = matcher;
            pattern4 = pattern2;
            matcher19 = matcher3;
            matcher20 = matcher2;
            str2 = str2;
            i2 = i2;
        }
    }
}
