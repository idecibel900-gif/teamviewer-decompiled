package o;

import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.teamviewer.apidefinitions.contacts.models.AccountContactDeviceInfo;
import com.teamviewer.apidefinitions.contacts.models.DetailedPersonalContact;
import com.teamviewer.apidefinitions.contacts.models.OrganizationContactList;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactInvitationList;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactList;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactSearchRequest;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListContactID;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PListNavigationStatisticsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PListNavigationStatisticsViewModelSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public class xc0 implements ze0, ge0, ab3, t93, op4, f75, db1, fb1, bp5, ji1, ex5 {
    public final /* synthetic */ byte m;
    public Object n;

    public xc0(byte b) {
        this.m = b;
        switch (b) {
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                TimeUnit.MINUTES.getClass();
                io7 io7Var = io7.l;
                io7Var.getClass();
                this.n = new q82(io7Var);
                return;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                this.n = new fm(q85.e, (byte) 1);
                return;
            case 29:
                this.n = yo1.x(Looper.getMainLooper());
                return;
            default:
                TreeMap treeMap = new TreeMap(ab5.b);
                ax4 ax4Var = new ax4(treeMap);
                this.n = ax4Var;
                h00 h00Var = xn7.b;
                Map map = (Map) treeMap.get(h00Var);
                Class cls = (Class) (map == null ? null : map.get((d21) Collections.min(map.keySet())));
                if (cls != null && !cls.equals(xk0.class)) {
                    yq4.s("Invalid target class configuration for ", this, ": ", cls);
                    throw null;
                }
                ax4Var.a(h00Var, xk0.class);
                h00 h00Var2 = xn7.a;
                Map map2 = (Map) treeMap.get(h00Var2);
                if ((map2 != null ? map2.get((d21) Collections.min(map2.keySet())) : null) == null) {
                    ax4Var.a(h00Var2, xk0.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }

    @Override // o.fb1
    public int A() {
        return ((ContentInfo) this.n).getFlags();
    }

    @Override // o.fb1
    public ContentInfo B() {
        return (ContentInfo) this.n;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object C(int i, DetailedPersonalContact detailedPersonalContact, jc1 jc1Var) {
        k91 k91Var;
        long j;
        if (jc1Var instanceof k91) {
            k91Var = (k91) jc1Var;
            int i2 = k91Var.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k91Var.r = i2 - Integer.MIN_VALUE;
            } else {
                k91Var = new k91(this, jc1Var);
            }
        } else {
            k91Var = new k91(this, jc1Var);
        }
        Object objA = k91Var.p;
        int i3 = k91Var.r;
        ne1 ne1Var = ne1.m;
        if (i3 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            k91Var.n = detailedPersonalContact;
            k91Var.m = i;
            j = 30000;
            k91Var.f1240o = 30000L;
            k91Var.r = 1;
            objA = n85Var.a(30000L, k91Var);
            if (objA != ne1Var) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = k91Var.f1240o;
        int i4 = k91Var.m;
        DetailedPersonalContact detailedPersonalContact2 = k91Var.n;
        ct1.a0(objA);
        j = j2;
        i = i4;
        detailedPersonalContact = detailedPersonalContact2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<DetailedPersonalContact> qi0VarChangePersonalContact = y85.m.t().b().changePersonalContact(i, detailedPersonalContact);
        k91Var.n = null;
        k91Var.m = i;
        k91Var.f1240o = j;
        k91Var.r = 2;
        Object objM = nv1.m(qi0VarChangePersonalContact, k91Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    public void D(float f, float f2, float f3, float f4, int i) {
        ((iu) this.n).x().n(f, f2, f3, f4, i);
    }

    @Override // o.ji1
    public Object E(eq1 eq1Var, Object obj) {
        return null;
    }

    @Override // o.ji1
    public Object F(bd5 bd5Var, Object obj) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        if (r7 == r4) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object G(java.lang.String r8, java.lang.Integer r9, java.lang.String r10, o.jc1 r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof o.l91
            if (r0 == 0) goto L13
            r0 = r11
            o.l91 r0 = (o.l91) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            o.l91 r0 = new o.l91
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r7 = r0.q
            int r11 = r0.s
            r1 = 2
            r2 = 1
            r3 = 0
            o.ne1 r4 = o.ne1.m
            if (r11 == 0) goto L44
            if (r11 == r2) goto L35
            if (r11 != r1) goto L2f
            o.ct1.a0(r7)
            o.tc6 r7 = (o.tc6) r7
            java.lang.Object r7 = r7.m
            goto L88
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r7)
            return r3
        L35:
            long r8 = r0.p
            java.lang.String r10 = r0.f1344o
            java.lang.Integer r11 = r0.n
            java.lang.String r2 = r0.m
            o.ct1.a0(r7)
            r5 = r8
            r9 = r11
            r8 = r2
            goto L5c
        L44:
            o.ct1.a0(r7)
            o.n85 r7 = o.n85.a
            r0.m = r8
            r0.n = r9
            r0.f1344o = r10
            r5 = 30000(0x7530, double:1.4822E-319)
            r0.p = r5
            r0.s = r2
            java.lang.Object r7 = r7.a(r5, r0)
            if (r7 != r4) goto L5c
            goto L87
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto Lba
            o.aw r7 = o.y85.m
            o.y85 r7 = r7.t()
            com.teamviewer.apidefinitions.contacts.models.PersonalContactInvitationRequest r11 = new com.teamviewer.apidefinitions.contacts.models.PersonalContactInvitationRequest
            r11.<init>(r8, r9, r10)
            com.teamviewer.apidefinitions.contacts.apis.ContactsApi r7 = r7.b()
            o.qi0 r7 = r7.createPersonalContactInvitation(r11)
            r0.m = r3
            r0.n = r3
            r0.f1344o = r3
            r0.p = r5
            r0.s = r1
            java.lang.Object r7 = o.nv1.m(r7, r0)
            if (r7 != r4) goto L88
        L87:
            return r4
        L88:
            java.lang.Throwable r8 = o.tc6.a(r7)
            if (r8 != 0) goto L91
            com.teamviewer.apidefinitions.contacts.models.CreatePersonalInvitationResult r7 = (com.teamviewer.apidefinitions.contacts.models.CreatePersonalInvitationResult) r7
            return r7
        L91:
            boolean r7 = r8 instanceof o.w83
            if (r7 == 0) goto Lad
            o.w83 r8 = (o.w83) r8
            int r7 = r8.m
            r8 = 409(0x199, float:5.73E-43)
            if (r7 != r8) goto La5
            o.zm3 r7 = new o.zm3
            java.lang.String r8 = "Invitation already exists"
            r7.<init>(r8)
            goto Lb4
        La5:
            o.ty2 r7 = new o.ty2
            java.lang.String r8 = "API error occurred"
            r7.<init>(r8)
            goto Lb4
        Lad:
            o.p25 r7 = new o.p25
            java.lang.String r8 = "Network error occurred"
            r7.<init>(r8)
        Lb4:
            o.sc6 r8 = new o.sc6
            r8.<init>(r7)
            return r8
        Lba:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "OneAPI not available (not logged in)"
            r7.<init>(r8)
            o.sc6 r8 = new o.sc6
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.xc0.G(java.lang.String, java.lang.Integer, java.lang.String, o.jc1):java.lang.Object");
    }

    public void H() {
        ((n01) this.n).getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object I(int i, jc1 jc1Var) {
        m91 m91Var;
        long j;
        if (jc1Var instanceof m91) {
            m91Var = (m91) jc1Var;
            int i2 = m91Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m91Var.q = i2 - Integer.MIN_VALUE;
            } else {
                m91Var = new m91(this, jc1Var);
            }
        } else {
            m91Var = new m91(this, jc1Var);
        }
        Object objA = m91Var.f1449o;
        int i3 = m91Var.q;
        ne1 ne1Var = ne1.m;
        if (i3 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            m91Var.m = i;
            j = 30000;
            m91Var.n = 30000L;
            m91Var.q = 1;
            objA = n85Var.a(30000L, m91Var);
            if (objA != ne1Var) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = m91Var.n;
        int i4 = m91Var.m;
        ct1.a0(objA);
        j = j2;
        i = i4;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<f88> qi0VarDeletePersonalcontact = y85.m.t().b().deletePersonalcontact(i);
        m91Var.m = i;
        m91Var.n = j;
        m91Var.q = 2;
        Object objL = nv1.l(qi0VarDeletePersonalcontact, m91Var);
        return objL == ne1Var ? ne1Var : objL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object J(int i, jc1 jc1Var) {
        n91 n91Var;
        long j;
        if (jc1Var instanceof n91) {
            n91Var = (n91) jc1Var;
            int i2 = n91Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n91Var.q = i2 - Integer.MIN_VALUE;
            } else {
                n91Var = new n91(this, jc1Var);
            }
        } else {
            n91Var = new n91(this, jc1Var);
        }
        Object objA = n91Var.f1553o;
        int i3 = n91Var.q;
        ne1 ne1Var = ne1.m;
        if (i3 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            n91Var.m = i;
            j = 30000;
            n91Var.n = 30000L;
            n91Var.q = 1;
            objA = n85Var.a(30000L, n91Var);
            if (objA != ne1Var) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = n91Var.n;
        int i4 = n91Var.m;
        ct1.a0(objA);
        j = j2;
        i = i4;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<f88> qi0VarDeletePersonalInvitation = y85.m.t().b().deletePersonalInvitation(i);
        n91Var.m = i;
        n91Var.n = j;
        n91Var.q = 2;
        Object objL = nv1.l(qi0VarDeletePersonalInvitation, n91Var);
        return objL == ne1Var ? ne1Var : objL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object K(String str, jc1 jc1Var) {
        o91 o91Var;
        long j;
        if (jc1Var instanceof o91) {
            o91Var = (o91) jc1Var;
            int i = o91Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                o91Var.q = i - Integer.MIN_VALUE;
            } else {
                o91Var = new o91(this, jc1Var);
            }
        } else {
            o91Var = new o91(this, jc1Var);
        }
        Object objA = o91Var.f1643o;
        int i2 = o91Var.q;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            o91Var.m = str;
            j = 30000;
            o91Var.n = 30000L;
            o91Var.q = 1;
            objA = n85Var.a(30000L, o91Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = o91Var.n;
        String str2 = o91Var.m;
        ct1.a0(objA);
        j = j2;
        str = str2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<PersonalContactList> qi0VarFilterContacts = y85.m.t().b().filterContacts(new PersonalContactSearchRequest(str, null, null));
        o91Var.m = null;
        o91Var.n = j;
        o91Var.q = 2;
        Object objM = nv1.m(qi0VarFilterContacts, o91Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    public i97 L() {
        a92 a92VarA = a92.a();
        if (a92VarA.c() == 1) {
            return new cf3(true);
        }
        bg5 bg5VarP = h57.p(Boolean.FALSE);
        a92VarA.h(new ek1(bg5VarP, this));
        return bg5VarP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object M(int i, jc1 jc1Var) {
        p91 p91Var;
        long j;
        if (jc1Var instanceof p91) {
            p91Var = (p91) jc1Var;
            int i2 = p91Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p91Var.q = i2 - Integer.MIN_VALUE;
            } else {
                p91Var = new p91(this, jc1Var);
            }
        } else {
            p91Var = new p91(this, jc1Var);
        }
        Object objA = p91Var.f1716o;
        int i3 = p91Var.q;
        ne1 ne1Var = ne1.m;
        if (i3 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            p91Var.m = i;
            j = 30000;
            p91Var.n = 30000L;
            p91Var.q = 1;
            objA = n85Var.a(30000L, p91Var);
            if (objA != ne1Var) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = p91Var.n;
        int i4 = p91Var.m;
        ct1.a0(objA);
        j = j2;
        i = i4;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<DetailedPersonalContact> personalContactDetails = y85.m.t().b().getPersonalContactDetails(i);
        p91Var.m = i;
        p91Var.n = j;
        p91Var.q = 2;
        Object objM = nv1.m(personalContactDetails, p91Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object N(int i, jc1 jc1Var) {
        q91 q91Var;
        long j;
        if (jc1Var instanceof q91) {
            q91Var = (q91) jc1Var;
            int i2 = q91Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q91Var.q = i2 - Integer.MIN_VALUE;
            } else {
                q91Var = new q91(this, jc1Var);
            }
        } else {
            q91Var = new q91(this, jc1Var);
        }
        Object objA = q91Var.f1811o;
        int i3 = q91Var.q;
        ne1 ne1Var = ne1.m;
        if (i3 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            q91Var.m = i;
            j = 30000;
            q91Var.n = 30000L;
            q91Var.q = 1;
            objA = n85Var.a(30000L, q91Var);
            if (objA != ne1Var) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = q91Var.n;
        int i4 = q91Var.m;
        ct1.a0(objA);
        j = j2;
        i = i4;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<List<AccountContactDeviceInfo>> personalContactDevices = y85.m.t().b().getPersonalContactDevices(i);
        q91Var.m = i;
        q91Var.n = j;
        q91Var.q = 2;
        Object objM = nv1.m(personalContactDevices, q91Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    public void O(float f, float f2, float f3, float f4) {
        iu iuVar = (iu) this.n;
        ll0 ll0VarX = iuVar.x();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (iuVar.D() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (iuVar.D() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            ji3.a("Width and height must be greater than or equal to zero");
        }
        iuVar.S(jFloatToRawIntBits);
        ll0VarX.o(f, f2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object P(String str, jc1 jc1Var) {
        r91 r91Var;
        long j;
        if (jc1Var instanceof r91) {
            r91Var = (r91) jc1Var;
            int i = r91Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                r91Var.q = i - Integer.MIN_VALUE;
            } else {
                r91Var = new r91(this, jc1Var);
            }
        } else {
            r91Var = new r91(this, jc1Var);
        }
        Object objA = r91Var.f1904o;
        int i2 = r91Var.q;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            r91Var.m = str;
            j = 30000;
            r91Var.n = 30000L;
            r91Var.q = 1;
            objA = n85Var.a(30000L, r91Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = r91Var.n;
        String str2 = r91Var.m;
        ct1.a0(objA);
        j = j2;
        str = str2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<OrganizationContactList> qi0VarListOrganizationContacts = y85.m.t().b().listOrganizationContacts(str);
        r91Var.m = null;
        r91Var.n = j;
        r91Var.q = 2;
        Object objM = nv1.m(qi0VarListOrganizationContacts, r91Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object Q(jc1 jc1Var) {
        s91 s91Var;
        long j;
        if (jc1Var instanceof s91) {
            s91Var = (s91) jc1Var;
            int i = s91Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                s91Var.p = i - Integer.MIN_VALUE;
            } else {
                s91Var = new s91(this, jc1Var);
            }
        } else {
            s91Var = new s91(this, jc1Var);
        }
        Object objA = s91Var.n;
        int i2 = s91Var.p;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            j = 30000;
            s91Var.m = 30000L;
            s91Var.p = 1;
            objA = n85Var.a(30000L, s91Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = s91Var.m;
        ct1.a0(objA);
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<PersonalContactList> qi0VarListPersonalContact = y85.m.t().b().listPersonalContact(null);
        s91Var.m = j;
        s91Var.p = 2;
        Object objM = nv1.m(qi0VarListPersonalContact, s91Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object R(String str, jc1 jc1Var) {
        t91 t91Var;
        long j;
        if (jc1Var instanceof t91) {
            t91Var = (t91) jc1Var;
            int i = t91Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                t91Var.q = i - Integer.MIN_VALUE;
            } else {
                t91Var = new t91(this, jc1Var);
            }
        } else {
            t91Var = new t91(this, jc1Var);
        }
        Object objA = t91Var.f2093o;
        int i2 = t91Var.q;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            t91Var.m = str;
            j = 30000;
            t91Var.n = 30000L;
            t91Var.q = 1;
            objA = n85Var.a(30000L, t91Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = t91Var.n;
        String str2 = t91Var.m;
        ct1.a0(objA);
        j = j2;
        str = str2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<PersonalContactInvitationList> qi0VarListPersonalContactInvitations = y85.m.t().b().listPersonalContactInvitations(str);
        t91Var.m = null;
        t91Var.n = j;
        t91Var.q = 2;
        Object objM = nv1.m(qi0VarListPersonalContactInvitations, t91Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    public void S() {
        synchronized (((o10) this.n).h) {
            try {
                o10 o10Var = (o10) this.n;
                if (o10Var.a) {
                    ((Handler) o10Var.d).obtainMessage(R.id.zxing_preview_failed).sendToTarget();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void T(float f, long j) {
        ll0 ll0VarX = ((iu) this.n).x();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        ll0VarX.o(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        ll0VarX.c(f);
        ll0VarX.o(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void U(float f, float f2, long j) {
        ll0 ll0VarX = ((iu) this.n).x();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        ll0VarX.o(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        ll0VarX.b(f, f2);
        ll0VarX.o(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void V(float f, float f2) {
        ((iu) this.n).x().o(f, f2);
    }

    public void W(int i, Object obj, cj6 cj6Var) {
        bv0 bv0Var = (bv0) this.n;
        bv0Var.B(i, 3);
        cj6Var.f((u1) obj, bv0Var.a);
        bv0Var.B(i, 4);
    }

    @Override // o.ji1
    public Object a(g3 g3Var, Object obj) {
        return null;
    }

    @Override // o.ab3
    public void b() {
        qe0 qe0Var = (qe0) this.n;
        l07 l07Var = qe0Var.R;
        g1 g1Var = qe0Var.P;
        if (g1Var != null) {
            long jA1 = g1Var.a1();
            l07Var.getClass();
            y87 y87Var = new y87(l07Var, (byte) 1);
            MachineListViewModel machineListViewModelO = ds1.o(new PListContactID(jA1), true, false);
            machineListViewModelO.getClass();
            l07.A(machineListViewModelO, y87Var).N0();
        }
    }

    @Override // o.db1
    public gb1 build() {
        return new gb1(new xc0(((ContentInfo.Builder) this.n).build()));
    }

    @Override // o.fb1
    public int c() {
        return ((ContentInfo) this.n).getSource();
    }

    @Override // o.op4
    public void d(jp4 jp4Var, MenuItem menuItem) {
        ((fm0) this.n).r.removeCallbacksAndMessages(jp4Var);
    }

    @Override // o.fb1
    public ClipData e() {
        return ((ContentInfo) this.n).getClip();
    }

    @Override // o.bp5
    public long f(long j, long j2, zk3 zk3Var, j04 j04Var) {
        long j3 = ((vk3) ((Function0) this.n).a()).a;
        return (((long) mo8.c(zk3Var.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) mo8.c(zk3Var.a + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), j04Var == j04.m)) << 32);
    }

    @Override // o.ze0
    public void g(gk7 gk7Var) {
        switch (this.m) {
            case 0:
                gk7.O0(gk7Var, ((yc0) this.n).C());
                break;
            default:
                gk7.O0(gk7Var, ((ae0) this.n).C());
                break;
        }
    }

    @Override // o.ex5
    public Object get() {
        return new iu((Context) ((f4) this.n).m, new rk5((byte) 17), new wj5((byte) 16));
    }

    @Override // o.ji1
    public Object h(v14 v14Var, Object obj) {
        return null;
    }

    @Override // o.ji1
    public Object i(du5 du5Var, Object obj) {
        ou3 ou3Var = (ou3) this.n;
        int i = (du5Var.F != null ? 1 : 0) + (du5Var.G != null ? 1 : 0);
        if (du5Var.r) {
            if (i == 0) {
                return new yu3(ou3Var, du5Var);
            }
            if (i == 1) {
                return new bv3(ou3Var, du5Var);
            }
            if (i == 2) {
                return new dv3(ou3Var, du5Var);
            }
        } else {
            if (i == 0) {
                return new vv3(ou3Var, du5Var);
            }
            if (i == 1) {
                return new aw3(ou3Var, du5Var);
            }
            if (i == 2) {
                return new ew3(ou3Var, du5Var);
            }
        }
        hk0.q(du5Var, "Unsupported property: ");
        return null;
    }

    @Override // o.ge0
    public void j() {
        switch (this.m) {
            case 1:
                PListNavigationStatisticsViewModel pListNavigationStatisticsViewModel = ((yd0) this.n).g;
                PListNavigationStatisticsViewModelSWIGJNI.PListNavigationStatisticsViewModel_SendStatistics(pListNavigationStatisticsViewModel.a, pListNavigationStatisticsViewModel, true);
                break;
            default:
                PListNavigationStatisticsViewModel pListNavigationStatisticsViewModel2 = ((te0) this.n).e;
                PListNavigationStatisticsViewModelSWIGJNI.PListNavigationStatisticsViewModel_SendStatistics(pListNavigationStatisticsViewModel2.a, pListNavigationStatisticsViewModel2, true);
                break;
        }
    }

    @Override // o.ji1
    public Object k(eu5 eu5Var, Object obj) {
        return r(eu5Var, obj);
    }

    @Override // o.ab3
    public void l() {
        ((qe0) this.n).R.getClass();
        Context context = d82.M;
        if (context == null) {
            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            return;
        }
        String string = context.getString(R.string.tv_IDS_STATUS_AUTHENTICATION_NOINCOMING);
        string.getClass();
        fx3.r(string, 1, context, bu7.MAIN);
    }

    @Override // o.ji1
    public Object m(b54 b54Var, Object obj) {
        return null;
    }

    @Override // o.t93
    public void n() {
        switch (this.m) {
            case 4:
                ((ab3) this.n).l();
                break;
            case 17:
                ((n81) this.n).Y0(j27.a);
                break;
            default:
                qa1 qa1Var = (qa1) this.n;
                im3.R(e8.n(qa1Var), null, null, new la1(qa1Var, null, (byte) 1), 3);
                break;
        }
    }

    @Override // o.db1
    public void o(Uri uri) {
        ((ContentInfo.Builder) this.n).setLinkUri(uri);
    }

    @Override // o.ji1
    public Object p(qb8 qb8Var, Object obj) {
        return null;
    }

    @Override // o.db1
    public void q(int i) {
        ((ContentInfo.Builder) this.n).setFlags(i);
    }

    @Override // o.ji1
    public Object r(xw2 xw2Var, Object obj) {
        return new ru3((ou3) this.n, xw2Var);
    }

    @Override // o.op4
    public void s(jp4 jp4Var, pp4 pp4Var) {
        fm0 fm0Var = (fm0) this.n;
        Handler handler = fm0Var.r;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fm0Var.t;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (jp4Var == ((em0) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new dm0(this, i2 < arrayList.size() ? (em0) arrayList.get(i2) : null, pp4Var, jp4Var), jp4Var, SystemClock.uptimeMillis() + 200);
    }

    @Override // o.db1
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.n).setExtras(bundle);
    }

    @Override // o.f75
    public sk8 t(View view, sk8 sk8Var) {
        switch (this.m) {
            case 13:
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.n;
                WeakHashMap weakHashMap = be8.a;
                sk8 sk8Var2 = collapsingToolbarLayout.getFitsSystemWindows() ? sk8Var : null;
                if (!Objects.equals(collapsingToolbarLayout.K, sk8Var2)) {
                    collapsingToolbarLayout.K = sk8Var2;
                    collapsingToolbarLayout.requestLayout();
                }
                return sk8Var.a.c();
            default:
                pk8 pk8Var = sk8Var.a;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.n;
                if (!Objects.equals(coordinatorLayout.z, sk8Var)) {
                    coordinatorLayout.z = sk8Var;
                    boolean z = sk8Var.d() > 0;
                    coordinatorLayout.A = z;
                    coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                    if (!pk8Var.s()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            View childAt = coordinatorLayout.getChildAt(i);
                            WeakHashMap weakHashMap2 = be8.a;
                            if (!childAt.getFitsSystemWindows() || ((cd1) childAt.getLayoutParams()).a == null || !pk8Var.s()) {
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                return sk8Var;
        }
    }

    public String toString() {
        switch (this.m) {
            case 21:
                return "ContentInfoCompat{" + ((ContentInfo) this.n) + "}";
            default:
                return super.toString();
        }
    }

    @Override // o.ji1
    public Object u(ns4 ns4Var, Object obj) {
        return null;
    }

    @Override // o.ji1
    public Object v(Object obj, qs4 qs4Var) {
        return null;
    }

    @Override // o.ji1
    public Object w(ju5 ju5Var, Object obj) {
        return r(ju5Var, obj);
    }

    @Override // o.ze0
    public void x(oq0 oq0Var) {
        switch (this.m) {
            case 0:
                bb5 bb5Var = ((yc0) this.n).r0;
                if (bb5Var != null) {
                    bb5Var.I0(oq0Var, true);
                }
                break;
            default:
                ae0 ae0Var = (ae0) this.n;
                int i = ae0.F0;
                bb5 bb5Var2 = ae0Var.r0;
                if (bb5Var2 != null) {
                    bb5Var2.I0(oq0Var, true);
                }
                break;
        }
    }

    @Override // o.t93
    public void y() {
        hc1 hc1Var = null;
        switch (this.m) {
            case 4:
                ((ab3) this.n).b();
                break;
            case 17:
                n81 n81Var = (n81) this.n;
                Integer num = n81Var.z;
                if (num != null) {
                    im3.R(e8.n(n81Var), n81Var.q, null, new j81(n81Var, num.intValue(), hc1Var, (byte) 0), 2);
                }
                break;
            default:
                qa1 qa1Var = (qa1) this.n;
                Integer num2 = qa1Var.B;
                if (num2 != null) {
                    im3.R(e8.n(qa1Var), qa1Var.q, null, new j81(qa1Var, num2.intValue(), hc1Var, (byte) 1), 2);
                }
                break;
        }
    }

    public Object z(wr0 wr0Var, Object obj) {
        return r(wr0Var, obj);
    }

    public /* synthetic */ xc0(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    public xc0(bv0 bv0Var) {
        this.m = (byte) 12;
        Charset charset = ul3.a;
        this.n = bv0Var;
        bv0Var.a = this;
    }

    public /* synthetic */ xc0(byte b, boolean z) {
        this.m = b;
    }

    public xc0(ContentInfo contentInfo) {
        this.m = (byte) 21;
        contentInfo.getClass();
        this.n = gh.f(contentInfo);
    }

    public xc0(ClipData clipData, int i) {
        this.m = (byte) 20;
        this.n = gh.d(clipData, i);
    }
}
