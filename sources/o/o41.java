package o;

import android.app.Notification;
import com.teamviewer.activereviews.InAppReviewLauncher;
import com.teamviewer.remotecontrollib.mru.ConnectionHistoryManager;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class o41 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o41(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(mo7 mo7Var, ys6 ys6Var) {
        h41 h41Var;
        du6 du6VarT;
        switch (this.a) {
            case 0:
                ConnectionHistoryManager connectionHistoryManager = (ConnectionHistoryManager) this.b;
                du6 du6VarT2 = mo7Var.t();
                if (du6VarT2.b()) {
                    l41 l41Var = connectionHistoryManager.b;
                    DyngateID dyngateID = du6VarT2.j;
                    fu6 fu6Var = fu6.Ended;
                    String str = du6VarT2.b.a;
                    String str2 = du6VarT2.e;
                    ye4.a("ConnectionHistory", "************ connection with: " + dyngateID + " ended **********************");
                    boolean zEquals = dyngateID.equals(h41.l);
                    LinkedList linkedList = l41Var.a;
                    String str3 = null;
                    if (zEquals) {
                        Iterator it = linkedList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                h41Var = (h41) it.next();
                                if (h41Var.d.equals(str)) {
                                    l41Var.a.remove(h41Var);
                                }
                            } else {
                                h41Var = null;
                            }
                        }
                    } else {
                        Iterator it2 = linkedList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                h41Var = (h41) it2.next();
                                if (h41Var.c.equals(dyngateID)) {
                                    l41Var.a.remove(h41Var);
                                }
                            } else {
                                h41Var = null;
                            }
                        }
                    }
                    if (h41Var == null) {
                        ye4.c("ConnectionHistory", "connection ended: ConnectionEntry for " + dyngateID + " not found");
                        return;
                    }
                    h41Var.g = new Date();
                    h41Var.h = fu6Var;
                    h41Var.b = str2;
                    synchronized (l41Var.b) {
                        l41Var.b.add(h41Var);
                    }
                    wk0 wk0Var = l41Var.d;
                    SimpleDateFormat simpleDateFormat = (SimpleDateFormat) wk0Var.n;
                    DyngateID dyngateID2 = h41Var.c;
                    BufferedOutputStream bufferedOutputStream = (BufferedOutputStream) wk0Var.f2420o;
                    if (bufferedOutputStream != null && h41Var.h == fu6.Ended) {
                        Date date = h41Var.f;
                        String str4 = date != null ? simpleDateFormat.format(date) : null;
                        if (str4 == null) {
                            str4 = "";
                        }
                        Date date2 = h41Var.g;
                        String str5 = date2 != null ? simpleDateFormat.format(date2) : null;
                        if (str5 == null) {
                            str5 = "";
                        }
                        String string = dyngateID2.toString();
                        string.getClass();
                        String str6 = h41Var.d;
                        au6 au6Var = bt1.b;
                        if (au6Var == null) {
                            im3.e0("instance");
                            throw null;
                        }
                        mo7 mo7Var2 = au6Var.f;
                        if (mo7Var2 != null && (du6VarT = mo7Var2.t()) != null) {
                            str3 = du6VarT.m;
                        }
                        String str7 = str3 != null ? str3 : "";
                        String strName = h41Var.e.name();
                        String str8 = h41Var.b;
                        StringBuilder sb = new StringBuilder();
                        if (dyngateID2.equals(h41.l)) {
                            sb.append(str6);
                            sb.append(wk0.r(32 - str6.length()));
                        } else {
                            sb.append(string);
                            sb.append(wk0.r(32 - string.length()));
                        }
                        sb.append(str4);
                        sb.append(wk0.r(32 - str4.length()));
                        sb.append(str5);
                        sb.append(wk0.r(32 - str5.length()));
                        sb.append(str7);
                        sb.append(wk0.r(32 - str7.length()));
                        sb.append(strName);
                        sb.append(wk0.r(32 - strName.length()));
                        sb.append('{');
                        sb.append(str8);
                        sb.append("}\r\n");
                        try {
                            byte[] bytes = sb.toString().getBytes(vn0.a);
                            bytes.getClass();
                            bufferedOutputStream.write(bytes);
                            bufferedOutputStream.flush();
                        } catch (FileNotFoundException e) {
                            e41.s("caught FileNotFoundException on writeEntry: ", e.getMessage(), "ConnectionHistoryFileWriter");
                        } catch (IOException e2) {
                            e41.s("caught IOException on writeEntry: ", e2.getMessage(), "ConnectionHistoryFileWriter");
                        }
                        break;
                    }
                    l41Var.e = false;
                    EventHub.e(EventHub.e.f(), EventType.EVENT_CONNECTION_HISTORY_IS_VALID);
                    return;
                }
                return;
            default:
                InAppReviewLauncher inAppReviewLauncher = (InAppReviewLauncher) this.b;
                RemoteControlApplication remoteControlApplication = inAppReviewLauncher.b;
                if (eu6.class.isAssignableFrom(mo7Var.getClass())) {
                    long time = new Date().getTime();
                    Date date3 = mo7Var.t().i;
                    long time2 = (time - (date3 != null ? date3.getTime() : time)) / 1000;
                    if (inAppReviewLauncher.h && inAppReviewLauncher.e.IsSessionDurationConditionSatisfied(time2)) {
                        if (ys6Var == ys6.n || ys6Var == ys6.m) {
                            String string2 = inAppReviewLauncher.c.getString("LAST_VERSION_PROMPTED_FOR_REVIEW", "");
                            String strA = inAppReviewLauncher.a();
                            if (strA == null || im3.n(string2, strA) || !inAppReviewLauncher.i) {
                                return;
                            }
                            inAppReviewLauncher.f = true;
                            if (inAppReviewLauncher.g) {
                                if (inAppReviewLauncher.a.b == null) {
                                    String string3 = remoteControlApplication.getResources().getString(R.string.active_review_notification_title);
                                    string3.getClass();
                                    String string4 = remoteControlApplication.getResources().getString(R.string.active_review_notification_content);
                                    string4.getClass();
                                    String string5 = remoteControlApplication.getResources().getString(R.string.active_review_notification_title);
                                    string5.getClass();
                                    Notification notificationI = d82.i(remoteControlApplication, string3, string4, string5, R.drawable.tv_notification_icon, true, false, d82.n(remoteControlApplication), 37, xk7.ACTIVE_REVIEW_NOTIFICATION, false, true);
                                    notificationI.flags |= 16;
                                    d82.x(remoteControlApplication, notificationI, 19);
                                }
                                inAppReviewLauncher.b();
                            }
                            inAppReviewLauncher.i = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void b(mo7 mo7Var) {
        byte b = this.a;
        Object obj = this.b;
        mo7Var.getClass();
        switch (b) {
            case 0:
                if (mo7Var instanceof et6) {
                    du6 du6VarT = ((a2) mo7Var).t();
                    mb5 mb5Var = du6VarT.b;
                    ((ConnectionHistoryManager) obj).b.c(du6VarT.j, mb5Var.b, e51.FileTransfer, mb5Var.a, du6VarT.h);
                }
                break;
            default:
                InAppReviewLauncher inAppReviewLauncher = (InAppReviewLauncher) obj;
                inAppReviewLauncher.f = false;
                inAppReviewLauncher.g = false;
                inAppReviewLauncher.i = true;
                break;
        }
    }
}
