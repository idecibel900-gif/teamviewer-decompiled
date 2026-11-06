package o;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactAddedEvent;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactChangedEvent;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactInvitationAddedEvent;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactInvitationRemovedEvent;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactPictureAvailabilityChangedEvent;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactRemovedEvent;
import com.teamviewer.apidefinitions.contacts.models.TeamViewerEvent;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionChangeEvent;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrolviewlib.inapppurchase.InAppPurchaseActivity;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class yi implements ho2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ yi(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00d3 A[PHI: r7
      0x00d3: PHI (r7v8 o.lx1) = (r7v0 o.lx1), (r7v0 o.lx1), (r7v12 o.lx1) binds: [B:52:0x00c0, B:54:0x00d0, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object a(lx1 lx1Var, hc1 hc1Var) {
        cx1 cx1Var;
        yu7 yu7Var;
        Long l;
        yu7 yu7Var2 = kh.Q;
        ul1 ul1Var = (ul1) this.n;
        if (hc1Var instanceof cx1) {
            cx1Var = (cx1) hc1Var;
            int i = cx1Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                cx1Var.p = i - Integer.MIN_VALUE;
            } else {
                cx1Var = new cx1(this, hc1Var);
            }
        } else {
            cx1Var = new cx1(this, hc1Var);
        }
        Object obj = cx1Var.n;
        int i2 = cx1Var.p;
        f88 f88Var = f88.a;
        ne1 ne1Var = ne1.m;
        switch (i2) {
            case 0:
                ct1.a0(obj);
                if (lx1Var != null) {
                    if (lx1Var instanceof jx1) {
                        k33 k33Var = ((jx1) lx1Var).a;
                        cx1Var.m = null;
                        cx1Var.p = 1;
                        if (ul1Var.i(yu7Var2, k33Var, cx1Var) == ne1Var) {
                            return ne1Var;
                        }
                        return f88Var;
                    }
                    if (lx1Var instanceof gx1) {
                        h71 h71Var = ((gx1) lx1Var).a;
                        cx1Var.m = null;
                        cx1Var.p = 2;
                        if (ul1Var.i(yu7Var2, h71Var, cx1Var) == ne1Var) {
                            return ne1Var;
                        }
                        return f88Var;
                    }
                    if (lx1Var instanceof hx1) {
                        Long l2 = new Long(((hx1) lx1Var).a);
                        cx1Var.m = null;
                        cx1Var.p = 3;
                        if (ul1Var.i(yu7Var2, l2, cx1Var) == ne1Var) {
                            return ne1Var;
                        }
                        return f88Var;
                    }
                    if (lx1Var instanceof kx1) {
                        Integer num = new Integer(((kx1) lx1Var).a.getSessioncode());
                        cx1Var.m = null;
                        cx1Var.p = 4;
                        if (ul1Var.i(yu7Var2, num, cx1Var) != ne1Var) {
                            return f88Var;
                        }
                    } else if (lx1Var instanceof ix1) {
                        qu7 qu7VarD = ul1Var.d();
                        if ((qu7VarD != null ? qu7VarD.a : null) == kh.P) {
                            k33 k33Var2 = ((ix1) lx1Var).a;
                            cx1Var.m = lx1Var;
                            cx1Var.p = 5;
                            if (ul1Var.i(yu7Var2, k33Var2, cx1Var) != ne1Var) {
                                yu7Var = kh.R;
                                l = new Long(((ix1) lx1Var).b);
                                cx1Var.m = null;
                                cx1Var.p = 6;
                                if (ul1Var.i(yu7Var, l, cx1Var) == ne1Var) {
                                    return f88Var;
                                }
                            }
                        } else {
                            yu7Var = kh.R;
                            l = new Long(((ix1) lx1Var).b);
                            cx1Var.m = null;
                            cx1Var.p = 6;
                            if (ul1Var.i(yu7Var, l, cx1Var) == ne1Var) {
                                return f88Var;
                            }
                        }
                    }
                    return ne1Var;
                }
                gk0.s();
                return null;
            case 1:
                ct1.a0(obj);
                return f88Var;
            case 2:
                ct1.a0(obj);
                return f88Var;
            case 3:
                ct1.a0(obj);
                return f88Var;
            case 4:
                ct1.a0(obj);
                return f88Var;
            case 5:
                lx1Var = cx1Var.m;
                ct1.a0(obj);
                yu7Var = kh.R;
                l = new Long(((ix1) lx1Var).b);
                cx1Var.m = null;
                cx1Var.p = 6;
                if (ul1Var.i(yu7Var, l, cx1Var) == ne1Var) {
                    return ne1Var;
                }
                return f88Var;
            case 6:
                ct1.a0(obj);
                return f88Var;
            default:
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:154:0x0384  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a8  */
    /* JADX WARN: Instruction removed from duplicated block: B:154:0x0384, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        Object value;
        Object value2;
        Object objG;
        oo2 oo2Var;
        byte b = this.m;
        ne1 ne1Var = ne1.m;
        Object[] objArr = 0;
        f88 f88Var = f88.a;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                cj3 cj3Var = (cj3) obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    cj3Var.G().startStylusHandwriting((View) cj3Var.n);
                }
                return f88Var;
            case 1:
                g80 g80Var = (g80) obj2;
                if (g80Var.n) {
                    g80Var.p.setValue(Boolean.TRUE);
                } else {
                    g80Var.V0();
                }
                return f88Var;
            case 2:
                Object objE = ((km) obj2).e(new Float(v10.a.b(((p10) obj).c)), hc1Var);
                return objE == ne1Var ? objE : f88Var;
            case 3:
                TeamViewerEvent teamViewerEvent = (TeamViewerEvent) obj;
                qa1 qa1Var = (qa1) obj2;
                l97 l97Var = qa1Var.r;
                if (teamViewerEvent == null) {
                    ye4.a("ContactsScreenViewModel", "Received unhandled contact event: " + teamViewerEvent);
                } else if (teamViewerEvent instanceof PersonalContactAddedEvent) {
                    qa1Var.u = lv0.B0(qa1Var.u, di1.E(((PersonalContactAddedEvent) teamViewerEvent).getContact()));
                    qa1.b1(qa1Var, 7);
                } else if (teamViewerEvent instanceof PersonalContactChangedEvent) {
                    List<h71> list = qa1Var.u;
                    ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
                    for (h71 h71VarE : list) {
                        PersonalContactChangedEvent personalContactChangedEvent = (PersonalContactChangedEvent) teamViewerEvent;
                        if (h71VarE.m == personalContactChangedEvent.getContact().getPersonalContactId()) {
                            h71VarE = di1.E(personalContactChangedEvent.getContact());
                        }
                        arrayList.add(h71VarE);
                    }
                    qa1Var.u = arrayList;
                    qa1.b1(qa1Var, 7);
                } else if (teamViewerEvent instanceof PersonalContactRemovedEvent) {
                    PersonalContactRemovedEvent personalContactRemovedEvent = (PersonalContactRemovedEvent) teamViewerEvent;
                    if (qa1Var.Z0(personalContactRemovedEvent.getPersonalContactId())) {
                        qa1Var.E = new Integer(personalContactRemovedEvent.getPersonalContactId());
                        do {
                            value2 = l97Var.getValue();
                        } while (!l97Var.j(value2, ka1.a((ka1) value2, null, null, false, false, false, false, false, false, null, null, 0, 0, false, null, false, null, false, true, 131071)));
                    } else {
                        List list2 = qa1Var.u;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : list2) {
                            if (((h71) obj3).m != personalContactRemovedEvent.getPersonalContactId()) {
                                arrayList2.add(obj3);
                            }
                        }
                        qa1Var.u = arrayList2;
                        qa1.b1(qa1Var, 7);
                    }
                } else if (teamViewerEvent instanceof PersonalContactPictureAvailabilityChangedEvent) {
                    im3.R(e8.n(qa1Var), qa1Var.q, null, new la1(qa1Var, objArr == true ? 1 : 0, (byte) 2), 2);
                } else if (teamViewerEvent instanceof PersonalContactInvitationAddedEvent) {
                    qa1Var.w = lv0.B0(qa1Var.w, di1.F(((PersonalContactInvitationAddedEvent) teamViewerEvent).getContact()));
                    qa1.b1(qa1Var, 7);
                } else if (teamViewerEvent instanceof PersonalContactInvitationRemovedEvent) {
                    PersonalContactInvitationRemovedEvent personalContactInvitationRemovedEvent = (PersonalContactInvitationRemovedEvent) teamViewerEvent;
                    if (qa1Var.Z0(personalContactInvitationRemovedEvent.getPersonalInvitationId())) {
                        qa1Var.E = new Integer(personalContactInvitationRemovedEvent.getPersonalInvitationId());
                        do {
                            value = l97Var.getValue();
                        } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, false, null, false, null, false, true, 131071)));
                    } else {
                        List list3 = qa1Var.w;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj4 : list3) {
                            if (((h71) obj4).m != personalContactInvitationRemovedEvent.getPersonalInvitationId()) {
                                arrayList3.add(obj4);
                            }
                        }
                        qa1Var.w = arrayList3;
                        qa1.b1(qa1Var, 7);
                    }
                } else {
                    ye4.a("ContactsScreenViewModel", "Received unhandled contact event: " + teamViewerEvent);
                }
                return f88Var;
            case 4:
                vh1 vh1Var = (vh1) obj2;
                return ((vh1Var.h.b() instanceof gl2) || (objG = vh1Var.g(true, hc1Var)) != ne1Var) ? f88Var : objG;
            case 5:
                return a((lx1) obj, hc1Var);
            case 6:
                if (hc1Var instanceof oo2) {
                    oo2Var = (oo2) hc1Var;
                    int i = oo2Var.f1665o;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        oo2Var.f1665o = i - Integer.MIN_VALUE;
                    } else {
                        oo2Var = new oo2(this, hc1Var);
                    }
                } else {
                    oo2Var = new oo2(this, hc1Var);
                }
                Object obj5 = oo2Var.m;
                int i2 = oo2Var.f1665o;
                if (i2 == 0) {
                    ct1.a0(obj5);
                    gt5 gt5Var = (gt5) obj2;
                    Object obj6 = obj == null ? g68.s : obj;
                    oo2Var.f1665o = 1;
                    if (gt5Var.p.a(obj6, oo2Var) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (i2 != 1) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj5);
                }
                return f88Var;
            case 7:
                ((k76) obj2).m = obj;
                throw new j(this);
            case 8:
                if (((Boolean) obj).booleanValue()) {
                    ((iw7) obj2).a(new ji2((byte) 16));
                }
                return f88Var;
            case ep1.b /* 9 */:
                ((wt4) obj2).f2443o.A(((Number) obj).floatValue());
                return f88Var;
            case ep1.c /* 10 */:
                rq0 rq0Var = (rq0) obj2;
                rq0Var.b(rq0Var.b);
                return f88Var;
            case 11:
                com.teamviewer.apidefinitions.supportsessions.models.TeamViewerEvent teamViewerEvent2 = (com.teamviewer.apidefinitions.supportsessions.models.TeamViewerEvent) obj;
                if (teamViewerEvent2 instanceof SupportSessionChangeEvent) {
                    xr6 xr6Var = (xr6) obj2;
                    SupportSessionChangeEvent supportSessionChangeEvent = (SupportSessionChangeEvent) teamViewerEvent2;
                    SupportSession supportSession = supportSessionChangeEvent.getSupportSession();
                    if (supportSession == null || h57.o(supportSession, xr6Var.q)) {
                        xr6Var.X0(supportSessionChangeEvent.getSessioncode());
                    } else {
                        xr6Var.z.remove(Integer.valueOf(supportSessionChangeEvent.getSessioncode()));
                        xr6Var.Y0(false);
                    }
                }
                return f88Var;
            case ep1.d /* 12 */:
                if (((Boolean) obj).booleanValue()) {
                    ((Function0) obj2).a();
                }
                return f88Var;
            case 13:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((Function1) obj2).invoke(bool);
                return f88Var;
            case 14:
                Activity activity = (Activity) obj2;
                if (((Boolean) obj).booleanValue()) {
                    IStatisticsHandler iStatisticsHandler = ga7.a;
                    ga7.a(fg3.q);
                    int i3 = InAppPurchaseActivity.S;
                    Intent intentJ = ct1.J(activity);
                    if (intentJ != null) {
                        bb3 bb3Var = activity instanceof bb3 ? (bb3) activity : null;
                        if (bb3Var != null) {
                            bb3Var.i(intentJ);
                        }
                    }
                }
                return f88Var;
            case 15:
                lx5 lx5Var = (lx5) obj;
                Context context = (Context) obj2;
                lx5Var.getClass();
                ArrayList arrayList4 = new ArrayList();
                JSONObject jSONObject = lx5Var.c;
                if (jSONObject.has("productIds")) {
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
                    if (jSONArrayOptJSONArray != null) {
                        for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                            arrayList4.add(jSONArrayOptJSONArray.optString(i4));
                        }
                    }
                } else if (jSONObject.has("productId")) {
                    arrayList4.add(jSONObject.optString("productId"));
                }
                String str = (String) lv0.o0(arrayList4);
                if (str == null) {
                    str = "";
                }
                String packageName = context.getPackageName();
                packageName.getClass();
                Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("play.google.com").appendPath("store").appendPath("account").appendPath("subscriptions");
                if (str.length() != 0) {
                    builderAppendPath.appendQueryParameter("sku", str);
                }
                if (packageName.length() != 0) {
                    builderAppendPath.appendQueryParameter("package", packageName);
                }
                Uri uriBuild = builderAppendPath.build();
                uriBuild.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uriBuild);
                intent.setPackage("com.android.vending");
                try {
                    context.startActivity(intent);
                    break;
                } catch (ActivityNotFoundException unused) {
                    ye4.a("SubscriptionPreference", "PlayStore not installed");
                }
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                PointF pointF = ((r97) obj).a;
                wk7 wk7Var = (wk7) obj2;
                wk7Var.d((int) pointF.x, (int) pointF.y);
                wk7Var.k = true;
                return f88Var;
            default:
                th8 th8Var = (th8) obj2;
                th8Var.s0 = ((Boolean) obj).booleanValue();
                xt2 xt2VarC = th8Var.C();
                if (xt2VarC != null) {
                    xt2VarC.invalidateOptionsMenu();
                }
                return f88Var;
        }
    }
}
