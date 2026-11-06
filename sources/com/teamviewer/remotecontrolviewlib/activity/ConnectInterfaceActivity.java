package com.teamviewer.remotecontrolviewlib.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.teamviewer.remotecontrollib.swig.ControlFileSWIGJNI;
import com.teamviewer.remotecontrollib.swig.IConnectInterfaceViewModel;
import com.teamviewer.remotecontrollib.swig.IConnectInterfaceViewModelSWIGJNI;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ConnectionMode;
import io.sentry.q7;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import o.a31;
import o.a7;
import o.ae;
import o.b31;
import o.bf1;
import o.c31;
import o.c36;
import o.d31;
import o.dl5;
import o.du6;
import o.ei5;
import o.gi5;
import o.h57;
import o.hi5;
import o.hk0;
import o.ij6;
import o.im3;
import o.it1;
import o.li5;
import o.lq1;
import o.mo7;
import o.my0;
import o.pn5;
import o.q0;
import o.q26;
import o.qi5;
import o.s7;
import o.u7;
import o.ua5;
import o.ub7;
import o.ve8;
import o.vn4;
import o.w86;
import o.wi6;
import o.wt3;
import o.xk1;
import o.xt2;
import o.ye4;
import o.zt6;
import o.zu1;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectInterfaceActivity extends my0 {
    public static final /* synthetic */ int J = 0;
    public Class H;
    public b31 I;

    public static void D(Intent intent, Intent intent2) {
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        intent.putExtra("KEY_ACCOUNTNAME", intent2.getStringExtra("KEY_ACCOUNTNAME"));
        intent.putExtra("IS_SHORTCUT", intent2.getBooleanExtra("IS_SHORTCUT", false));
        intent.putExtra("MEMBER_ID", intent2.getLongExtra("MEMBER_ID", 0L));
        intent.putExtra("SHORTCUT_DYNGATE_ID", intent2.getLongExtra("SHORTCUT_DYNGATE_ID", 0L));
        intent.putExtra("MDV2_MANAGEMENT_ID", intent2.getStringExtra("MDV2_MANAGEMENT_ID"));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0240  */
    /* JADX WARN: Code duplicated, block: B:105:0x0253 A[Catch: all -> 0x0260, IOException -> 0x0276, LOOP:0: B:104:0x0251->B:105:0x0253, LOOP_END, TryCatch #0 {all -> 0x0260, blocks: (B:103:0x024d, B:105:0x0253, B:108:0x0264, B:113:0x0276), top: B:201:0x023e }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0285  */
    /* JADX WARN: Code duplicated, block: B:119:0x028f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0295  */
    /* JADX WARN: Code duplicated, block: B:122:0x02b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:133:0x0303  */
    /* JADX WARN: Code duplicated, block: B:135:0x030f  */
    /* JADX WARN: Code duplicated, block: B:137:0x031b  */
    /* JADX WARN: Code duplicated, block: B:141:0x034f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0363  */
    /* JADX WARN: Code duplicated, block: B:147:0x036e  */
    /* JADX WARN: Code duplicated, block: B:149:0x0384  */
    /* JADX WARN: Code duplicated, block: B:151:0x0390  */
    /* JADX WARN: Code duplicated, block: B:152:0x039a  */
    /* JADX WARN: Code duplicated, block: B:154:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:155:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:157:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:158:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:161:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:164:0x03bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:167:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:168:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:170:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:172:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:173:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:175:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:177:0x03db  */
    /* JADX WARN: Code duplicated, block: B:180:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:182:0x0408  */
    /* JADX WARN: Code duplicated, block: B:184:0x0423  */
    /* JADX WARN: Code duplicated, block: B:186:0x0429  */
    /* JADX WARN: Code duplicated, block: B:188:0x042f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0433  */
    /* JADX WARN: Code duplicated, block: B:192:0x0437  */
    /* JADX WARN: Code duplicated, block: B:206:0x0248 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:94:0x0205  */
    /* JADX WARN: Code duplicated, block: B:96:0x0211  */
    /* JADX WARN: Code duplicated, block: B:98:0x021d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.io.ByteArrayOutputStream, java.io.Closeable, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48, types: [o.ae] */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v68, types: [o.du6] */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v70, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r1v86 */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r1v88 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // o.my0, o.ly0, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        Throwable th;
        xk1 xk1Var;
        String strQ;
        InputStream inputStreamK;
        ?? r8;
        ?? byteArrayOutputStream;
        int iAvailable;
        ?? r13;
        String strQ2;
        String str;
        String strS0;
        ?? r1;
        String str2;
        int length;
        b31 b31Var;
        b31 b31Var2;
        xt2 xt2Var;
        ye4 ye4Var;
        mo7 mo7Var;
        ?? r2;
        ?? r3;
        Class<?> cls;
        ConnectionMode connectionMode;
        du6 du6VarT;
        Intent intent;
        Class cls2;
        SharedPreferences sharedPreferences;
        super.onCreate(bundle);
        ye4.a("ConnectInterfaceActivity", "onCreate");
        c36 c36Var = zu1.c;
        if (c36Var == null) {
            hk0.g("Required value was null.");
            return;
        }
        dl5 dl5Var = new dl5(new q26(c36Var, (byte) 7), (byte) 2);
        ve8 g0 = getG0();
        bf1 bf1VarK = h57.k(this);
        pn5 pn5VarT = ua5.t(bf1VarK, g0, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(b31.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return;
        }
        b31 b31Var3 = (b31) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        this.I = b31Var3;
        Intent intent2 = getIntent();
        int i = -1;
        if (intent2 != null) {
            if (intent2.getBooleanExtra("IS_SHORTCUT", false)) {
                IConnectInterfaceViewModel iConnectInterfaceViewModel = b31Var3.n;
                IConnectInterfaceViewModelSWIGJNI.IConnectInterfaceViewModel_ReportEvent(iConnectInterfaceViewModel.a, iConnectInterfaceViewModel, 0);
            }
            d31 d31Var = b31Var3.p;
            Uri data = intent2.getData();
            if (data != null) {
                String str3 = "remotecontrolid";
                if (im3.n(data.getScheme(), "teamviewer8") && im3.n(data.getHost(), "remotecontrol")) {
                    String queryParameter = data.getQueryParameter("username");
                    String queryParameter2 = data.getQueryParameter("logintoken");
                    String queryParameter3 = data.getQueryParameter("tokenid");
                    String queryParameter4 = data.getQueryParameter("connectcc");
                    String queryParameter5 = data.getQueryParameter("managerid");
                    if (queryParameter4 == null || queryParameter4.length() == 0) {
                        th = null;
                        String queryParameter6 = data.getQueryParameter("connectsid");
                        if (queryParameter6 == null || queryParameter6.length() == 0) {
                            String queryParameter7 = data.getQueryParameter("remotecontrolid");
                            if (queryParameter7 == null || queryParameter7.length() == 0) {
                                ye4.c("ConnectInterfaceUIModel", "no id found");
                            } else {
                                LinkedBlockingQueue linkedBlockingQueue = wi6.a;
                                wi6.b(new li5(queryParameter7, queryParameter, queryParameter2, queryParameter3, queryParameter5));
                            }
                        } else {
                            LinkedBlockingQueue linkedBlockingQueue2 = wi6.a;
                            wi6.b(new li5(hi5.n, queryParameter6, queryParameter, queryParameter2, queryParameter3));
                        }
                    } else {
                        LinkedBlockingQueue linkedBlockingQueue3 = wi6.a;
                        wi6.b(new li5(hi5.m, queryParameter4, queryParameter, queryParameter2, queryParameter3));
                        th = null;
                    }
                    ye4.a("ConnectInterfaceViewModel", "received teamviewer8");
                    b31Var3.q.m = true;
                } else {
                    th = null;
                }
                String str4 = str3;
                if (im3.n(data.getScheme(), "teamviewerapi") && im3.n(data.getHost(), "remotecontrol")) {
                    String queryParameter8 = data.getQueryParameter("remotecontrolid");
                    if (queryParameter8 == null || queryParameter8.length() == 0) {
                        str4 = str3;
                        str4 = str3;
                        ye4.c("ConnectInterfaceUIModel", "no ID found");
                        str4 = str3;
                    } else {
                        String queryParameter9 = data.getQueryParameter("mastersecret");
                        if (queryParameter9 == null || queryParameter9.length() == 0) {
                            str4 = str3;
                            str4 = str3;
                            ye4.c("ConnectInterfaceUIModel", "no Secret found");
                            str4 = str3;
                        } else {
                            String queryParameter10 = data.getQueryParameter("apidata");
                            if (queryParameter10 == null || (length = queryParameter10.length()) == 0) {
                                str4 = str3;
                                str2 = str3;
                                str2 = length;
                                str4 = str3;
                                str2 = str3;
                                ye4.c("ConnectInterfaceUIModel", "no API data found");
                                str4 = str2;
                            } else {
                                String queryParameter11 = data.getQueryParameter("keyid");
                                if (queryParameter11 == null || queryParameter11.length() == 0) {
                                    str4 = str3;
                                    str2 = str3;
                                    str2 = length;
                                    str4 = str3;
                                    str2 = str3;
                                    str2 = length;
                                    ye4.c("ConnectInterfaceUIModel", "no key found");
                                    str4 = queryParameter11;
                                } else {
                                    str4 = str3;
                                    str2 = str3;
                                    str2 = length;
                                    LinkedBlockingQueue linkedBlockingQueue4 = wi6.a;
                                    wi6.b(new gi5(queryParameter8, queryParameter9, queryParameter10, queryParameter11));
                                    ye4.a("ConnectInterfaceViewModel", "received teamviewer13");
                                }
                            }
                        }
                    }
                    str4 = str3;
                    if (!im3.n(data.getScheme(), "tvcontrol1")) {
                        if (im3.n(data.getScheme(), "file")) {
                            q7 q7Var = new q7(d31Var, data, (byte) 16);
                            ye4.a("ControlFile", "received tvc file");
                            xk1Var = new xk1(q7Var);
                            strQ = xk1Var.Q("Sign Configuration", "checksum");
                            inputStreamK = q7Var.k();
                            if (inputStreamK == null) {
                                ye4.c("FileHelper", "failure acquiring input stream");
                            } else {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                for (iAvailable = inputStreamK.available(); iAvailable != 0; iAvailable = inputStreamK.available()) {
                                    byte[] bArr = new byte[iAvailable];
                                    inputStreamK.read(bArr);
                                    byteArrayOutputStream.write(bArr);
                                }
                                String string = byteArrayOutputStream.toString();
                                lq1.n(byteArrayOutputStream);
                                lq1.n(inputStreamK);
                                r13 = string;
                                if (r13 != 0) {
                                    if (im3.n(ControlFileSWIGJNI.ControlFile_GetChecksum(r13), strQ)) {
                                        strQ2 = xk1Var.Q("TeamViewer Configuration", "controlID");
                                        String strQ3 = xk1Var.Q("TeamViewer Configuration", "targetID");
                                        ConnectionMode connectionModeFromString = ConnectionMode.fromString(xk1Var.Q("TeamViewer Configuration", "action"));
                                        String strQ4 = xk1Var.Q("Customer Configuration", "password");
                                        if (strQ2 == null) {
                                        }
                                    } else {
                                        ye4.c("ControlFile", "checksums are not equal");
                                    }
                                    if (!im3.n(data.getScheme(), "teamviewer8")) {
                                        if (im3.n(data.getScheme(), "http")) {
                                            List<String> pathSegments = data.getPathSegments();
                                            str = pathSegments.get(pathSegments.size() - 1);
                                            str.getClass();
                                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                            String strP0 = ub7.p0(str, "-");
                                            if (strS0.equals(str)) {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            } else {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            }
                                        } else {
                                            List<String> pathSegments2 = data.getPathSegments();
                                            str = pathSegments2.get(pathSegments2.size() - 1);
                                            str.getClass();
                                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                            String strP1 = ub7.p0(str, "-");
                                            if (strS0.equals(str)) {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            } else {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            }
                                        }
                                    } else if (im3.n(data.getScheme(), "http")) {
                                        List<String> pathSegments3 = data.getPathSegments();
                                        str = pathSegments3.get(pathSegments3.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP2 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    } else {
                                        List<String> pathSegments4 = data.getPathSegments();
                                        str = pathSegments4.get(pathSegments4.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP3 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    }
                                } else if (!im3.n(data.getScheme(), "teamviewer8")) {
                                    if (im3.n(data.getScheme(), "http")) {
                                        List<String> pathSegments5 = data.getPathSegments();
                                        str = pathSegments5.get(pathSegments5.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP4 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    } else {
                                        List<String> pathSegments6 = data.getPathSegments();
                                        str = pathSegments6.get(pathSegments6.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP5 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    }
                                } else if (im3.n(data.getScheme(), "http")) {
                                    List<String> pathSegments7 = data.getPathSegments();
                                    str = pathSegments7.get(pathSegments7.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP6 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                } else {
                                    List<String> pathSegments8 = data.getPathSegments();
                                    str = pathSegments8.get(pathSegments8.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP7 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                }
                            }
                            r13 = th;
                            if (r13 != 0) {
                                if (im3.n(ControlFileSWIGJNI.ControlFile_GetChecksum(r13), strQ)) {
                                    ye4.c("ControlFile", "checksums are not equal");
                                } else {
                                    strQ2 = xk1Var.Q("TeamViewer Configuration", "controlID");
                                    String strQ5 = xk1Var.Q("TeamViewer Configuration", "targetID");
                                    ConnectionMode connectionModeFromString2 = ConnectionMode.fromString(xk1Var.Q("TeamViewer Configuration", "action"));
                                    String strQ6 = xk1Var.Q("Customer Configuration", "password");
                                    if (strQ2 == null) {
                                    }
                                }
                                if (!im3.n(data.getScheme(), "teamviewer8")) {
                                    if (im3.n(data.getScheme(), "http")) {
                                        List<String> pathSegments9 = data.getPathSegments();
                                        str = pathSegments9.get(pathSegments9.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP8 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    } else {
                                        List<String> pathSegments10 = data.getPathSegments();
                                        str = pathSegments10.get(pathSegments10.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP9 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    }
                                } else if (im3.n(data.getScheme(), "http")) {
                                    List<String> pathSegments11 = data.getPathSegments();
                                    str = pathSegments11.get(pathSegments11.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP10 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                } else {
                                    List<String> pathSegments12 = data.getPathSegments();
                                    str = pathSegments12.get(pathSegments12.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP11 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                }
                            } else if (!im3.n(data.getScheme(), "teamviewer8")) {
                                if (im3.n(data.getScheme(), "http")) {
                                    List<String> pathSegments13 = data.getPathSegments();
                                    str = pathSegments13.get(pathSegments13.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP12 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                } else {
                                    List<String> pathSegments14 = data.getPathSegments();
                                    str = pathSegments14.get(pathSegments14.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP13 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                }
                            } else if (im3.n(data.getScheme(), "http")) {
                                List<String> pathSegments15 = data.getPathSegments();
                                str = pathSegments15.get(pathSegments15.size() - 1);
                                str.getClass();
                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                String strP14 = ub7.p0(str, "-");
                                if (strS0.equals(str)) {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                } else {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                }
                            } else {
                                List<String> pathSegments16 = data.getPathSegments();
                                str = pathSegments16.get(pathSegments16.size() - 1);
                                str.getClass();
                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                String strP15 = ub7.p0(str, "-");
                                if (strS0.equals(str)) {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                } else {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                }
                            }
                        } else {
                            q7 q7Var2 = new q7(d31Var, data, (byte) 16);
                            ye4.a("ControlFile", "received tvc file");
                            xk1Var = new xk1(q7Var2);
                            strQ = xk1Var.Q("Sign Configuration", "checksum");
                            inputStreamK = q7Var2.k();
                            if (inputStreamK == null) {
                                ye4.c("FileHelper", "failure acquiring input stream");
                            } else {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                while (iAvailable != 0) {
                                    byte[] bArr2 = new byte[iAvailable];
                                    inputStreamK.read(bArr2);
                                    byteArrayOutputStream.write(bArr2);
                                }
                                String string2 = byteArrayOutputStream.toString();
                                lq1.n(byteArrayOutputStream);
                                lq1.n(inputStreamK);
                                r13 = string2;
                                if (r13 != 0) {
                                    if (im3.n(ControlFileSWIGJNI.ControlFile_GetChecksum(r13), strQ)) {
                                        ye4.c("ControlFile", "checksums are not equal");
                                    } else {
                                        strQ2 = xk1Var.Q("TeamViewer Configuration", "controlID");
                                        String strQ7 = xk1Var.Q("TeamViewer Configuration", "targetID");
                                        ConnectionMode connectionModeFromString3 = ConnectionMode.fromString(xk1Var.Q("TeamViewer Configuration", "action"));
                                        String strQ8 = xk1Var.Q("Customer Configuration", "password");
                                        if (strQ2 == null) {
                                        }
                                    }
                                    if (!im3.n(data.getScheme(), "teamviewer8")) {
                                        if (im3.n(data.getScheme(), "http")) {
                                            List<String> pathSegments17 = data.getPathSegments();
                                            str = pathSegments17.get(pathSegments17.size() - 1);
                                            str.getClass();
                                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                            String strP16 = ub7.p0(str, "-");
                                            if (strS0.equals(str)) {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            } else {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            }
                                        } else {
                                            List<String> pathSegments18 = data.getPathSegments();
                                            str = pathSegments18.get(pathSegments18.size() - 1);
                                            str.getClass();
                                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                            String strP17 = ub7.p0(str, "-");
                                            if (strS0.equals(str)) {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            } else {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            }
                                        }
                                    } else if (im3.n(data.getScheme(), "http")) {
                                        List<String> pathSegments19 = data.getPathSegments();
                                        str = pathSegments19.get(pathSegments19.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP18 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    } else {
                                        List<String> pathSegments110 = data.getPathSegments();
                                        str = pathSegments110.get(pathSegments110.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP19 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    }
                                } else if (!im3.n(data.getScheme(), "teamviewer8")) {
                                    if (im3.n(data.getScheme(), "http")) {
                                        List<String> pathSegments111 = data.getPathSegments();
                                        str = pathSegments111.get(pathSegments111.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP110 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    } else {
                                        List<String> pathSegments112 = data.getPathSegments();
                                        str = pathSegments112.get(pathSegments112.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP111 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    }
                                } else if (im3.n(data.getScheme(), "http")) {
                                    List<String> pathSegments113 = data.getPathSegments();
                                    str = pathSegments113.get(pathSegments113.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP112 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                } else {
                                    List<String> pathSegments114 = data.getPathSegments();
                                    str = pathSegments114.get(pathSegments114.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP113 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                }
                            }
                            r13 = th;
                            if (r13 != 0) {
                                if (im3.n(ControlFileSWIGJNI.ControlFile_GetChecksum(r13), strQ)) {
                                    ye4.c("ControlFile", "checksums are not equal");
                                } else {
                                    strQ2 = xk1Var.Q("TeamViewer Configuration", "controlID");
                                    String strQ9 = xk1Var.Q("TeamViewer Configuration", "targetID");
                                    ConnectionMode connectionModeFromString4 = ConnectionMode.fromString(xk1Var.Q("TeamViewer Configuration", "action"));
                                    String strQ10 = xk1Var.Q("Customer Configuration", "password");
                                    if (strQ2 == null) {
                                    }
                                }
                                if (!im3.n(data.getScheme(), "teamviewer8")) {
                                    if (im3.n(data.getScheme(), "http")) {
                                        List<String> pathSegments115 = data.getPathSegments();
                                        str = pathSegments115.get(pathSegments115.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP114 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    } else {
                                        List<String> pathSegments116 = data.getPathSegments();
                                        str = pathSegments116.get(pathSegments116.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP115 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    }
                                } else if (im3.n(data.getScheme(), "http")) {
                                    List<String> pathSegments117 = data.getPathSegments();
                                    str = pathSegments117.get(pathSegments117.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP116 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                } else {
                                    List<String> pathSegments118 = data.getPathSegments();
                                    str = pathSegments118.get(pathSegments118.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP117 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                }
                            } else if (!im3.n(data.getScheme(), "teamviewer8")) {
                                if (im3.n(data.getScheme(), "http")) {
                                    List<String> pathSegments119 = data.getPathSegments();
                                    str = pathSegments119.get(pathSegments119.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP118 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                } else {
                                    List<String> pathSegments1110 = data.getPathSegments();
                                    str = pathSegments1110.get(pathSegments1110.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP119 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                }
                            } else if (im3.n(data.getScheme(), "http")) {
                                List<String> pathSegments1111 = data.getPathSegments();
                                str = pathSegments1111.get(pathSegments1111.size() - 1);
                                str.getClass();
                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                String strP1110 = ub7.p0(str, "-");
                                if (strS0.equals(str)) {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                } else {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                }
                            } else {
                                List<String> pathSegments1112 = data.getPathSegments();
                                str = pathSegments1112.get(pathSegments1112.size() - 1);
                                str.getClass();
                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                String strP1111 = ub7.p0(str, "-");
                                if (strS0.equals(str)) {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                } else {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                }
                            }
                        }
                    } else if (im3.n(data.getScheme(), "file")) {
                        q7 q7Var3 = new q7(d31Var, data, (byte) 16);
                        ye4.a("ControlFile", "received tvc file");
                        xk1Var = new xk1(q7Var3);
                        strQ = xk1Var.Q("Sign Configuration", "checksum");
                        inputStreamK = q7Var3.k();
                        if (inputStreamK == null) {
                            ye4.c("FileHelper", "failure acquiring input stream");
                        } else {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            while (iAvailable != 0) {
                                byte[] bArr3 = new byte[iAvailable];
                                inputStreamK.read(bArr3);
                                byteArrayOutputStream.write(bArr3);
                            }
                            String string3 = byteArrayOutputStream.toString();
                            lq1.n(byteArrayOutputStream);
                            lq1.n(inputStreamK);
                            r13 = string3;
                            if (r13 != 0) {
                                if (im3.n(ControlFileSWIGJNI.ControlFile_GetChecksum(r13), strQ)) {
                                    ye4.c("ControlFile", "checksums are not equal");
                                } else {
                                    strQ2 = xk1Var.Q("TeamViewer Configuration", "controlID");
                                    String strQ11 = xk1Var.Q("TeamViewer Configuration", "targetID");
                                    ConnectionMode connectionModeFromString5 = ConnectionMode.fromString(xk1Var.Q("TeamViewer Configuration", "action"));
                                    String strQ12 = xk1Var.Q("Customer Configuration", "password");
                                    if (strQ2 == null) {
                                    }
                                }
                                if (!im3.n(data.getScheme(), "teamviewer8")) {
                                    if (im3.n(data.getScheme(), "http")) {
                                        List<String> pathSegments1113 = data.getPathSegments();
                                        str = pathSegments1113.get(pathSegments1113.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP1112 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    } else {
                                        List<String> pathSegments1114 = data.getPathSegments();
                                        str = pathSegments1114.get(pathSegments1114.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP1113 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    }
                                } else if (im3.n(data.getScheme(), "http")) {
                                    List<String> pathSegments1115 = data.getPathSegments();
                                    str = pathSegments1115.get(pathSegments1115.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP1114 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                } else {
                                    List<String> pathSegments1116 = data.getPathSegments();
                                    str = pathSegments1116.get(pathSegments1116.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP1115 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                }
                            } else if (!im3.n(data.getScheme(), "teamviewer8")) {
                                if (im3.n(data.getScheme(), "http")) {
                                    List<String> pathSegments1117 = data.getPathSegments();
                                    str = pathSegments1117.get(pathSegments1117.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP1116 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                } else {
                                    List<String> pathSegments1118 = data.getPathSegments();
                                    str = pathSegments1118.get(pathSegments1118.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP1117 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                }
                            } else if (im3.n(data.getScheme(), "http")) {
                                List<String> pathSegments1119 = data.getPathSegments();
                                str = pathSegments1119.get(pathSegments1119.size() - 1);
                                str.getClass();
                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                String strP1118 = ub7.p0(str, "-");
                                if (strS0.equals(str)) {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                } else {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                }
                            } else {
                                List<String> pathSegments11110 = data.getPathSegments();
                                str = pathSegments11110.get(pathSegments11110.size() - 1);
                                str.getClass();
                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                String strP1119 = ub7.p0(str, "-");
                                if (strS0.equals(str)) {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                } else {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                }
                            }
                        }
                        r13 = th;
                        if (r13 != 0) {
                            if (im3.n(ControlFileSWIGJNI.ControlFile_GetChecksum(r13), strQ)) {
                                ye4.c("ControlFile", "checksums are not equal");
                            } else {
                                strQ2 = xk1Var.Q("TeamViewer Configuration", "controlID");
                                String strQ13 = xk1Var.Q("TeamViewer Configuration", "targetID");
                                ConnectionMode connectionModeFromString6 = ConnectionMode.fromString(xk1Var.Q("TeamViewer Configuration", "action"));
                                String strQ14 = xk1Var.Q("Customer Configuration", "password");
                                if (strQ2 == null) {
                                }
                            }
                            if (!im3.n(data.getScheme(), "teamviewer8")) {
                                if (im3.n(data.getScheme(), "http")) {
                                    List<String> pathSegments11111 = data.getPathSegments();
                                    str = pathSegments11111.get(pathSegments11111.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP11110 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                } else {
                                    List<String> pathSegments11112 = data.getPathSegments();
                                    str = pathSegments11112.get(pathSegments11112.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP11111 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                }
                            } else if (im3.n(data.getScheme(), "http")) {
                                List<String> pathSegments11113 = data.getPathSegments();
                                str = pathSegments11113.get(pathSegments11113.size() - 1);
                                str.getClass();
                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                String strP11112 = ub7.p0(str, "-");
                                if (strS0.equals(str)) {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                } else {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                }
                            } else {
                                List<String> pathSegments11114 = data.getPathSegments();
                                str = pathSegments11114.get(pathSegments11114.size() - 1);
                                str.getClass();
                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                String strP11113 = ub7.p0(str, "-");
                                if (strS0.equals(str)) {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                } else {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                }
                            }
                        } else if (!im3.n(data.getScheme(), "teamviewer8")) {
                            if (im3.n(data.getScheme(), "http")) {
                                List<String> pathSegments11115 = data.getPathSegments();
                                str = pathSegments11115.get(pathSegments11115.size() - 1);
                                str.getClass();
                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                String strP11114 = ub7.p0(str, "-");
                                if (strS0.equals(str)) {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                } else {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                }
                            } else {
                                List<String> pathSegments11116 = data.getPathSegments();
                                str = pathSegments11116.get(pathSegments11116.size() - 1);
                                str.getClass();
                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                String strP11115 = ub7.p0(str, "-");
                                if (strS0.equals(str)) {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                } else {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                }
                            }
                        } else if (im3.n(data.getScheme(), "http")) {
                            List<String> pathSegments11117 = data.getPathSegments();
                            str = pathSegments11117.get(pathSegments11117.size() - 1);
                            str.getClass();
                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                            String strP11116 = ub7.p0(str, "-");
                            if (strS0.equals(str)) {
                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                            } else {
                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                            }
                        } else {
                            List<String> pathSegments11118 = data.getPathSegments();
                            str = pathSegments11118.get(pathSegments11118.size() - 1);
                            str.getClass();
                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                            String strP11117 = ub7.p0(str, "-");
                            if (strS0.equals(str)) {
                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                            } else {
                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                            }
                        }
                    } else {
                        q7 q7Var4 = new q7(d31Var, data, (byte) 16);
                        ye4.a("ControlFile", "received tvc file");
                        xk1Var = new xk1(q7Var4);
                        strQ = xk1Var.Q("Sign Configuration", "checksum");
                        inputStreamK = q7Var4.k();
                        if (inputStreamK == null) {
                            ye4.c("FileHelper", "failure acquiring input stream");
                        } else {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            while (iAvailable != 0) {
                                byte[] bArr4 = new byte[iAvailable];
                                inputStreamK.read(bArr4);
                                byteArrayOutputStream.write(bArr4);
                            }
                            String string4 = byteArrayOutputStream.toString();
                            lq1.n(byteArrayOutputStream);
                            lq1.n(inputStreamK);
                            r13 = string4;
                            if (r13 != 0) {
                                if (im3.n(ControlFileSWIGJNI.ControlFile_GetChecksum(r13), strQ)) {
                                    ye4.c("ControlFile", "checksums are not equal");
                                } else {
                                    strQ2 = xk1Var.Q("TeamViewer Configuration", "controlID");
                                    String strQ15 = xk1Var.Q("TeamViewer Configuration", "targetID");
                                    ConnectionMode connectionModeFromString7 = ConnectionMode.fromString(xk1Var.Q("TeamViewer Configuration", "action"));
                                    String strQ16 = xk1Var.Q("Customer Configuration", "password");
                                    if (strQ2 == null) {
                                    }
                                }
                                if (!im3.n(data.getScheme(), "teamviewer8")) {
                                    if (im3.n(data.getScheme(), "http")) {
                                        List<String> pathSegments11119 = data.getPathSegments();
                                        str = pathSegments11119.get(pathSegments11119.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP11118 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    } else {
                                        List<String> pathSegments111110 = data.getPathSegments();
                                        str = pathSegments111110.get(pathSegments111110.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP11119 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    }
                                } else if (im3.n(data.getScheme(), "http")) {
                                    List<String> pathSegments111111 = data.getPathSegments();
                                    str = pathSegments111111.get(pathSegments111111.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP111110 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                } else {
                                    List<String> pathSegments111112 = data.getPathSegments();
                                    str = pathSegments111112.get(pathSegments111112.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP111111 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                }
                            } else if (!im3.n(data.getScheme(), "teamviewer8")) {
                                if (im3.n(data.getScheme(), "http")) {
                                    List<String> pathSegments111113 = data.getPathSegments();
                                    str = pathSegments111113.get(pathSegments111113.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP111112 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                } else {
                                    List<String> pathSegments111114 = data.getPathSegments();
                                    str = pathSegments111114.get(pathSegments111114.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP111113 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                }
                            } else if (im3.n(data.getScheme(), "http")) {
                                List<String> pathSegments111115 = data.getPathSegments();
                                str = pathSegments111115.get(pathSegments111115.size() - 1);
                                str.getClass();
                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                String strP111114 = ub7.p0(str, "-");
                                if (strS0.equals(str)) {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                } else {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                }
                            } else {
                                List<String> pathSegments111116 = data.getPathSegments();
                                str = pathSegments111116.get(pathSegments111116.size() - 1);
                                str.getClass();
                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                String strP111115 = ub7.p0(str, "-");
                                if (strS0.equals(str)) {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                } else {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                }
                            }
                        }
                        r13 = th;
                        if (r13 != 0) {
                            if (im3.n(ControlFileSWIGJNI.ControlFile_GetChecksum(r13), strQ)) {
                                ye4.c("ControlFile", "checksums are not equal");
                            } else {
                                strQ2 = xk1Var.Q("TeamViewer Configuration", "controlID");
                                String strQ17 = xk1Var.Q("TeamViewer Configuration", "targetID");
                                ConnectionMode connectionModeFromString8 = ConnectionMode.fromString(xk1Var.Q("TeamViewer Configuration", "action"));
                                String strQ18 = xk1Var.Q("Customer Configuration", "password");
                                if (strQ2 == null) {
                                }
                            }
                            if (!im3.n(data.getScheme(), "teamviewer8")) {
                                if (im3.n(data.getScheme(), "http")) {
                                    List<String> pathSegments111117 = data.getPathSegments();
                                    str = pathSegments111117.get(pathSegments111117.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP111116 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                } else {
                                    List<String> pathSegments111118 = data.getPathSegments();
                                    str = pathSegments111118.get(pathSegments111118.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP111117 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                }
                            } else if (im3.n(data.getScheme(), "http")) {
                                List<String> pathSegments111119 = data.getPathSegments();
                                str = pathSegments111119.get(pathSegments111119.size() - 1);
                                str.getClass();
                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                String strP111118 = ub7.p0(str, "-");
                                if (strS0.equals(str)) {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                } else {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                }
                            } else {
                                List<String> pathSegments1111110 = data.getPathSegments();
                                str = pathSegments1111110.get(pathSegments1111110.size() - 1);
                                str.getClass();
                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                String strP111119 = ub7.p0(str, "-");
                                if (strS0.equals(str)) {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                } else {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                }
                            }
                        } else if (!im3.n(data.getScheme(), "teamviewer8")) {
                            if (im3.n(data.getScheme(), "http")) {
                                List<String> pathSegments1111111 = data.getPathSegments();
                                str = pathSegments1111111.get(pathSegments1111111.size() - 1);
                                str.getClass();
                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                String strP1111110 = ub7.p0(str, "-");
                                if (strS0.equals(str)) {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                } else {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                }
                            } else {
                                List<String> pathSegments1111112 = data.getPathSegments();
                                str = pathSegments1111112.get(pathSegments1111112.size() - 1);
                                str.getClass();
                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                String strP1111111 = ub7.p0(str, "-");
                                if (strS0.equals(str)) {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                } else {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                }
                            }
                        } else if (im3.n(data.getScheme(), "http")) {
                            List<String> pathSegments1111113 = data.getPathSegments();
                            str = pathSegments1111113.get(pathSegments1111113.size() - 1);
                            str.getClass();
                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                            String strP1111112 = ub7.p0(str, "-");
                            if (strS0.equals(str)) {
                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                            } else {
                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                            }
                        } else {
                            List<String> pathSegments1111114 = data.getPathSegments();
                            str = pathSegments1111114.get(pathSegments1111114.size() - 1);
                            str.getClass();
                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                            String strP1111113 = ub7.p0(str, "-");
                            if (strS0.equals(str)) {
                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                            } else {
                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                            }
                        }
                    }
                } else {
                    str4 = str3;
                    if (!im3.n(data.getScheme(), "tvcontrol1") && im3.n(data.getHost(), "control")) {
                        ae aeVar = new ae((byte) 12);
                        aeVar.b = -1;
                        aeVar.d = ij6.n;
                        String queryParameter12 = data.getQueryParameter("device");
                        if (queryParameter12 == null || !TextUtils.isDigitsOnly(queryParameter12)) {
                            String queryParameter13 = data.getQueryParameter("contact");
                            if (queryParameter13 == null || !TextUtils.isDigitsOnly(queryParameter13)) {
                                ye4.c("SchemeDataControlPage", "error parsing - no valid device or contact parameter");
                            } else {
                                aeVar.b = Integer.parseInt(queryParameter13);
                            }
                            r1 = th;
                            if (r1 == 0) {
                                wi6.b(new ei5(r1));
                                ye4.a("ConnectInterfaceViewModel", "received controlpage");
                            } else if (im3.n(data.getScheme(), "file")) {
                                q7 q7Var5 = new q7(d31Var, data, (byte) 16);
                                ye4.a("ControlFile", "received tvc file");
                                xk1Var = new xk1(q7Var5);
                                strQ = xk1Var.Q("Sign Configuration", "checksum");
                                inputStreamK = q7Var5.k();
                                if (inputStreamK == null) {
                                    ye4.c("FileHelper", "failure acquiring input stream");
                                } else {
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    while (iAvailable != 0) {
                                        byte[] bArr5 = new byte[iAvailable];
                                        inputStreamK.read(bArr5);
                                        byteArrayOutputStream.write(bArr5);
                                    }
                                    String string5 = byteArrayOutputStream.toString();
                                    lq1.n(byteArrayOutputStream);
                                    lq1.n(inputStreamK);
                                    r13 = string5;
                                    if (r13 != 0) {
                                        if (im3.n(ControlFileSWIGJNI.ControlFile_GetChecksum(r13), strQ)) {
                                            ye4.c("ControlFile", "checksums are not equal");
                                        } else {
                                            strQ2 = xk1Var.Q("TeamViewer Configuration", "controlID");
                                            String strQ19 = xk1Var.Q("TeamViewer Configuration", "targetID");
                                            ConnectionMode connectionModeFromString9 = ConnectionMode.fromString(xk1Var.Q("TeamViewer Configuration", "action"));
                                            String strQ110 = xk1Var.Q("Customer Configuration", "password");
                                            if (strQ2 == null) {
                                            }
                                        }
                                        if (!im3.n(data.getScheme(), "teamviewer8")) {
                                            if (im3.n(data.getScheme(), "http")) {
                                                List<String> pathSegments1111115 = data.getPathSegments();
                                                str = pathSegments1111115.get(pathSegments1111115.size() - 1);
                                                str.getClass();
                                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                                String strP1111114 = ub7.p0(str, "-");
                                                if (strS0.equals(str)) {
                                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                                } else {
                                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                                }
                                            } else {
                                                List<String> pathSegments1111116 = data.getPathSegments();
                                                str = pathSegments1111116.get(pathSegments1111116.size() - 1);
                                                str.getClass();
                                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                                String strP1111115 = ub7.p0(str, "-");
                                                if (strS0.equals(str)) {
                                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                                } else {
                                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                                }
                                            }
                                        } else if (im3.n(data.getScheme(), "http")) {
                                            List<String> pathSegments1111117 = data.getPathSegments();
                                            str = pathSegments1111117.get(pathSegments1111117.size() - 1);
                                            str.getClass();
                                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                            String strP1111116 = ub7.p0(str, "-");
                                            if (strS0.equals(str)) {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            } else {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            }
                                        } else {
                                            List<String> pathSegments1111118 = data.getPathSegments();
                                            str = pathSegments1111118.get(pathSegments1111118.size() - 1);
                                            str.getClass();
                                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                            String strP1111117 = ub7.p0(str, "-");
                                            if (strS0.equals(str)) {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            } else {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            }
                                        }
                                    } else if (!im3.n(data.getScheme(), "teamviewer8")) {
                                        if (im3.n(data.getScheme(), "http")) {
                                            List<String> pathSegments1111119 = data.getPathSegments();
                                            str = pathSegments1111119.get(pathSegments1111119.size() - 1);
                                            str.getClass();
                                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                            String strP1111118 = ub7.p0(str, "-");
                                            if (strS0.equals(str)) {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            } else {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            }
                                        } else {
                                            List<String> pathSegments11111110 = data.getPathSegments();
                                            str = pathSegments11111110.get(pathSegments11111110.size() - 1);
                                            str.getClass();
                                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                            String strP1111119 = ub7.p0(str, "-");
                                            if (strS0.equals(str)) {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            } else {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            }
                                        }
                                    } else if (im3.n(data.getScheme(), "http")) {
                                        List<String> pathSegments11111111 = data.getPathSegments();
                                        str = pathSegments11111111.get(pathSegments11111111.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP11111110 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    } else {
                                        List<String> pathSegments11111112 = data.getPathSegments();
                                        str = pathSegments11111112.get(pathSegments11111112.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP11111111 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    }
                                }
                                r13 = th;
                                if (r13 != 0) {
                                    if (im3.n(ControlFileSWIGJNI.ControlFile_GetChecksum(r13), strQ)) {
                                        ye4.c("ControlFile", "checksums are not equal");
                                    } else {
                                        strQ2 = xk1Var.Q("TeamViewer Configuration", "controlID");
                                        String strQ111 = xk1Var.Q("TeamViewer Configuration", "targetID");
                                        ConnectionMode connectionModeFromString10 = ConnectionMode.fromString(xk1Var.Q("TeamViewer Configuration", "action"));
                                        String strQ112 = xk1Var.Q("Customer Configuration", "password");
                                        if (strQ2 == null) {
                                        }
                                    }
                                    if (!im3.n(data.getScheme(), "teamviewer8")) {
                                        if (im3.n(data.getScheme(), "http")) {
                                            List<String> pathSegments11111113 = data.getPathSegments();
                                            str = pathSegments11111113.get(pathSegments11111113.size() - 1);
                                            str.getClass();
                                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                            String strP11111112 = ub7.p0(str, "-");
                                            if (strS0.equals(str)) {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            } else {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            }
                                        } else {
                                            List<String> pathSegments11111114 = data.getPathSegments();
                                            str = pathSegments11111114.get(pathSegments11111114.size() - 1);
                                            str.getClass();
                                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                            String strP11111113 = ub7.p0(str, "-");
                                            if (strS0.equals(str)) {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            } else {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            }
                                        }
                                    } else if (im3.n(data.getScheme(), "http")) {
                                        List<String> pathSegments11111115 = data.getPathSegments();
                                        str = pathSegments11111115.get(pathSegments11111115.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP11111114 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    } else {
                                        List<String> pathSegments11111116 = data.getPathSegments();
                                        str = pathSegments11111116.get(pathSegments11111116.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP11111115 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    }
                                } else if (!im3.n(data.getScheme(), "teamviewer8")) {
                                    if (im3.n(data.getScheme(), "http")) {
                                        List<String> pathSegments11111117 = data.getPathSegments();
                                        str = pathSegments11111117.get(pathSegments11111117.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP11111116 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    } else {
                                        List<String> pathSegments11111118 = data.getPathSegments();
                                        str = pathSegments11111118.get(pathSegments11111118.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP11111117 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    }
                                } else if (im3.n(data.getScheme(), "http")) {
                                    List<String> pathSegments11111119 = data.getPathSegments();
                                    str = pathSegments11111119.get(pathSegments11111119.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP11111118 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                } else {
                                    List<String> pathSegments111111110 = data.getPathSegments();
                                    str = pathSegments111111110.get(pathSegments111111110.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP11111119 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                }
                            } else {
                                q7 q7Var6 = new q7(d31Var, data, (byte) 16);
                                ye4.a("ControlFile", "received tvc file");
                                xk1Var = new xk1(q7Var6);
                                strQ = xk1Var.Q("Sign Configuration", "checksum");
                                inputStreamK = q7Var6.k();
                                if (inputStreamK == null) {
                                    ye4.c("FileHelper", "failure acquiring input stream");
                                } else {
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    while (iAvailable != 0) {
                                        byte[] bArr6 = new byte[iAvailable];
                                        inputStreamK.read(bArr6);
                                        byteArrayOutputStream.write(bArr6);
                                    }
                                    String string6 = byteArrayOutputStream.toString();
                                    lq1.n(byteArrayOutputStream);
                                    lq1.n(inputStreamK);
                                    r13 = string6;
                                    if (r13 != 0) {
                                        if (im3.n(ControlFileSWIGJNI.ControlFile_GetChecksum(r13), strQ)) {
                                            ye4.c("ControlFile", "checksums are not equal");
                                        } else {
                                            strQ2 = xk1Var.Q("TeamViewer Configuration", "controlID");
                                            String strQ113 = xk1Var.Q("TeamViewer Configuration", "targetID");
                                            ConnectionMode connectionModeFromString11 = ConnectionMode.fromString(xk1Var.Q("TeamViewer Configuration", "action"));
                                            String strQ114 = xk1Var.Q("Customer Configuration", "password");
                                            if (strQ2 == null) {
                                            }
                                        }
                                        if (!im3.n(data.getScheme(), "teamviewer8")) {
                                            if (im3.n(data.getScheme(), "http")) {
                                                List<String> pathSegments111111111 = data.getPathSegments();
                                                str = pathSegments111111111.get(pathSegments111111111.size() - 1);
                                                str.getClass();
                                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                                String strP111111110 = ub7.p0(str, "-");
                                                if (strS0.equals(str)) {
                                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                                } else {
                                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                                }
                                            } else {
                                                List<String> pathSegments111111112 = data.getPathSegments();
                                                str = pathSegments111111112.get(pathSegments111111112.size() - 1);
                                                str.getClass();
                                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                                String strP111111111 = ub7.p0(str, "-");
                                                if (strS0.equals(str)) {
                                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                                } else {
                                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                                }
                                            }
                                        } else if (im3.n(data.getScheme(), "http")) {
                                            List<String> pathSegments111111113 = data.getPathSegments();
                                            str = pathSegments111111113.get(pathSegments111111113.size() - 1);
                                            str.getClass();
                                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                            String strP111111112 = ub7.p0(str, "-");
                                            if (strS0.equals(str)) {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            } else {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            }
                                        } else {
                                            List<String> pathSegments111111114 = data.getPathSegments();
                                            str = pathSegments111111114.get(pathSegments111111114.size() - 1);
                                            str.getClass();
                                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                            String strP111111113 = ub7.p0(str, "-");
                                            if (strS0.equals(str)) {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            } else {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            }
                                        }
                                    } else if (!im3.n(data.getScheme(), "teamviewer8")) {
                                        if (im3.n(data.getScheme(), "http")) {
                                            List<String> pathSegments111111115 = data.getPathSegments();
                                            str = pathSegments111111115.get(pathSegments111111115.size() - 1);
                                            str.getClass();
                                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                            String strP111111114 = ub7.p0(str, "-");
                                            if (strS0.equals(str)) {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            } else {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            }
                                        } else {
                                            List<String> pathSegments111111116 = data.getPathSegments();
                                            str = pathSegments111111116.get(pathSegments111111116.size() - 1);
                                            str.getClass();
                                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                            String strP111111115 = ub7.p0(str, "-");
                                            if (strS0.equals(str)) {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            } else {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            }
                                        }
                                    } else if (im3.n(data.getScheme(), "http")) {
                                        List<String> pathSegments111111117 = data.getPathSegments();
                                        str = pathSegments111111117.get(pathSegments111111117.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP111111116 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    } else {
                                        List<String> pathSegments111111118 = data.getPathSegments();
                                        str = pathSegments111111118.get(pathSegments111111118.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP111111117 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    }
                                }
                                r13 = th;
                                if (r13 != 0) {
                                    if (im3.n(ControlFileSWIGJNI.ControlFile_GetChecksum(r13), strQ)) {
                                        ye4.c("ControlFile", "checksums are not equal");
                                    } else {
                                        strQ2 = xk1Var.Q("TeamViewer Configuration", "controlID");
                                        String strQ115 = xk1Var.Q("TeamViewer Configuration", "targetID");
                                        ConnectionMode connectionModeFromString12 = ConnectionMode.fromString(xk1Var.Q("TeamViewer Configuration", "action"));
                                        String strQ116 = xk1Var.Q("Customer Configuration", "password");
                                        if (strQ2 == null) {
                                        }
                                    }
                                    if (!im3.n(data.getScheme(), "teamviewer8")) {
                                        if (im3.n(data.getScheme(), "http")) {
                                            List<String> pathSegments111111119 = data.getPathSegments();
                                            str = pathSegments111111119.get(pathSegments111111119.size() - 1);
                                            str.getClass();
                                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                            String strP111111118 = ub7.p0(str, "-");
                                            if (strS0.equals(str)) {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            } else {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            }
                                        } else {
                                            List<String> pathSegments1111111110 = data.getPathSegments();
                                            str = pathSegments1111111110.get(pathSegments1111111110.size() - 1);
                                            str.getClass();
                                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                            String strP111111119 = ub7.p0(str, "-");
                                            if (strS0.equals(str)) {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            } else {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            }
                                        }
                                    } else if (im3.n(data.getScheme(), "http")) {
                                        List<String> pathSegments1111111111 = data.getPathSegments();
                                        str = pathSegments1111111111.get(pathSegments1111111111.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP1111111110 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    } else {
                                        List<String> pathSegments1111111112 = data.getPathSegments();
                                        str = pathSegments1111111112.get(pathSegments1111111112.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP1111111111 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    }
                                } else if (!im3.n(data.getScheme(), "teamviewer8")) {
                                    if (im3.n(data.getScheme(), "http")) {
                                        List<String> pathSegments1111111113 = data.getPathSegments();
                                        str = pathSegments1111111113.get(pathSegments1111111113.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP1111111112 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    } else {
                                        List<String> pathSegments1111111114 = data.getPathSegments();
                                        str = pathSegments1111111114.get(pathSegments1111111114.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP1111111113 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    }
                                } else if (im3.n(data.getScheme(), "http")) {
                                    List<String> pathSegments1111111115 = data.getPathSegments();
                                    str = pathSegments1111111115.get(pathSegments1111111115.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP1111111114 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                } else {
                                    List<String> pathSegments1111111116 = data.getPathSegments();
                                    str = pathSegments1111111116.get(pathSegments1111111116.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP1111111115 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                }
                            }
                        } else {
                            aeVar.c = queryParameter12;
                        }
                        String queryParameter14 = data.getQueryParameter("authorization");
                        r1 = aeVar;
                        if (queryParameter14 != null) {
                            try {
                                aeVar.d = ij6.valueOf(queryParameter14);
                                r1 = aeVar;
                            } catch (IllegalArgumentException unused) {
                                ye4.c("SchemeDataControlPage", "error parsing auth - illegal argument");
                                r1 = th;
                            }
                        }
                        if (r1 == 0) {
                            wi6.b(new ei5(r1));
                            ye4.a("ConnectInterfaceViewModel", "received controlpage");
                        } else if (im3.n(data.getScheme(), "file")) {
                            q7 q7Var7 = new q7(d31Var, data, (byte) 16);
                            ye4.a("ControlFile", "received tvc file");
                            xk1Var = new xk1(q7Var7);
                            strQ = xk1Var.Q("Sign Configuration", "checksum");
                            inputStreamK = q7Var7.k();
                            if (inputStreamK == null) {
                                ye4.c("FileHelper", "failure acquiring input stream");
                            } else {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                while (iAvailable != 0) {
                                    byte[] bArr7 = new byte[iAvailable];
                                    inputStreamK.read(bArr7);
                                    byteArrayOutputStream.write(bArr7);
                                }
                                String string7 = byteArrayOutputStream.toString();
                                lq1.n(byteArrayOutputStream);
                                lq1.n(inputStreamK);
                                r13 = string7;
                                if (r13 != 0) {
                                    if (im3.n(ControlFileSWIGJNI.ControlFile_GetChecksum(r13), strQ)) {
                                        ye4.c("ControlFile", "checksums are not equal");
                                    } else {
                                        strQ2 = xk1Var.Q("TeamViewer Configuration", "controlID");
                                        String strQ117 = xk1Var.Q("TeamViewer Configuration", "targetID");
                                        ConnectionMode connectionModeFromString13 = ConnectionMode.fromString(xk1Var.Q("TeamViewer Configuration", "action"));
                                        String strQ118 = xk1Var.Q("Customer Configuration", "password");
                                        if (strQ2 == null) {
                                        }
                                    }
                                    if (!im3.n(data.getScheme(), "teamviewer8")) {
                                        if (im3.n(data.getScheme(), "http")) {
                                            List<String> pathSegments1111111117 = data.getPathSegments();
                                            str = pathSegments1111111117.get(pathSegments1111111117.size() - 1);
                                            str.getClass();
                                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                            String strP1111111116 = ub7.p0(str, "-");
                                            if (strS0.equals(str)) {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            } else {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            }
                                        } else {
                                            List<String> pathSegments1111111118 = data.getPathSegments();
                                            str = pathSegments1111111118.get(pathSegments1111111118.size() - 1);
                                            str.getClass();
                                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                            String strP1111111117 = ub7.p0(str, "-");
                                            if (strS0.equals(str)) {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            } else {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            }
                                        }
                                    } else if (im3.n(data.getScheme(), "http")) {
                                        List<String> pathSegments1111111119 = data.getPathSegments();
                                        str = pathSegments1111111119.get(pathSegments1111111119.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP1111111118 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    } else {
                                        List<String> pathSegments11111111110 = data.getPathSegments();
                                        str = pathSegments11111111110.get(pathSegments11111111110.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP1111111119 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    }
                                } else if (!im3.n(data.getScheme(), "teamviewer8")) {
                                    if (im3.n(data.getScheme(), "http")) {
                                        List<String> pathSegments11111111111 = data.getPathSegments();
                                        str = pathSegments11111111111.get(pathSegments11111111111.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP11111111110 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    } else {
                                        List<String> pathSegments11111111112 = data.getPathSegments();
                                        str = pathSegments11111111112.get(pathSegments11111111112.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP11111111111 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    }
                                } else if (im3.n(data.getScheme(), "http")) {
                                    List<String> pathSegments11111111113 = data.getPathSegments();
                                    str = pathSegments11111111113.get(pathSegments11111111113.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP11111111112 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                } else {
                                    List<String> pathSegments11111111114 = data.getPathSegments();
                                    str = pathSegments11111111114.get(pathSegments11111111114.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP11111111113 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                }
                            }
                            r13 = th;
                            if (r13 != 0) {
                                if (im3.n(ControlFileSWIGJNI.ControlFile_GetChecksum(r13), strQ)) {
                                    ye4.c("ControlFile", "checksums are not equal");
                                } else {
                                    strQ2 = xk1Var.Q("TeamViewer Configuration", "controlID");
                                    String strQ119 = xk1Var.Q("TeamViewer Configuration", "targetID");
                                    ConnectionMode connectionModeFromString14 = ConnectionMode.fromString(xk1Var.Q("TeamViewer Configuration", "action"));
                                    String strQ1110 = xk1Var.Q("Customer Configuration", "password");
                                    if (strQ2 == null) {
                                    }
                                }
                                if (!im3.n(data.getScheme(), "teamviewer8")) {
                                    if (im3.n(data.getScheme(), "http")) {
                                        List<String> pathSegments11111111115 = data.getPathSegments();
                                        str = pathSegments11111111115.get(pathSegments11111111115.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP11111111114 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    } else {
                                        List<String> pathSegments11111111116 = data.getPathSegments();
                                        str = pathSegments11111111116.get(pathSegments11111111116.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP11111111115 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    }
                                } else if (im3.n(data.getScheme(), "http")) {
                                    List<String> pathSegments11111111117 = data.getPathSegments();
                                    str = pathSegments11111111117.get(pathSegments11111111117.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP11111111116 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                } else {
                                    List<String> pathSegments11111111118 = data.getPathSegments();
                                    str = pathSegments11111111118.get(pathSegments11111111118.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP11111111117 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                }
                            } else if (!im3.n(data.getScheme(), "teamviewer8")) {
                                if (im3.n(data.getScheme(), "http")) {
                                    List<String> pathSegments11111111119 = data.getPathSegments();
                                    str = pathSegments11111111119.get(pathSegments11111111119.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP11111111118 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                } else {
                                    List<String> pathSegments111111111110 = data.getPathSegments();
                                    str = pathSegments111111111110.get(pathSegments111111111110.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP11111111119 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                }
                            } else if (im3.n(data.getScheme(), "http")) {
                                List<String> pathSegments111111111111 = data.getPathSegments();
                                str = pathSegments111111111111.get(pathSegments111111111111.size() - 1);
                                str.getClass();
                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                String strP111111111110 = ub7.p0(str, "-");
                                if (strS0.equals(str)) {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                } else {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                }
                            } else {
                                List<String> pathSegments111111111112 = data.getPathSegments();
                                str = pathSegments111111111112.get(pathSegments111111111112.size() - 1);
                                str.getClass();
                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                String strP111111111111 = ub7.p0(str, "-");
                                if (strS0.equals(str)) {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                } else {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                }
                            }
                        } else {
                            q7 q7Var8 = new q7(d31Var, data, (byte) 16);
                            ye4.a("ControlFile", "received tvc file");
                            xk1Var = new xk1(q7Var8);
                            strQ = xk1Var.Q("Sign Configuration", "checksum");
                            inputStreamK = q7Var8.k();
                            if (inputStreamK == null) {
                                ye4.c("FileHelper", "failure acquiring input stream");
                            } else {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                while (iAvailable != 0) {
                                    byte[] bArr8 = new byte[iAvailable];
                                    inputStreamK.read(bArr8);
                                    byteArrayOutputStream.write(bArr8);
                                }
                                String string8 = byteArrayOutputStream.toString();
                                lq1.n(byteArrayOutputStream);
                                lq1.n(inputStreamK);
                                r13 = string8;
                                if (r13 != 0) {
                                    if (im3.n(ControlFileSWIGJNI.ControlFile_GetChecksum(r13), strQ)) {
                                        ye4.c("ControlFile", "checksums are not equal");
                                    } else {
                                        strQ2 = xk1Var.Q("TeamViewer Configuration", "controlID");
                                        String strQ1111 = xk1Var.Q("TeamViewer Configuration", "targetID");
                                        ConnectionMode connectionModeFromString15 = ConnectionMode.fromString(xk1Var.Q("TeamViewer Configuration", "action"));
                                        String strQ1112 = xk1Var.Q("Customer Configuration", "password");
                                        if (strQ2 == null) {
                                        }
                                    }
                                    if (!im3.n(data.getScheme(), "teamviewer8")) {
                                        if (im3.n(data.getScheme(), "http")) {
                                            List<String> pathSegments111111111113 = data.getPathSegments();
                                            str = pathSegments111111111113.get(pathSegments111111111113.size() - 1);
                                            str.getClass();
                                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                            String strP111111111112 = ub7.p0(str, "-");
                                            if (strS0.equals(str)) {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            } else {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            }
                                        } else {
                                            List<String> pathSegments111111111114 = data.getPathSegments();
                                            str = pathSegments111111111114.get(pathSegments111111111114.size() - 1);
                                            str.getClass();
                                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                            String strP111111111113 = ub7.p0(str, "-");
                                            if (strS0.equals(str)) {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            } else {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            }
                                        }
                                    } else if (im3.n(data.getScheme(), "http")) {
                                        List<String> pathSegments111111111115 = data.getPathSegments();
                                        str = pathSegments111111111115.get(pathSegments111111111115.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP111111111114 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    } else {
                                        List<String> pathSegments111111111116 = data.getPathSegments();
                                        str = pathSegments111111111116.get(pathSegments111111111116.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP111111111115 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    }
                                } else if (!im3.n(data.getScheme(), "teamviewer8")) {
                                    if (im3.n(data.getScheme(), "http")) {
                                        List<String> pathSegments111111111117 = data.getPathSegments();
                                        str = pathSegments111111111117.get(pathSegments111111111117.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP111111111116 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    } else {
                                        List<String> pathSegments111111111118 = data.getPathSegments();
                                        str = pathSegments111111111118.get(pathSegments111111111118.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP111111111117 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    }
                                } else if (im3.n(data.getScheme(), "http")) {
                                    List<String> pathSegments111111111119 = data.getPathSegments();
                                    str = pathSegments111111111119.get(pathSegments111111111119.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP111111111118 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                } else {
                                    List<String> pathSegments1111111111110 = data.getPathSegments();
                                    str = pathSegments1111111111110.get(pathSegments1111111111110.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP111111111119 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                }
                            }
                            r13 = th;
                            if (r13 != 0) {
                                if (im3.n(ControlFileSWIGJNI.ControlFile_GetChecksum(r13), strQ)) {
                                    ye4.c("ControlFile", "checksums are not equal");
                                } else {
                                    strQ2 = xk1Var.Q("TeamViewer Configuration", "controlID");
                                    String strQ1113 = xk1Var.Q("TeamViewer Configuration", "targetID");
                                    ConnectionMode connectionModeFromString16 = ConnectionMode.fromString(xk1Var.Q("TeamViewer Configuration", "action"));
                                    String strQ1114 = xk1Var.Q("Customer Configuration", "password");
                                    if (strQ2 == null) {
                                    }
                                }
                                if (!im3.n(data.getScheme(), "teamviewer8")) {
                                    if (im3.n(data.getScheme(), "http")) {
                                        List<String> pathSegments1111111111111 = data.getPathSegments();
                                        str = pathSegments1111111111111.get(pathSegments1111111111111.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP1111111111110 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    } else {
                                        List<String> pathSegments1111111111112 = data.getPathSegments();
                                        str = pathSegments1111111111112.get(pathSegments1111111111112.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP1111111111111 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    }
                                } else if (im3.n(data.getScheme(), "http")) {
                                    List<String> pathSegments1111111111113 = data.getPathSegments();
                                    str = pathSegments1111111111113.get(pathSegments1111111111113.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP1111111111112 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                } else {
                                    List<String> pathSegments1111111111114 = data.getPathSegments();
                                    str = pathSegments1111111111114.get(pathSegments1111111111114.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP1111111111113 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                }
                            } else if (!im3.n(data.getScheme(), "teamviewer8")) {
                                if (im3.n(data.getScheme(), "http")) {
                                    List<String> pathSegments1111111111115 = data.getPathSegments();
                                    str = pathSegments1111111111115.get(pathSegments1111111111115.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP1111111111114 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                } else {
                                    List<String> pathSegments1111111111116 = data.getPathSegments();
                                    str = pathSegments1111111111116.get(pathSegments1111111111116.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP1111111111115 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                }
                            } else if (im3.n(data.getScheme(), "http")) {
                                List<String> pathSegments1111111111117 = data.getPathSegments();
                                str = pathSegments1111111111117.get(pathSegments1111111111117.size() - 1);
                                str.getClass();
                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                String strP1111111111116 = ub7.p0(str, "-");
                                if (strS0.equals(str)) {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                } else {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                }
                            } else {
                                List<String> pathSegments1111111111118 = data.getPathSegments();
                                str = pathSegments1111111111118.get(pathSegments1111111111118.size() - 1);
                                str.getClass();
                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                String strP1111111111117 = ub7.p0(str, "-");
                                if (strS0.equals(str)) {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                } else {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                }
                            }
                        }
                    } else if (im3.n(data.getScheme(), "file") || im3.n(data.getScheme(), "content")) {
                        q7 q7Var9 = new q7(d31Var, data, (byte) 16);
                        ye4.a("ControlFile", "received tvc file");
                        xk1Var = new xk1(q7Var9);
                        strQ = xk1Var.Q("Sign Configuration", "checksum");
                        inputStreamK = q7Var9.k();
                        try {
                            if (inputStreamK == null) {
                                ye4.c("FileHelper", "failure acquiring input stream");
                            } else {
                                try {
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    try {
                                        while (iAvailable != 0) {
                                            byte[] bArr9 = new byte[iAvailable];
                                            inputStreamK.read(bArr9);
                                            byteArrayOutputStream.write(bArr9);
                                        }
                                        String string9 = byteArrayOutputStream.toString();
                                        lq1.n(byteArrayOutputStream);
                                        lq1.n(inputStreamK);
                                        r13 = string9;
                                    } catch (IOException unused2) {
                                        ye4.c("FileHelper", "readFileToString: ioexception");
                                        lq1.n(byteArrayOutputStream);
                                        lq1.n(inputStreamK);
                                        r13 = th;
                                    }
                                } catch (IOException unused3) {
                                    byteArrayOutputStream = th;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r8 = th;
                                    lq1.n(r8);
                                    lq1.n(inputStreamK);
                                    throw th;
                                }
                                if (r13 != 0) {
                                    if (im3.n(ControlFileSWIGJNI.ControlFile_GetChecksum(r13), strQ)) {
                                        ye4.c("ControlFile", "checksums are not equal");
                                    } else {
                                        strQ2 = xk1Var.Q("TeamViewer Configuration", "controlID");
                                        String strQ1115 = xk1Var.Q("TeamViewer Configuration", "targetID");
                                        ConnectionMode connectionModeFromString17 = ConnectionMode.fromString(xk1Var.Q("TeamViewer Configuration", "action"));
                                        String strQ1116 = xk1Var.Q("Customer Configuration", "password");
                                        if (strQ2 == null && strQ1115 != null && strQ1116 != null) {
                                            LinkedBlockingQueue linkedBlockingQueue5 = wi6.a;
                                            connectionModeFromString17.getClass();
                                            wi6.b(new qi5(strQ1115, connectionModeFromString17, strQ2, strQ1116));
                                            ye4.a("ConnectInterfaceViewModel", "received tvc");
                                        }
                                    }
                                    if (!im3.n(data.getScheme(), "teamviewer8") && im3.n(data.getHost(), "instantsupport")) {
                                        String queryParameter15 = data.getQueryParameter("sid");
                                        String queryParameter16 = data.getQueryParameter("t");
                                        if (queryParameter15 != null && queryParameter16 != null) {
                                            wi6.b(new c31(queryParameter15, queryParameter16, (byte) 0));
                                            ye4.a("ConnectInterfaceViewModel", "received instant support scheme");
                                        } else if (im3.n(data.getScheme(), "http")) {
                                            List<String> pathSegments1111111111119 = data.getPathSegments();
                                            str = pathSegments1111111111119.get(pathSegments1111111111119.size() - 1);
                                            str.getClass();
                                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                            String strP1111111111118 = ub7.p0(str, "-");
                                            if (strS0.equals(str)) {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            } else {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            }
                                        } else {
                                            List<String> pathSegments11111111111110 = data.getPathSegments();
                                            str = pathSegments11111111111110.get(pathSegments11111111111110.size() - 1);
                                            str.getClass();
                                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                            String strP1111111111119 = ub7.p0(str, "-");
                                            if (strS0.equals(str)) {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            } else {
                                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                            }
                                        }
                                    } else if ((im3.n(data.getScheme(), "http") || im3.n(data.getScheme(), "https")) && im3.n(data.getHost(), "get.teamviewer.com")) {
                                        List<String> pathSegments11111111111111 = data.getPathSegments();
                                        str = pathSegments11111111111111.get(pathSegments11111111111111.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP11111111111110 = ub7.p0(str, "-");
                                        if (strS0.equals(str) || strP11111111111110.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            wi6.b(new c31(strS0, strP11111111111110, (byte) 1));
                                            ye4.a("ConnectInterfaceViewModel", "received instant support universal link");
                                        }
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                } else if (!im3.n(data.getScheme(), "teamviewer8")) {
                                    if (im3.n(data.getScheme(), "http")) {
                                        List<String> pathSegments11111111111112 = data.getPathSegments();
                                        str = pathSegments11111111111112.get(pathSegments11111111111112.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP11111111111111 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    } else {
                                        List<String> pathSegments11111111111113 = data.getPathSegments();
                                        str = pathSegments11111111111113.get(pathSegments11111111111113.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP11111111111112 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    }
                                } else if (im3.n(data.getScheme(), "http")) {
                                    List<String> pathSegments11111111111114 = data.getPathSegments();
                                    str = pathSegments11111111111114.get(pathSegments11111111111114.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP11111111111113 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                } else {
                                    List<String> pathSegments11111111111115 = data.getPathSegments();
                                    str = pathSegments11111111111115.get(pathSegments11111111111115.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP11111111111114 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                }
                            }
                            r13 = th;
                            if (r13 != 0) {
                                if (im3.n(ControlFileSWIGJNI.ControlFile_GetChecksum(r13), strQ)) {
                                    ye4.c("ControlFile", "checksums are not equal");
                                } else {
                                    strQ2 = xk1Var.Q("TeamViewer Configuration", "controlID");
                                    String strQ1117 = xk1Var.Q("TeamViewer Configuration", "targetID");
                                    ConnectionMode connectionModeFromString18 = ConnectionMode.fromString(xk1Var.Q("TeamViewer Configuration", "action"));
                                    String strQ1118 = xk1Var.Q("Customer Configuration", "password");
                                    if (strQ2 == null) {
                                    }
                                }
                                if (!im3.n(data.getScheme(), "teamviewer8")) {
                                    if (im3.n(data.getScheme(), "http")) {
                                        List<String> pathSegments11111111111116 = data.getPathSegments();
                                        str = pathSegments11111111111116.get(pathSegments11111111111116.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP11111111111115 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    } else {
                                        List<String> pathSegments11111111111117 = data.getPathSegments();
                                        str = pathSegments11111111111117.get(pathSegments11111111111117.size() - 1);
                                        str.getClass();
                                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                        String strP11111111111116 = ub7.p0(str, "-");
                                        if (strS0.equals(str)) {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        } else {
                                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                        }
                                    }
                                } else if (im3.n(data.getScheme(), "http")) {
                                    List<String> pathSegments11111111111118 = data.getPathSegments();
                                    str = pathSegments11111111111118.get(pathSegments11111111111118.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP11111111111117 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                } else {
                                    List<String> pathSegments11111111111119 = data.getPathSegments();
                                    str = pathSegments11111111111119.get(pathSegments11111111111119.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP11111111111118 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                }
                            } else if (!im3.n(data.getScheme(), "teamviewer8")) {
                                if (im3.n(data.getScheme(), "http")) {
                                    List<String> pathSegments111111111111110 = data.getPathSegments();
                                    str = pathSegments111111111111110.get(pathSegments111111111111110.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP11111111111119 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                } else {
                                    List<String> pathSegments111111111111111 = data.getPathSegments();
                                    str = pathSegments111111111111111.get(pathSegments111111111111111.size() - 1);
                                    str.getClass();
                                    strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                    String strP111111111111110 = ub7.p0(str, "-");
                                    if (strS0.equals(str)) {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    } else {
                                        ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                    }
                                }
                            } else if (im3.n(data.getScheme(), "http")) {
                                List<String> pathSegments111111111111112 = data.getPathSegments();
                                str = pathSegments111111111111112.get(pathSegments111111111111112.size() - 1);
                                str.getClass();
                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                String strP111111111111111 = ub7.p0(str, "-");
                                if (strS0.equals(str)) {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                } else {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                }
                            } else {
                                List<String> pathSegments111111111111113 = data.getPathSegments();
                                str = pathSegments111111111111113.get(pathSegments111111111111113.size() - 1);
                                str.getClass();
                                strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                                String strP111111111111112 = ub7.p0(str, "-");
                                if (strS0.equals(str)) {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                } else {
                                    ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r8 = str4;
                        }
                    } else if (!im3.n(data.getScheme(), "teamviewer8")) {
                        if (im3.n(data.getScheme(), "http")) {
                            List<String> pathSegments111111111111114 = data.getPathSegments();
                            str = pathSegments111111111111114.get(pathSegments111111111111114.size() - 1);
                            str.getClass();
                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                            String strP111111111111113 = ub7.p0(str, "-");
                            if (strS0.equals(str)) {
                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                            } else {
                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                            }
                        } else {
                            List<String> pathSegments111111111111115 = data.getPathSegments();
                            str = pathSegments111111111111115.get(pathSegments111111111111115.size() - 1);
                            str.getClass();
                            strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                            String strP111111111111114 = ub7.p0(str, "-");
                            if (strS0.equals(str)) {
                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                            } else {
                                ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                            }
                        }
                    } else if (im3.n(data.getScheme(), "http")) {
                        List<String> pathSegments111111111111116 = data.getPathSegments();
                        str = pathSegments111111111111116.get(pathSegments111111111111116.size() - 1);
                        str.getClass();
                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                        String strP111111111111115 = ub7.p0(str, "-");
                        if (strS0.equals(str)) {
                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                        } else {
                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                        }
                    } else {
                        List<String> pathSegments111111111111117 = data.getPathSegments();
                        str = pathSegments111111111111117.get(pathSegments111111111111117.size() - 1);
                        str.getClass();
                        strS0 = ub7.s0(ub7.p0(str, "v*/"), "-");
                        String strP111111111111116 = ub7.p0(str, "-");
                        if (strS0.equals(str)) {
                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                        } else {
                            ye4.a("ConnectInterfaceViewModel", "received unknown intent");
                        }
                    }
                }
            }
            b31Var = this.I;
            if (b31Var != null) {
                im3.e0("viewmodel");
                throw th;
            }
            b31Var.r.observe(this, new a7(new q0(this, (byte) 28), (byte) 3));
            b31Var2 = this.I;
            if (b31Var2 != null) {
                im3.e0("viewmodel");
                throw th;
            }
            s7 s7Var = u7.g;
            xt2Var = vn4.g0().d;
            ye4Var = ye4.a;
            if (xt2Var != null) {
                ye4Var.g("ConnectInterfaceViewModel", "A session is already running!");
                cls = xt2Var.getClass();
            } else {
                mo7Var = ((zt6) b31Var2.f386o).f;
                if (mo7Var != null) {
                    du6VarT = mo7Var.t();
                } else {
                    r2 = th;
                }
                if (r2 != 0) {
                    connectionMode = r2.a;
                } else {
                    r3 = th;
                }
                if (r3 != 0) {
                    r2 = du6VarT;
                    r2 = du6VarT;
                    r3 = connectionMode;
                    i = a31.a[r3.ordinal()];
                }
                r2 = du6VarT;
                r2 = du6VarT;
                r3 = connectionMode;
                if (i != 1) {
                    if (it1.c != null) {
                        im3.e0("viewFactory");
                        throw th;
                    }
                    cls = M2MClientActivity.class;
                } else if (i != 2) {
                    if (it1.c != null) {
                        im3.e0("viewFactory");
                        throw th;
                    }
                    cls = MainActivity.class;
                } else {
                    if (it1.c != null) {
                        im3.e0("viewFactory");
                        throw th;
                    }
                    cls = RCClientActivity.class;
                }
            }
            this.H = cls;
            ye4Var.b("ConnectInterfaceActivity", "Starting activity ".concat(cls.getSimpleName()));
            cls2 = this.H;
            if (cls2 != null) {
                im3.e0("destinationActivity");
                throw th;
            }
            intent = new Intent(this, (Class<?>) cls2);
            Intent intent3 = getIntent();
            intent3.getClass();
            D(intent, intent3);
            intent.putExtra("CLOSE_CURRENT_SESSION", true);
            sharedPreferences = h57.a;
            if (sharedPreferences != null) {
                im3.e0("sharedPreferences");
                throw th;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putBoolean("KEY_ALLOW_SHORTCUT_CONNECTION", true);
            editorEdit.apply();
            finishAfterTransition();
            startActivity(intent);
            ye4.a("ConnectInterfaceActivity", "ending connect interface activity");
            finish();
        }
        ye4.c("ConnectInterfaceViewModel", "intent is null");
        th = null;
        b31Var = this.I;
        if (b31Var != null) {
            im3.e0("viewmodel");
            throw th;
        }
        b31Var.r.observe(this, new a7(new q0(this, (byte) 28), (byte) 3));
        b31Var2 = this.I;
        if (b31Var2 != null) {
            im3.e0("viewmodel");
            throw th;
        }
        s7 s7Var2 = u7.g;
        xt2Var = vn4.g0().d;
        ye4Var = ye4.a;
        if (xt2Var != null) {
            ye4Var.g("ConnectInterfaceViewModel", "A session is already running!");
            cls = xt2Var.getClass();
        } else {
            mo7Var = ((zt6) b31Var2.f386o).f;
            if (mo7Var != null) {
                du6VarT = mo7Var.t();
            } else {
                r2 = th;
            }
            if (r2 != 0) {
                connectionMode = r2.a;
            } else {
                r3 = th;
            }
            if (r3 != 0) {
                r2 = du6VarT;
                r2 = du6VarT;
                r3 = connectionMode;
                i = a31.a[r3.ordinal()];
            }
            r2 = du6VarT;
            r2 = du6VarT;
            r3 = connectionMode;
            if (i != 1) {
                if (it1.c != null) {
                    im3.e0("viewFactory");
                    throw th;
                }
                cls = M2MClientActivity.class;
            } else if (i != 2) {
                if (it1.c != null) {
                    im3.e0("viewFactory");
                    throw th;
                }
                cls = MainActivity.class;
            } else {
                if (it1.c != null) {
                    im3.e0("viewFactory");
                    throw th;
                }
                cls = RCClientActivity.class;
            }
        }
        this.H = cls;
        ye4Var.b("ConnectInterfaceActivity", "Starting activity ".concat(cls.getSimpleName()));
        cls2 = this.H;
        if (cls2 != null) {
            im3.e0("destinationActivity");
            throw th;
        }
        intent = new Intent(this, (Class<?>) cls2);
        Intent intent4 = getIntent();
        intent4.getClass();
        D(intent, intent4);
        intent.putExtra("CLOSE_CURRENT_SESSION", true);
        sharedPreferences = h57.a;
        if (sharedPreferences != null) {
            im3.e0("sharedPreferences");
            throw th;
        }
        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
        editorEdit2.putBoolean("KEY_ALLOW_SHORTCUT_CONNECTION", true);
        editorEdit2.apply();
        finishAfterTransition();
        startActivity(intent);
        ye4.a("ConnectInterfaceActivity", "ending connect interface activity");
        finish();
    }
}
