package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.teamviewer.market.mobile.R;
import io.sentry.h2;
import io.sentry.u4;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.a10;
import o.a14;
import o.a65;
import o.a92;
import o.a94;
import o.af1;
import o.af6;
import o.ai6;
import o.am4;
import o.ao4;
import o.ap6;
import o.ar;
import o.at4;
import o.au0;
import o.b45;
import o.b94;
import o.bd6;
import o.be8;
import o.bf3;
import o.bf6;
import o.bg5;
import o.bh;
import o.br2;
import o.br5;
import o.bu0;
import o.bu6;
import o.c01;
import o.cf6;
import o.cg;
import o.ch;
import o.cm;
import o.ct1;
import o.d14;
import o.d18;
import o.d57;
import o.d65;
import o.de1;
import o.dh;
import o.dh3;
import o.ds1;
import o.e45;
import o.e55;
import o.e65;
import o.e8;
import o.ed;
import o.ee8;
import o.el5;
import o.eo1;
import o.es4;
import o.ev7;
import o.f88;
import o.fj3;
import o.fq2;
import o.fy0;
import o.g95;
import o.ge8;
import o.gh8;
import o.gj3;
import o.gk0;
import o.gn5;
import o.gq;
import o.gt7;
import o.h31;
import o.h57;
import o.h72;
import o.hg;
import o.hh;
import o.hi;
import o.hj3;
import o.hk0;
import o.hl0;
import o.hm3;
import o.hn5;
import o.hq2;
import o.hs4;
import o.hw2;
import o.i65;
import o.ib5;
import o.ig;
import o.il;
import o.il5;
import o.im3;
import o.in1;
import o.ip6;
import o.iq2;
import o.ir2;
import o.iu;
import o.j04;
import o.ja2;
import o.jc1;
import o.jg;
import o.jh;
import o.jj3;
import o.js7;
import o.jx4;
import o.k03;
import o.k76;
import o.kd4;
import o.kg;
import o.kh;
import o.ki3;
import o.kl5;
import o.kn5;
import o.kn7;
import o.kp6;
import o.kw;
import o.kw4;
import o.kx4;
import o.l03;
import o.l07;
import o.le5;
import o.le8;
import o.lg;
import o.lh7;
import o.ll2;
import o.lq;
import o.lq2;
import o.lw4;
import o.m3;
import o.m57;
import o.m9;
import o.mg;
import o.mg4;
import o.mh3;
import o.mj8;
import o.mr2;
import o.ms7;
import o.mt8;
import o.n47;
import o.n54;
import o.nc5;
import o.ne1;
import o.nf;
import o.ng;
import o.nh;
import o.nj8;
import o.o03;
import o.og;
import o.oh3;
import o.oh6;
import o.oi0;
import o.ol0;
import o.oq2;
import o.oz;
import o.pc5;
import o.ph;
import o.ph6;
import o.pm8;
import o.pn5;
import o.pt7;
import o.px4;
import o.q57;
import o.qj3;
import o.r61;
import o.rn5;
import o.s56;
import o.sg;
import o.sg4;
import o.sm3;
import o.sn1;
import o.t2;
import o.t56;
import o.tb;
import o.te8;
import o.tg;
import o.ti3;
import o.ti4;
import o.tj6;
import o.u22;
import o.u3;
import o.u53;
import o.ua5;
import o.uf0;
import o.ug;
import o.ui;
import o.ui6;
import o.uk3;
import o.un1;
import o.us1;
import o.v43;
import o.v47;
import o.v56;
import o.ve8;
import o.vm1;
import o.vm3;
import o.vn4;
import o.vn8;
import o.vp5;
import o.vs1;
import o.vt1;
import o.w86;
import o.we8;
import o.wn4;
import o.wp2;
import o.wq2;
import o.wt3;
import o.ww1;
import o.x53;
import o.x56;
import o.x8;
import o.x84;
import o.xf;
import o.xj;
import o.xs1;
import o.xx4;
import o.y;
import o.y57;
import o.yf;
import o.yj;
import o.yl7;
import o.yt4;
import o.z84;
import o.zm1;
import o.zo6;
import o.zr7;
import o.zt4;
import o.zu1;
import o.zw4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Æ\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\u0003:\u0006É\u0002Ê\u0002Ë\u0002J\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u00122\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00120\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b \u0010!R+\u0010)\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u00103\u001a\u0004\u0018\u00010*8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b+\u0010,\u0012\u0004\b1\u00102\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010;\u001a\u0004\u0018\u0001048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010B\u001a\u00020<2\u0006\u0010=\u001a\u00020<8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR+\u0010I\u001a\u00020C2\u0006\u0010\"\u001a\u00020C8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010$\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010O\u001a\u00020J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001a\u0010]\u001a\u00020X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R+\u0010`\u001a\u00020^2\u0006\u0010\"\u001a\u00020^8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b_\u0010$\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001b\u0010g\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010aR\u0017\u0010m\u001a\u00020h8\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR \u0010t\u001a\u00020n8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bo\u0010p\u0012\u0004\bs\u00102\u001a\u0004\bq\u0010rR \u0010z\u001a\b\u0012\u0004\u0012\u00020n0u8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u001b\u0010\u0080\u0001\u001a\u00020{8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR \u0010\u0086\u0001\u001a\u00030\u0081\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R*\u0010\u008e\u0001\u001a\u00030\u0087\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R \u0010\u0094\u0001\u001a\u00030\u008f\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R \u0010\u009a\u0001\u001a\u00030\u0095\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R3\u0010¡\u0001\u001a\u00030\u009b\u00012\u0007\u0010\"\u001a\u00030\u009b\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u009c\u0001\u0010$\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R \u0010¦\u0001\u001a\u00030¢\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\b£\u0001\u0010e\u001a\u0006\b¤\u0001\u0010¥\u0001R\"\u0010¬\u0001\u001a\u0005\u0018\u00010§\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001R\"\u0010²\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R \u0010¸\u0001\u001a\u00030³\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R'\u0010½\u0001\u001a\u00020^8V@\u0016X\u0096\u000e¢\u0006\u0016\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0005\b»\u0001\u0010a\"\u0005\b¼\u0001\u0010cR/\u0010Ã\u0001\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0006\b¾\u0001\u0010\u0088\u0001\u0012\u0005\bÂ\u0001\u00102\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0005\bÁ\u0001\u0010\u0014R \u0010È\u0001\u001a\u00030Ä\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\bÅ\u0001\u0010$\u001a\u0006\bÆ\u0001\u0010Ç\u0001R3\u0010Ï\u0001\u001a\u00030É\u00012\u0007\u0010\"\u001a\u00030É\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\bÊ\u0001\u0010$\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001R \u0010Õ\u0001\u001a\u00030Ð\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001RD\u0010ß\u0001\u001a\u0016\u0012\u0005\u0012\u00030×\u0001\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\u00120Ö\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bØ\u0001\u0010Ù\u0001\u0012\u0005\bÞ\u0001\u00102\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R'\u0010ã\u0001\u001a\u00020^8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\bà\u0001\u0010º\u0001\u001a\u0005\bá\u0001\u0010a\"\u0005\bâ\u0001\u0010cR \u0010é\u0001\u001a\u00030ä\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bå\u0001\u0010æ\u0001\u001a\u0006\bç\u0001\u0010è\u0001R'\u0010ì\u0001\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bê\u0001\u0010&\"\u0005\bë\u0001\u0010(R\u0018\u0010ð\u0001\u001a\u00030í\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bî\u0001\u0010ï\u0001R\u0017\u0010ó\u0001\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\b\u001a\u0006\bñ\u0001\u0010ò\u0001R\u0015\u0010÷\u0001\u001a\u00030ô\u00018F¢\u0006\b\u001a\u0006\bõ\u0001\u0010ö\u0001R\u001f\u0010ü\u0001\u001a\u00030ø\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bû\u0001\u00102\u001a\u0006\bù\u0001\u0010ú\u0001R\u0018\u0010\u0080\u0002\u001a\u00030ý\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bþ\u0001\u0010ÿ\u0001R\u0018\u0010\u0084\u0002\u001a\u00030\u0081\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002R*\u0010\u0085\u0002\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0085\u0002\u0010\u0086\u0002\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002\"\u0005\b\u0089\u0002\u0010\u0018R\u0018\u0010\u008d\u0002\u001a\u00030\u008a\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002R\u0018\u0010\u0091\u0002\u001a\u00030\u008e\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002R\u0018\u0010\u0095\u0002\u001a\u00030\u0092\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002R\u0018\u0010\u0099\u0002\u001a\u00030\u0096\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0097\u0002\u0010\u0098\u0002R\u0017\u0010\u009b\u0002\u001a\u00020\u00108VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009a\u0002\u0010À\u0001R\u0016\u0010\u009d\u0002\u001a\u00020^8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009c\u0002\u0010aR\u001f\u0010¢\u0002\u001a\u00030\u009e\u00028VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b¡\u0002\u00102\u001a\u0006\b\u009f\u0002\u0010 \u0002R\u0018\u0010¦\u0002\u001a\u00030£\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¤\u0002\u0010¥\u0002R\u0018\u0010ª\u0002\u001a\u00030§\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¨\u0002\u0010©\u0002R\u001f\u0010¯\u0002\u001a\u00030«\u00028VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b®\u0002\u00102\u001a\u0006\b¬\u0002\u0010\u00ad\u0002R\u0018\u0010³\u0002\u001a\u00030°\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b±\u0002\u0010²\u0002R\u0018\u0010·\u0002\u001a\u00030´\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bµ\u0002\u0010¶\u0002R\u0018\u0010»\u0002\u001a\u00030¸\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¹\u0002\u0010º\u0002R\u0013\u0010½\u0002\u001a\u00020^8F¢\u0006\u0007\u001a\u0005\b¼\u0002\u0010aR\u0019\u0010À\u0002\u001a\u0004\u0018\u00010\u00008VX\u0096\u0004¢\u0006\b\u001a\u0006\b¾\u0002\u0010¿\u0002R\u0018\u0010Ä\u0002\u001a\u00030Á\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÂ\u0002\u0010Ã\u0002R\u0018\u0010È\u0002\u001a\u00030Å\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÆ\u0002\u0010Ç\u0002¨\u0006Ì\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/Owner;", "", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lo/ib5;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "Lo/hq2;", "", "getImportantForAutofill", "()I", "Lo/v56;", "getEmbeddedViewFocusRect", "()Lo/v56;", "", "intervalMillis", "Lo/f88;", "setAccessibilityEventBatchIntervalMillis", "(J)V", "Lo/af6;", "handler", "setUncaughtExceptionHandler", "(Lo/af6;)V", "Lkotlin/Function1;", "Lo/c01;", "callback", "setOnReadyForComposition", "(Lkotlin/jvm/functions/Function1;)V", "accessibilityId", "Landroid/view/View;", "findViewByAccessibilityIdTraversal", "(I)Landroid/view/View;", "<set-?>", "m", "Lo/px4;", "get_composeViewContext", "()Lo/c01;", "set_composeViewContext", "(Lo/c01;)V", "_composeViewContext", "Lo/dh3;", "p", "Lo/dh3;", "getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui", "()Lo/dh3;", "setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui", "(Lo/dh3;)V", "getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations", "()V", "primaryDirectionalMotionAxisOverride", "Lo/z84;", "q", "Lo/z84;", "getFrameEndScheduler$ui", "()Lo/z84;", "setFrameEndScheduler$ui", "(Lo/z84;)V", "frameEndScheduler", "Lo/bd6;", "value", "t", "Lo/bd6;", "getRetainedValuesStore", "()Lo/bd6;", "retainedValuesStore", "Lo/in1;", "w", "getDensity", "()Lo/in1;", "setDensity", "(Lo/in1;)V", "density", "Lo/iq2;", "y", "Lo/iq2;", "getFocusOwner", "()Lo/iq2;", "focusOwner", "Lo/de1;", "z", "Lo/de1;", "getCoroutineContext", "()Lo/de1;", "setCoroutineContext", "(Lo/de1;)V", "coroutineContext", "Lo/hi;", "A", "Lo/hi;", "getDragAndDropManager", "()Lo/hi;", "dragAndDropManager", "", "B", "isAttached", "()Z", "setAttached", "(Z)V", "C", "Lo/i97;", "getDerivedIsAttached", "derivedIsAttached", "Lo/qj3;", "D", "Lo/qj3;", "getInsetsListener", "()Lo/qj3;", "insetsListener", "Landroidx/compose/ui/node/LayoutNode;", "E", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "getRoot$annotations", "root", "Lo/kw4;", "F", "Lo/kw4;", "getLayoutNodes", "()Lo/kw4;", "layoutNodes", "Lo/x56;", "G", "Lo/x56;", "getRectManager", "()Lo/x56;", "rectManager", "Lo/ip6;", "H", "Lo/ip6;", "getSemanticsOwner", "()Lo/ip6;", "semanticsOwner", "Lo/ph;", "J", "Lo/ph;", "getContentCaptureManager$ui", "()Lo/ph;", "setContentCaptureManager$ui", "(Lo/ph;)V", "contentCaptureManager", "Lo/k03;", "K", "Lo/k03;", "getGraphicsContext", "()Lo/k03;", "graphicsContext", "Lo/a10;", "L", "Lo/a10;", "getAutofillTree", "()Lo/a10;", "autofillTree", "Landroid/content/res/Configuration;", "S", "getConfiguration", "()Landroid/content/res/Configuration;", "setConfiguration", "(Landroid/content/res/Configuration;)V", "configuration", "Lo/kd4;", "T", "getLocaleList", "()Lo/kd4;", "localeList", "Lo/xf;", "U", "Lo/xf;", "getAutofill", "()Lo/xf;", "autofill", "Lo/yf;", "V", "Lo/yf;", "getAutofillManager", "()Lo/yf;", "autofillManager", "Lo/pc5;", "a0", "Lo/pc5;", "getSnapshotObserver", "()Lo/pc5;", "snapshotObserver", "b0", "Z", "getShowLayoutBounds", "setShowLayoutBounds", "showLayoutBounds", "m0", "getLastMatrixRecalculationAnimationTime$ui", "()J", "setLastMatrixRecalculationAnimationTime$ui", "getLastMatrixRecalculationAnimationTime$ui$annotations", "lastMatrixRecalculationAnimationTime", "Lo/mr2;", "u0", "getFontFamilyResolver", "()Lo/mr2;", "fontFamilyResolver", "Lo/j04;", "v0", "getLayoutDirection", "()Lo/j04;", "setLayoutDirection", "(Lo/j04;)V", "layoutDirection", "Lo/hs4;", "x0", "Lo/hs4;", "getModifierLocalManager", "()Lo/hs4;", "modifierLocalManager", "Lkotlin/Function2;", "Lo/wp2;", "K0", "Lo/hw2;", "getPlayNavigationSoundEffect$ui", "()Lo/hw2;", "setPlayNavigationSoundEffect$ui", "(Lo/hw2;)V", "getPlayNavigationSoundEffect$ui$annotations", "playNavigationSoundEffect", "P0", "getComposeViewContextIncrementedDuringInit$ui", "setComposeViewContextIncrementedDuringInit$ui", "composeViewContextIncrementedDuringInit", "Lo/hn5;", "T0", "Lo/hn5;", "getPointerIconService", "()Lo/hn5;", "pointerIconService", "getComposeViewContext", "setComposeViewContext", "composeViewContext", "Lo/d14;", "getSharedDrawScope", "()Lo/d14;", "sharedDrawScope", "getView", "()Landroid/view/View;", "view", "Lo/u22;", "getSavedStateRegistry", "()Lo/u22;", "savedStateRegistry", "Lo/mj8;", "getWindowInfo", "()Lo/mj8;", "getWindowInfo$annotations", "windowInfo", "Lo/ee8;", "getViewConfiguration", "()Lo/ee8;", "viewConfiguration", "Lo/bf6;", "getRootForTest", "()Lo/bf6;", "rootForTest", "uncaughtExceptionHandler", "Lo/af6;", "getUncaughtExceptionHandler$ui", "()Lo/af6;", "setUncaughtExceptionHandler$ui", "Lo/u3;", "getAccessibilityManager", "()Lo/u3;", "accessibilityManager", "Lo/bu0;", "getClipboardManager", "()Lo/bu0;", "clipboardManager", "Lo/au0;", "getClipboard", "()Lo/au0;", "clipboard", "Lo/cm;", "getAndroidViewsHandler$ui", "()Lo/cm;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Lo/js7;", "getTextInputService", "()Lo/js7;", "getTextInputService$annotations", "textInputService", "Lo/q57;", "getSoftwareKeyboardController", "()Lo/q57;", "softwareKeyboardController", "Lo/il5;", "getPlacementScope", "()Lo/il5;", "placementScope", "Lo/ir2;", "getFontLoader", "()Lo/ir2;", "getFontLoader$annotations", "fontLoader", "Lo/v43;", "getHapticFeedBack", "()Lo/v43;", "hapticFeedBack", "Lo/jj3;", "getInputModeManager", "()Lo/jj3;", "inputModeManager", "Lo/pt7;", "getTextToolbar", "()Lo/pt7;", "textToolbar", "getScrollCaptureInProgress", "scrollCaptureInProgress", "getOutOfFrameExecutor", "()Landroidx/compose/ui/platform/AndroidComposeView;", "outOfFrameExecutor", "Lo/ol0;", "getCanvasHolder", "()Lo/ol0;", "canvasHolder", "Lo/ms7;", "getLegacyTextInputServiceAndroid", "()Lo/ms7;", "legacyTextInputServiceAndroid", "o/og", "o/hm3", "o/pg", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidComposeView extends ViewGroup implements Owner, bf6, DefaultLifecycleObserver, ib5, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, hq2 {
    public static Class U0;
    public static Method V0;
    public static Method W0;
    public static final zw4 X0 = new zw4();
    public static ed Y0;
    public static Method Z0;
    public static Method a1;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public final hi dragAndDropManager;
    public long A0;
    public final bg5 B;
    public final lh7 B0;
    public final eo1 C;
    public final zw4 C0;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public final qj3 insetsListener;
    public float D0;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public final LayoutNode root;
    public float E0;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public final kw4 layoutNodes;
    public float F0;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final x56 rectManager;
    public float G0;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public final ip6 semanticsOwner;
    public final mt8 H0;
    public final bh I;
    public final ng I0;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ph contentCaptureManager;
    public boolean J0;
    public final ui K;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    public hw2 playNavigationSoundEffect;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public final a10 autofillTree;
    public final oh3 L0;
    public final zw4 M;
    public final ig M0;
    public zw4 N;
    public final ig N0;
    public boolean O;
    public boolean O0;
    public boolean P;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    public boolean composeViewContextIncrementedDuringInit;
    public final yt4 Q;
    public boolean Q0;
    public final ll2 R;
    public final tj6 R0;
    public final bg5 S;
    public View S0;
    public final eo1 T;
    public final sg T0;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public final xf autofill;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public final yf autofillManager;
    public boolean W;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public final pc5 snapshotObserver;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public boolean showLayoutBounds;
    public cm c0;
    public r61 d0;
    public boolean e0;
    public final sn1 f0;
    public long g0;
    public final int[] h0;
    public final float[] i0;
    public final Matrix j0;
    public final float[] k0;
    public final float[] l0;
    public final bg5 m;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public long lastMatrixRecalculationAnimationTime;
    public long n;
    public boolean n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f14o;
    public long o0;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public dh3 primaryDirectionalMotionAxisOverride;
    public Function1 p0;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public z84 frameEndScheduler;
    public ms7 q0;
    public a94 r;
    public js7 r0;
    public u22 s;
    public final AtomicReference s0;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public bd6 retainedValuesStore;
    public zm1 t0;
    public final kw u;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public final px4 fontFamilyResolver;
    public final ng v;
    public final bg5 v0;
    public final bg5 w;
    public jj3 w0;
    public final View x;

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public final hs4 modifierLocalManager;
    public final lq2 y;
    public il y0;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public de1 coroutineContext;
    public MotionEvent z0;

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidComposeView(Context context, c01 c01Var) {
        j04 j04Var;
        super(context);
        this.m = h57.p(c01Var);
        this.n = 9205357640488583168L;
        byte b = 1;
        this.f14o = true;
        this.retainedValuesStore = yl7.A;
        this.u = new kw();
        Object[] objArr = 0;
        this.v = new ng(this, (byte) 0);
        this.w = new bg5(e8.e(context), yl7.T);
        this.y = new lq2(this, this);
        this.coroutineContext = c01Var.c().j();
        this.dragAndDropManager = new hi();
        this.B = h57.p(Boolean.FALSE);
        byte b2 = 2;
        this.C = d57.b(new ig(this, b2));
        this.insetsListener = new qj3();
        LayoutNode layoutNode = new LayoutNode(3);
        layoutNode.B0(cf6.c);
        layoutNode.y0(getDensity());
        layoutNode.D0(getViewConfiguration());
        layoutNode.C0(new tg(this).f(((lq2) getFocusOwner()).e).f(getDragAndDropManager().c));
        this.root = layoutNode;
        kw4 kw4Var = uk3.a;
        this.layoutNodes = new kw4();
        this.rectManager = new x56(m3getLayoutNodes(), this);
        this.semanticsOwner = new ip6(getRoot(), new ja2(), m3getLayoutNodes());
        bh bhVar = new bh(this);
        this.I = bhVar;
        this.contentCaptureManager = new ph(this, new m9(0, this, kh.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, (byte) 5));
        this.K = new ui(this);
        this.autofillTree = new a10();
        this.M = new zw4();
        this.Q = new yt4();
        LayoutNode root = getRoot();
        ll2 ll2Var = new ll2();
        ll2Var.n = root;
        ll2Var.f1375o = new u53((ti3) root.S.d);
        ll2Var.p = new g95((byte) 5);
        ll2Var.q = new x53();
        this.R = ll2Var;
        this.S = h57.p(new Configuration(context.getResources().getConfiguration()));
        this.T = d57.b(new ig(this, (byte) 3));
        this.autofill = new xf(this, getAutofillTree());
        this.autofillManager = new yf(new a65((byte) 9, (Object) context, (boolean) (0 == true ? 1 : 0)), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.snapshotObserver = new pc5(new hg(this, b));
        this.f0 = new sn1(getRoot());
        this.g0 = 9223372034707292159L;
        this.h0 = new int[]{0, 0};
        this.i0 = wn4.a();
        this.j0 = new Matrix();
        this.k0 = wn4.a();
        this.l0 = wn4.a();
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.o0 = 9187343241974906880L;
        this.s0 = new AtomicReference(null);
        this.fontFamilyResolver = c01Var.p;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = fq2.a;
        j04 j04Var2 = j04.m;
        if (layoutDirection != 0) {
            j04Var = layoutDirection != 1 ? null : j04.n;
        } else {
            j04Var = j04Var2;
        }
        this.v0 = h57.p(j04Var != null ? j04Var : j04Var2);
        this.modifierLocalManager = new hs4(this);
        this.B0 = new lh7((byte) 13);
        this.C0 = new zw4();
        this.D0 = Float.NaN;
        this.E0 = Float.NaN;
        this.F0 = Float.NaN;
        this.G0 = Float.NaN;
        this.H0 = new mt8(this, b);
        this.I0 = new ng(this, b);
        this.playNavigationSoundEffect = new og(this);
        this.L0 = new oh3(context, new hg(this, b2));
        this.M0 = new ig(this, (byte) 4);
        this.N0 = new ig(this, objArr == true ? 1 : 0);
        addOnAttachStateChangeListener(this.contentCaptureManager);
        setWillNotDraw(false);
        setFocusable(true);
        jh.a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        be8.m(this, bhVar);
        setOnDragListener(getDragAndDropManager());
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            dh.a.a(this);
        }
        if (l()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.x = view;
            addView(view, -1);
        }
        this.R0 = i >= 31 ? new tj6() : null;
        this.T0 = new sg(this);
    }

    public static void c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).u();
            } else if (childAt instanceof ViewGroup) {
                c((ViewGroup) childAt);
            }
        }
    }

    public static long d(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    public static final boolean g(AndroidComposeView androidComposeView, KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    private final ol0 getCanvasHolder() {
        return getComposeViewContext().u;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    @un1
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    private final ms7 getLegacyTextInputServiceAndroid() {
        ms7 ms7Var = this.q0;
        if (ms7Var != null) {
            return ms7Var;
        }
        ms7 ms7Var2 = new ms7(getView(), this, new kg(this));
        this.q0 = ms7Var2;
        return ms7Var2;
    }

    public static /* synthetic */ void getPlayNavigationSoundEffect$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m0getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    @un1
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    private final c01 get_composeViewContext() {
        return (c01) this.m.getValue();
    }

    public static void j(LayoutNode layoutNode) {
        layoutNode.Q();
        xx4 xx4VarL = layoutNode.L();
        Object[] objArr = xx4VarL.m;
        int i = xx4VarL.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            j((LayoutNode) objArr[i2]);
        }
    }

    public static boolean l() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean m(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !zt4.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final void setAttached(boolean z) {
        this.B.setValue(Boolean.valueOf(z));
    }

    private void setDensity(in1 in1Var) {
        this.w.setValue(in1Var);
    }

    private void setLayoutDirection(j04 j04Var) {
        this.v0.setValue(j04Var);
    }

    private final void set_composeViewContext(c01 c01Var) {
        this.m.setValue(c01Var);
    }

    public final void A() {
        if (this.n0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            C();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.h0;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.o0 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    public final void B(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        C();
        float x = motionEvent.getX();
        long jB = wn4.b((((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L) | (Float.floatToRawIntBits(x) << 32), this.k0);
        this.o0 = (((long) Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32)))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L);
    }

    public final void C() {
        int i = Build.VERSION.SDK_INT;
        float[] fArr = this.k0;
        int[] iArr = this.h0;
        if (i >= 29) {
            oi0.a.a(this, fArr, this.j0, iArr);
        } else {
            wn4.d(fArr);
            uf0.A(this, fArr, this.i0, iArr);
        }
        zu1.x(fArr, this.l0);
    }

    public final boolean D() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void E(Function0 function0) {
        kw kwVar = this.u;
        boolean zIsEmpty = kwVar.isEmpty();
        kwVar.addLast(function0);
        if (zIsEmpty) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(this.v);
            } else {
                hk0.g("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    public final void F(LayoutNode layoutNode) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (layoutNode != null) {
            while (layoutNode != null && layoutNode.B() == a14.m) {
                if (!this.e0) {
                    LayoutNode layoutNodeF = layoutNode.F();
                    if (layoutNodeF == null) {
                        break;
                    }
                    long j = ((ti3) layoutNodeF.S.d).p;
                    if (r61.g(j) && r61.f(j)) {
                        break;
                    }
                }
                layoutNode = layoutNode.F();
            }
            if (layoutNode == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long G(long j) {
        A();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.o0 >> 32));
        return wn4.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.o0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.l0);
    }

    public final int H(MotionEvent motionEvent) {
        Object obj;
        if (this.O0) {
            this.O0 = false;
            n54 n54Var = getComposeViewContext().t;
            nj8.a.setValue(new rn5(motionEvent.getMetaState()));
        }
        yt4 yt4Var = this.Q;
        a65 a65VarC = yt4Var.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        ll2 ll2Var = this.R;
        if (a65VarC == null) {
            if (!ll2Var.m) {
                ((mg4) ((g95) ll2Var.p).m).a();
                ((u53) ll2Var.f1375o).c();
            }
            return 0;
        }
        ArrayList arrayList = (ArrayList) a65VarC.n;
        int size = arrayList.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i = size - 1;
            obj = arrayList.get(size);
            if (((kn5) obj).e && (actionMasked == 0 || actionMasked == 5)) {
                break;
            }
            if (i < 0) {
                obj = null;
                break;
            }
            size = i;
        }
        kn5 kn5Var = (kn5) obj;
        if (kn5Var != null) {
            this.n = kn5Var.d;
        }
        int iM = ll2Var.m(a65VarC, this, n(motionEvent));
        a65VarC.f302o = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iM & 1) != 0) {
            return iM;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        yt4Var.c.delete(pointerId);
        yt4Var.b.delete(pointerId);
        return iM;
    }

    public final void I(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || actionIndex > i4) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jQ = q((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jQ >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jQ & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        a65 a65VarC = this.Q.c(motionEventObtain, this);
        a65VarC.getClass();
        this.R.m(a65VarC, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void J(hw2 hw2Var, jc1 jc1Var) {
        ug ugVar;
        if (jc1Var instanceof ug) {
            ugVar = (ug) jc1Var;
            int i = ugVar.f2209o;
            if ((i & Integer.MIN_VALUE) != 0) {
                ugVar.f2209o = i - Integer.MIN_VALUE;
            } else {
                ugVar = new ug(this, jc1Var);
            }
        } else {
            ugVar = new ug(this, jc1Var);
        }
        Object obj = ugVar.m;
        int i2 = ugVar.f2209o;
        if (i2 == 0) {
            ct1.a0(obj);
            hg hgVar = new hg(this, (byte) 0);
            ugVar.f2209o = 1;
            if (hm3.j(new tb(hgVar, this.s0, hw2Var, null, (byte) 8), ugVar) == ne1.m) {
                return;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            ct1.a0(obj);
        }
        hk0.b();
    }

    public final void K(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (im3.n(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale == configuration.fontScale && configuration2.densityDpi == configuration.densityDpi) {
            return;
        }
        setDensity(e8.e(getContext()));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    public final void L() {
        boolean z;
        int i;
        int[] iArr = this.h0;
        getLocationOnScreen(iArr);
        long j = this.g0;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 == i4 && i3 == iArr[1] && this.lastMatrixRecalculationAnimationTime >= 0) {
            z = false;
        } else {
            this.g0 = (4294967295L & ((long) iArr[1])) | (((long) i4) << 32);
            if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
                z = false;
            } else {
                xx4 xx4VarL = getRoot().L();
                Object[] objArr = xx4VarL.m;
                int i5 = xx4VarL.f2559o;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((LayoutNode) objArr[i6]).z().F0();
                }
                z = true;
            }
        }
        A();
        View rootView = this.S0;
        if (rootView == null) {
            rootView = getRootView();
            this.S0 = rootView;
        }
        x56 rectManager = getRectManager();
        long j2 = this.g0;
        long jO = us1.O(this.o0);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.k0;
        if (fArr.length < 16) {
            i = 0;
        } else {
            i = ((((((((((fArr[0] == 1.0f ? 1 : 0) & (fArr[1] == 0.0f ? 1 : 0)) & (fArr[2] == 0.0f ? 1 : 0)) & (fArr[4] == 0.0f ? 1 : 0)) & (fArr[5] == 1.0f ? 1 : 0)) & (fArr[6] == 0.0f ? 1 : 0)) & (fArr[8] == 0.0f ? 1 : 0)) & (fArr[9] == 0.0f ? 1 : 0)) & (fArr[10] == 1.0f ? 1 : 0)) << 1) | ((fArr[15] == 1.0f ? 1 : 0) & (fArr[12] == 0.0f ? 1 : 0) & (fArr[13] == 0.0f ? 1 : 0) & (fArr[14] == 0.0f ? 1 : 0));
        }
        ev7 ev7Var = rectManager.d;
        if ((i & 2) != 0) {
            fArr = null;
        }
        rectManager.g = ev7Var.c(j2, jO, fArr, width, height) || rectManager.g;
        this.f0.e(z);
        getRectManager().a();
    }

    public final void M(float f) {
        if (l()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.D0) || f > this.D0) {
                    this.D0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.E0) || f < this.E0) {
                    this.E0 = f;
                }
            }
        }
    }

    @Override // o.hq2
    public final void a(br2 br2Var, br2 br2Var2) {
        nf nfVar;
        boolean z;
        nf nfVar2;
        boolean z2;
        if (br2Var != null) {
            br2 br2Var3 = br2Var;
            if (!br2Var3.m.z) {
                ki3.c("visitAncestors called on an unattached node");
            }
            es4 es4Var = br2Var3.m;
            LayoutNode layoutNodeP0 = vn4.p0(br2Var);
            kx4 kx4Var = null;
            ArrayList arrayList = null;
            while (layoutNodeP0 != null) {
                if ((((es4) layoutNodeP0.S.g).p & 2097152) != 0) {
                    while (es4Var != null) {
                        if ((es4Var.f737o & 2097152) != 0) {
                            es4 es4VarL0 = es4Var;
                            xx4 xx4Var = null;
                            while (es4VarL0 != null) {
                                if (es4VarL0 instanceof mh3) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(es4VarL0);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (es4VarL0.f737o & 2097152) != 0 && (es4VarL0 instanceof vm1)) {
                                    int i = 0;
                                    for (es4 es4Var2 = ((vm1) es4VarL0).B; es4Var2 != null; es4Var2 = es4Var2.r) {
                                        if ((es4Var2.f737o & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                es4VarL0 = es4Var2;
                                            } else {
                                                if (xx4Var == null) {
                                                    xx4Var = new xx4(new es4[16]);
                                                }
                                                if (es4VarL0 != null) {
                                                    xx4Var.b(es4VarL0);
                                                    es4VarL0 = null;
                                                }
                                                xx4Var.b(es4Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                es4VarL0 = vn4.l0(xx4Var);
                            }
                        }
                        es4Var = es4Var.q;
                    }
                }
                layoutNodeP0 = layoutNodeP0.F();
                es4Var = (layoutNodeP0 == null || (nfVar2 = layoutNodeP0.S) == null) ? null : (kn7) nfVar2.f;
            }
            if (arrayList == null) {
                return;
            }
            if (br2Var2 != null) {
                if (!br2Var2.m.z) {
                    ki3.c("visitAncestors called on an unattached node");
                }
                es4 es4Var3 = br2Var2.m;
                LayoutNode layoutNodeP1 = vn4.p0(br2Var2);
                kx4 kx4Var2 = null;
                while (layoutNodeP1 != null) {
                    if ((((es4) layoutNodeP1.S.g).p & 2097152) != 0) {
                        while (es4Var3 != null) {
                            if ((es4Var3.f737o & 2097152) != 0) {
                                es4 es4VarL1 = es4Var3;
                                xx4 xx4Var2 = null;
                                while (es4VarL1 != null) {
                                    if (es4VarL1 instanceof mh3) {
                                        if (kx4Var2 == null) {
                                            kx4 kx4Var3 = ui6.a;
                                            kx4Var2 = new kx4();
                                        }
                                        kx4Var2.a(es4VarL1);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (es4VarL1.f737o & 2097152) != 0 && (es4VarL1 instanceof vm1)) {
                                        int i2 = 0;
                                        for (es4 es4Var4 = ((vm1) es4VarL1).B; es4Var4 != null; es4Var4 = es4Var4.r) {
                                            if ((es4Var4.f737o & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    es4VarL1 = es4Var4;
                                                } else {
                                                    if (xx4Var2 == null) {
                                                        xx4Var2 = new xx4(new es4[16]);
                                                    }
                                                    if (es4VarL1 != null) {
                                                        xx4Var2.b(es4VarL1);
                                                        es4VarL1 = null;
                                                    }
                                                    xx4Var2.b(es4Var4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    es4VarL1 = vn4.l0(xx4Var2);
                                }
                            }
                            es4Var3 = es4Var3.q;
                        }
                    }
                    layoutNodeP1 = layoutNodeP1.F();
                    es4Var3 = (layoutNodeP1 == null || (nfVar = layoutNodeP1.S) == null) ? null : (kn7) nfVar.f;
                }
                kx4Var = kx4Var2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                mh3 mh3Var = (mh3) arrayList.get(i3);
                if (!(kx4Var != null ? kx4Var.c(mh3Var) : false)) {
                    mh3Var.e0();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        br2 br2Var = ((lq2) getFocusOwner()).c;
        if (!br2Var.z) {
            return;
        }
        if (!br2Var.m.z) {
            ki3.c("visitSubtreeIf called on an unattached node");
        }
        xx4 xx4Var = new xx4(new es4[16]);
        es4 es4Var = br2Var.m;
        es4 es4Var2 = es4Var.r;
        if (es4Var2 == null) {
            vn4.V(xx4Var, es4Var);
        } else {
            xx4Var.b(es4Var2);
        }
        while (true) {
            int i3 = xx4Var.f2559o;
            if (i3 == 0) {
                return;
            }
            es4 es4Var3 = (es4) xx4Var.k(i3 - 1);
            if ((es4Var3.p & 1024) != 0) {
                for (es4 es4Var4 = es4Var3; es4Var4 != null && es4Var4.z; es4Var4 = es4Var4.r) {
                    if ((es4Var4.f737o & 1024) != 0) {
                        es4 es4VarL0 = es4Var4;
                        xx4 xx4Var2 = null;
                        while (es4VarL0 != null) {
                            int i4 = 0;
                            if (es4VarL0 instanceof br2) {
                                br2 br2Var2 = (br2) es4VarL0;
                                if (br2Var2.z && br2Var2.W0().a) {
                                    super.addFocusables(arrayList, i, i2);
                                    br2 br2Var3 = ((lq2) getFocusOwner()).c;
                                    if (br2Var3.z) {
                                        if (!br2Var3.m.z) {
                                            ki3.c("visitSubtreeIf called on an unattached node");
                                        }
                                        xx4 xx4Var3 = new xx4(new es4[16]);
                                        es4 es4Var5 = br2Var3.m;
                                        es4 es4Var6 = es4Var5.r;
                                        if (es4Var6 == null) {
                                            vn4.V(xx4Var3, es4Var5);
                                        } else {
                                            xx4Var3.b(es4Var6);
                                        }
                                        while (true) {
                                            int i5 = xx4Var3.f2559o;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            es4 es4Var7 = (es4) xx4Var3.k(i5 - 1);
                                            if ((es4Var7.p & 1024) != 0) {
                                                for (es4 es4Var8 = es4Var7; es4Var8 != null && es4Var8.z; es4Var8 = es4Var8.r) {
                                                    if ((es4Var8.f737o & 1024) != 0) {
                                                        es4 es4VarL1 = es4Var8;
                                                        xx4 xx4Var4 = null;
                                                        while (es4VarL1 != null) {
                                                            if (es4VarL1 instanceof br2) {
                                                                br2 br2Var4 = (br2) es4VarL1;
                                                                if (br2Var4.z) {
                                                                    oq2 oq2VarW0 = br2Var4.W0();
                                                                    if (br2Var4.z && !br2Var4.A && oq2VarW0.a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((es4VarL1.f737o & 1024) != 0 && (es4VarL1 instanceof vm1)) {
                                                                int i6 = 0;
                                                                for (es4 es4Var9 = ((vm1) es4VarL1).B; es4Var9 != null; es4Var9 = es4Var9.r) {
                                                                    if ((es4Var9.f737o & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            es4VarL1 = es4Var9;
                                                                        } else {
                                                                            if (xx4Var4 == null) {
                                                                                xx4Var4 = new xx4(new es4[16]);
                                                                            }
                                                                            if (es4VarL1 != null) {
                                                                                xx4Var4.b(es4VarL1);
                                                                                es4VarL1 = null;
                                                                            }
                                                                            xx4Var4.b(es4Var9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            es4VarL1 = vn4.l0(xx4Var4);
                                                        }
                                                    }
                                                }
                                            }
                                            vn4.V(xx4Var3, es4Var7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((es4VarL0.f737o & 1024) != 0 && (es4VarL0 instanceof vm1)) {
                                for (es4 es4Var10 = ((vm1) es4VarL0).B; es4Var10 != null; es4Var10 = es4Var10.r) {
                                    if ((es4Var10.f737o & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            es4VarL0 = es4Var10;
                                        } else {
                                            if (xx4Var2 == null) {
                                                xx4Var2 = new xx4(new es4[16]);
                                            }
                                            if (es4VarL0 != null) {
                                                xx4Var2.b(es4VarL0);
                                                es4VarL0 = null;
                                            }
                                            xx4Var2.b(es4Var10);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            es4VarL0 = vn4.l0(xx4Var2);
                        }
                    }
                }
            }
            vn4.V(xx4Var, es4Var3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        ap6 ap6VarH;
        Function1 function1;
        Function1 function2;
        yf autofillManager = getAutofillManager();
        if (autofillManager != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                LayoutNode layoutNode = (LayoutNode) autofillManager.n.c.b(iKeyAt);
                if (layoutNode != null && (ap6VarH = layoutNode.H()) != null) {
                    jx4 jx4Var = ap6VarH.m;
                    Object objG = jx4Var.g(zo6.g);
                    if (objG == null) {
                        objG = null;
                    }
                    m3 m3Var = (m3) objG;
                    if (m3Var != null && (function2 = (Function1) m3Var.b) != null) {
                    }
                    Object objG2 = jx4Var.g(zo6.h);
                    m3 m3Var2 = (m3) (objG2 != null ? objG2 : null);
                    if (m3Var2 != null && (function1 = (Function1) m3Var2.b) != null) {
                    }
                }
            }
        }
        xf autofill = getAutofill();
        if (autofill != null) {
            a10 a10Var = autofill.b;
            if (a10Var.a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iKeyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (a10Var.a.get(Integer.valueOf(iKeyAt2)) != null) {
                        h2.f();
                        return;
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new e55("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new e55("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new e55("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    public final void b(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        bh bhVar = this.I;
        if (im3.n(str, bhVar.P)) {
            int iD2 = bhVar.N.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!im3.n(str, bhVar.Q) || (iD = bhVar.O.d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.I.m(i, this.n, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.I.m(i, this.n, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        zw4 zw4Var = this.M;
        if (!isAttachedToWindow()) {
            j(getRoot());
        }
        r(true);
        v47.h().m();
        this.O = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            ol0 canvasHolder = getCanvasHolder();
            cg cgVar = canvasHolder.a;
            Canvas canvas2 = cgVar.a;
            cgVar.a = canvas;
            getRoot().k(cgVar, null);
            canvasHolder.a.a = canvas2;
            if (zw4Var.i()) {
                int i = zw4Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((o03) ((nc5) zw4Var.f(i2))).g();
                }
            }
            int i3 = le8.m;
            zw4Var.d();
            this.O = false;
            Trace.endSection();
            zw4 zw4Var2 = this.N;
            if (zw4Var2 != null) {
                zw4Var.c(zw4Var2);
                zw4Var2.d();
            }
            if (l()) {
                if (Float.compare(this.D0, this.F0) != 0) {
                    float f = this.D0;
                    this.F0 = f;
                    lq.a(this, f);
                }
                View view = this.x;
                if (view != null) {
                    if (Float.compare(this.E0, this.G0) != 0) {
                        float f2 = this.E0;
                        this.G0 = f2;
                        lq.a(view, f2);
                    }
                    if (!Float.isNaN(this.E0)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.D0 = Float.NaN;
                this.E0 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v13 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r43) {
        /*
            Method dump skipped, instruction units count: 1981
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014c, code lost:
    
        if (o(r24) == false) goto L67;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        byte b = 1;
        if (!isFocused()) {
            return ((lq2) getFocusOwner()).e(keyEvent, new x8(this, keyEvent, b));
        }
        n54 n54Var = getComposeViewContext().t;
        nj8.a.setValue(new rn5(keyEvent.getMetaState()));
        return ((lq2) getFocusOwner()).e(keyEvent, new ti4((byte) 4)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        nf nfVar;
        if (isFocused()) {
            lq2 lq2Var = (lq2) getFocusOwner();
            if (lq2Var.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                br2 br2VarH = xs1.H(lq2Var.c);
                if (br2VarH != null) {
                    if (!br2VarH.m.z) {
                        ki3.c("visitAncestors called on an unattached node");
                    }
                    es4 es4Var = br2VarH.m;
                    LayoutNode layoutNodeP0 = vn4.p0(br2VarH);
                    while (layoutNodeP0 != null) {
                        if ((((es4) layoutNodeP0.S.g).p & 131072) != 0) {
                            while (es4Var != null) {
                                if ((es4Var.f737o & 131072) != 0) {
                                    es4 es4VarL0 = es4Var;
                                    xx4 xx4Var = null;
                                    while (es4VarL0 != null) {
                                        if ((es4VarL0.f737o & 131072) != 0 && (es4VarL0 instanceof vm1)) {
                                            int i = 0;
                                            for (es4 es4Var2 = ((vm1) es4VarL0).B; es4Var2 != null; es4Var2 = es4Var2.r) {
                                                if ((es4Var2.f737o & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        es4VarL0 = es4Var2;
                                                    } else {
                                                        if (xx4Var == null) {
                                                            xx4Var = new xx4(new es4[16]);
                                                        }
                                                        if (es4VarL0 != null) {
                                                            xx4Var.b(es4VarL0);
                                                            es4VarL0 = null;
                                                        }
                                                        xx4Var.b(es4Var2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        es4VarL0 = vn4.l0(xx4Var);
                                    }
                                }
                                es4Var = es4Var.q;
                            }
                        }
                        layoutNodeP0 = layoutNodeP0.F();
                        es4Var = (layoutNodeP0 == null || (nfVar = layoutNodeP0.S) == null) ? null : (kn7) nfVar.f;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        this.Q0 = true;
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            this.Q0 = false;
            z(viewStructure);
        } catch (Throwable th) {
            this.Q0 = false;
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            ch.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) throws Throwable {
        Object ozVar;
        br2 br2VarG;
        if (this.J0) {
            ng ngVar = this.I0;
            removeCallbacks(ngVar);
            MotionEvent motionEvent2 = this.z0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.J0 = false;
            } else {
                ngVar.run();
            }
        }
        if (!m(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || o(motionEvent))) {
            int i = i(motionEvent);
            int i2 = 1;
            if ((i & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (ozVar = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    ozVar = new oz(i2);
                }
                if (ozVar.equals(new oz(i2)) && (br2VarG = ((lq2) getFocusOwner()).g()) != null) {
                    e45 e45VarO0 = vn4.o0(br2VarG);
                    if (!vt1.s(e45VarO0).b(e45VarO0, true).a((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        iq2.a(getFocusOwner());
                    }
                }
            }
            if ((i & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final nc5 f(hw2 hw2Var, b45 b45Var, l03 l03Var) {
        xx4 xx4Var;
        Reference referencePoll;
        Object obj;
        if (l03Var != null) {
            return new o03(l03Var, null, this, hw2Var, b45Var);
        }
        do {
            lh7 lh7Var = this.B0;
            ReferenceQueue referenceQueue = (ReferenceQueue) lh7Var.f1364o;
            xx4Var = (xx4) lh7Var.n;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                xx4Var.j(referencePoll);
            }
        } while (referencePoll != null);
        do {
            int i = xx4Var.f2559o;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) xx4Var.k(i - 1)).get();
        } while (obj == null);
        nc5 nc5Var = (nc5) obj;
        if (nc5Var == null) {
            return new o03(getGraphicsContext().c(), getGraphicsContext(), this, hw2Var, b45Var);
        }
        o03 o03Var = (o03) nc5Var;
        k03 k03Var = o03Var.n;
        if (k03Var == null) {
            throw ua5.r("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!o03Var.m.s) {
            ki3.a("layer should have been released before reuse");
        }
        o03Var.m = k03Var.c();
        o03Var.s = false;
        o03Var.p = hw2Var;
        o03Var.q = b45Var;
        o03Var.C = false;
        o03Var.D = false;
        o03Var.E = true;
        wn4.d(o03Var.t);
        float[] fArr = o03Var.u;
        if (fArr != null) {
            wn4.d(fArr);
        }
        o03Var.A = d18.b;
        o03Var.F = false;
        o03Var.r = 9223372034707292159L;
        o03Var.B = null;
        o03Var.z = 0;
        return nc5Var;
    }

    public final View findViewByAccessibilityIdTraversal(int accessibilityId) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return hm3.l(this, accessibilityId);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        v56 v56VarA;
        if (view == null || this.f0.b) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (viewFindNextFocus == null || !kh.o(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            br2 br2VarH = xs1.H(((lq2) getFocusOwner()).c);
            v56VarA = br2VarH != null ? xs1.J(br2VarH) : null;
            if (v56VarA == null) {
                v56VarA = fq2.a(view, this);
            }
        } else {
            v56VarA = fq2.a(view, this);
        }
        wp2 wp2VarD = fq2.d(i);
        int i2 = wp2VarD != null ? wp2VarD.a : 6;
        k76 k76Var = new k76();
        if (((lq2) getFocusOwner()).f(i2, v56VarA, new jg(k76Var, (byte) 0)) == null) {
            return view;
        }
        Object obj = k76Var.m;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || i2 == 1 || i2 == 2 || y57.v(xs1.J((br2) obj), fq2.a(viewFindNextFocus, this), v56VarA, i2)) {
            return this;
        }
        return viewFindNextFocus;
    }

    @Override // androidx.compose.ui.node.Owner
    public u3 getAccessibilityManager() {
        return getComposeViewContext().k;
    }

    public final cm getAndroidViewsHandler$ui() {
        if (this.c0 == null) {
            cm cmVar = new cm(getContext());
            this.c0 = cmVar;
            addView(cmVar, -1);
            requestLayout();
        }
        cm cmVar2 = this.c0;
        cmVar2.getClass();
        return cmVar2;
    }

    @Override // androidx.compose.ui.node.Owner
    public a10 getAutofillTree() {
        return this.autofillTree;
    }

    @Override // androidx.compose.ui.node.Owner
    public au0 getClipboard() {
        return getComposeViewContext().n;
    }

    @Override // androidx.compose.ui.node.Owner
    public bu0 getClipboardManager() {
        return getComposeViewContext().m;
    }

    public final c01 getComposeViewContext() {
        return get_composeViewContext();
    }

    /* JADX INFO: renamed from: getComposeViewContextIncrementedDuringInit$ui, reason: from getter */
    public final boolean getComposeViewContextIncrementedDuringInit() {
        return this.composeViewContextIncrementedDuringInit;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.S.getValue();
    }

    /* JADX INFO: renamed from: getContentCaptureManager$ui, reason: from getter */
    public final ph getContentCaptureManager() {
        return this.contentCaptureManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public de1 getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.ui.node.Owner
    public in1 getDensity() {
        return (in1) this.w.getValue();
    }

    public v56 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            br2 br2VarH = xs1.H(((lq2) getFocusOwner()).c);
            if (br2VarH != null) {
                return xs1.J(br2VarH);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return fq2.a(viewFindFocus, this);
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    public iq2 getFocusOwner() {
        return this.y;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        v56 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (im3.n(((lq2) getFocusOwner()).f(6, null, new t2((byte) 12)), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public mr2 getFontFamilyResolver() {
        return (mr2) this.fontFamilyResolver.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public ir2 getFontLoader() {
        return getComposeViewContext().f472o;
    }

    /* JADX INFO: renamed from: getFrameEndScheduler$ui, reason: from getter */
    public final z84 getFrameEndScheduler() {
        return this.frameEndScheduler;
    }

    @Override // androidx.compose.ui.node.Owner
    public k03 getGraphicsContext() {
        return this.K;
    }

    @Override // androidx.compose.ui.node.Owner
    public v43 getHapticFeedBack() {
        return getComposeViewContext().q;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return ((iu) this.f0.e).I() || !this.u.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // androidx.compose.ui.node.Owner
    public jj3 getInputModeManager() {
        jj3 jj3Var = this.w0;
        if (jj3Var == null) {
            jj3Var = new jj3(isInTouchMode() ? 1 : 2);
            this.w0 = jj3Var;
        }
        return jj3Var;
    }

    public final qj3 getInsetsListener() {
        return this.insetsListener;
    }

    /* JADX INFO: renamed from: getLastMatrixRecalculationAnimationTime$ui, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.Owner
    public j04 getLayoutDirection() {
        return (j04) this.v0.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public kd4 getLocaleList() {
        return (kd4) this.T.getValue();
    }

    public long getMeasureIteration() {
        if (this.f0.b) {
            return 1L;
        }
        ki3.a("measureIteration should be only used during the measure/layout pass");
        return 1L;
    }

    @Override // androidx.compose.ui.node.Owner
    public hs4 getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidComposeView getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    public il5 getPlacementScope() {
        le5 le5Var = kl5.a;
        return new sg4(this, (byte) 1);
    }

    /* JADX INFO: renamed from: getPlayNavigationSoundEffect$ui, reason: from getter */
    public final hw2 getPlayNavigationSoundEffect() {
        return this.playNavigationSoundEffect;
    }

    @Override // androidx.compose.ui.node.Owner
    public hn5 getPointerIconService() {
        return this.T0;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name and from getter */
    public final dh3 getPrimaryDirectionalMotionAxisOverride() {
        return this.primaryDirectionalMotionAxisOverride;
    }

    @Override // androidx.compose.ui.node.Owner
    public x56 getRectManager() {
        return this.rectManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public bd6 getRetainedValuesStore() {
        return this.retainedValuesStore;
    }

    @Override // androidx.compose.ui.node.Owner
    public LayoutNode getRoot() {
        return this.root;
    }

    public bf6 getRootForTest() {
        return this;
    }

    public final u22 getSavedStateRegistry() {
        u22 u22Var = this.s;
        if (u22Var != null) {
            return u22Var;
        }
        c01 composeViewContext = getComposeViewContext();
        composeViewContext.g();
        ai6 ai6Var = composeViewContext.e;
        ai6Var.getClass();
        Object parent = getParent();
        parent.getClass();
        View view = (View) parent;
        Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
        LinkedHashMap linkedHashMap = null;
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view.getId());
        }
        String strM = ua5.m("SaveableStateRegistry:", strValueOf);
        a65 a65VarR = ai6Var.r();
        Bundle bundleX0 = a65VarR.x0(strM);
        if (bundleX0 != null) {
            linkedHashMap = new LinkedHashMap();
            for (String str : bundleX0.keySet()) {
                ArrayList parcelableArrayList = bundleX0.getParcelableArrayList(str);
                parcelableArrayList.getClass();
                linkedHashMap.put(str, parcelableArrayList);
            }
        }
        h31 h31Var = new h31((byte) 25);
        h72 h72Var = ph6.a;
        oh6 oh6Var = new oh6(linkedHashMap, h31Var);
        boolean z = false;
        if (a65VarR.D0(strM) == null) {
            try {
                a65VarR.Q0(strM, new fy0(oh6Var, (byte) 1));
                z = true;
            } catch (IllegalArgumentException unused) {
            }
        }
        u22 u22Var2 = new u22(oh6Var, new ww1(z, a65VarR, strM));
        this.s = u22Var2;
        return u22Var2;
    }

    public final boolean getScrollCaptureInProgress() {
        tj6 tj6Var;
        if (Build.VERSION.SDK_INT >= 31 && (tj6Var = this.R0) != null && ((Boolean) tj6Var.a.getValue()).booleanValue()) {
            return true;
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AndroidComposeView) {
                return ((AndroidComposeView) parent).getScrollCaptureInProgress();
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.node.Owner
    public ip6 getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.ui.node.Owner
    public d14 getSharedDrawScope() {
        return getComposeViewContext().s;
    }

    @Override // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? gq.a.a(this) : this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.Owner
    public pc5 getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.Owner
    public q57 getSoftwareKeyboardController() {
        zm1 zm1Var = this.t0;
        if (zm1Var != null) {
            return zm1Var;
        }
        zm1 zm1Var2 = new zm1(getTextInputService());
        this.t0 = zm1Var2;
        return zm1Var2;
    }

    @Override // androidx.compose.ui.node.Owner
    public js7 getTextInputService() {
        js7 js7Var = this.r0;
        if (js7Var != null) {
            return js7Var;
        }
        js7 js7Var2 = new js7(getLegacyTextInputServiceAndroid());
        this.r0 = js7Var2;
        return js7Var2;
    }

    @Override // androidx.compose.ui.node.Owner
    public pt7 getTextToolbar() {
        il ilVar = this.y0;
        if (ilVar != null) {
            return ilVar;
        }
        il ilVar2 = new il();
        new y(ilVar2, (byte) 9);
        this.y0 = ilVar2;
        return ilVar2;
    }

    public final af6 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public View getView() {
        return this;
    }

    @Override // androidx.compose.ui.node.Owner
    public ee8 getViewConfiguration() {
        return getComposeViewContext().r;
    }

    @Override // androidx.compose.ui.node.Owner
    public mj8 getWindowInfo() {
        return getComposeViewContext().t;
    }

    public final void h(LayoutNode layoutNode, boolean z) {
        this.f0.k(layoutNode, z);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0144 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0149  */
    /* JADX WARN: Code duplicated, block: B:108:0x0153  */
    /* JADX WARN: Code duplicated, block: B:109:0x0155  */
    /* JADX WARN: Code duplicated, block: B:111:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x015c A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x016e A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0171 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0180 A[Catch: all -> 0x0076, TRY_ENTER, TryCatch #0 {all -> 0x0076, blocks: (B:14:0x0034, B:16:0x003e, B:22:0x004e, B:38:0x007d, B:40:0x0081, B:41:0x0093, B:50:0x00a6, B:52:0x00ac, B:120:0x0180, B:121:0x018c, B:25:0x0056, B:31:0x0062, B:34:0x006a), top: B:144:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0197  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a4 A[Catch: all -> 0x01bf, TryCatch #3 {all -> 0x01bf, blocks: (B:122:0x0190, B:126:0x019c, B:128:0x01a4, B:130:0x01ae, B:129:0x01a7), top: B:149:0x0190 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x01a7 A[Catch: all -> 0x01bf, TryCatch #3 {all -> 0x01bf, blocks: (B:122:0x0190, B:126:0x019c, B:128:0x01a4, B:130:0x01ae, B:129:0x01a7), top: B:149:0x0190 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0099  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00da A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00eb A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x010d A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0113 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x011f A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0124  */
    /* JADX WARN: Code duplicated, block: B:95:0x0129 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0139  */
    public final int i(MotionEvent motionEvent) throws Throwable {
        int actionMasked;
        MotionEvent motionEvent2;
        boolean z;
        AndroidComposeView androidComposeView;
        boolean z2;
        boolean z3;
        MotionEvent motionEvent3;
        int iH;
        u53 u53Var;
        AndroidComposeView androidComposeView2;
        MotionEvent motionEvent4;
        int pointerId;
        int action;
        yt4 yt4Var;
        MotionEvent motionEvent5;
        float x;
        float x2;
        boolean z4;
        MotionEvent motionEvent6;
        long eventTime;
        boolean z5;
        u53 u53Var2;
        AndroidComposeView androidComposeView3 = this;
        androidComposeView3.removeCallbacks(androidComposeView3.H0);
        try {
            B(motionEvent);
            androidComposeView3.n0 = true;
            androidComposeView3.r(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent7 = androidComposeView3.z0;
                boolean z6 = motionEvent7 != null && motionEvent7.getToolType(0) == 3;
                ll2 ll2Var = androidComposeView3.R;
                if (motionEvent7 == null) {
                    motionEvent2 = motionEvent7;
                    if (motionEvent.getToolType(0) == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z6) {
                        androidComposeView = this;
                    } else {
                        androidComposeView = this;
                    }
                    if (motionEvent.getButtonState() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (actionMasked2 == 8) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    motionEvent3 = androidComposeView.z0;
                    if (motionEvent3 != null) {
                        motionEvent4 = androidComposeView.z0;
                        if (motionEvent4 != null) {
                            pointerId = motionEvent4.getPointerId(0);
                        } else {
                            pointerId = -1;
                        }
                        action = motionEvent.getAction();
                        yt4Var = androidComposeView.Q;
                        if (action == 9) {
                            if (motionEvent.getAction() == 0) {
                                motionEvent5 = androidComposeView.z0;
                                if (motionEvent5 != null) {
                                    x = motionEvent5.getX();
                                } else {
                                    x = Float.NaN;
                                }
                                MotionEvent motionEvent8 = androidComposeView.z0;
                                if (motionEvent8 != null) {
                                }
                                x2 = motionEvent.getX();
                                float y = motionEvent.getY();
                                if (x == x2) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                motionEvent6 = androidComposeView.z0;
                                if (motionEvent6 != null) {
                                    eventTime = motionEvent6.getEventTime();
                                } else {
                                    eventTime = -1;
                                }
                                if (eventTime != motionEvent.getEventTime()) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (pointerId >= 0) {
                                        yt4Var.c.delete(pointerId);
                                        yt4Var.b.delete(pointerId);
                                    }
                                    u53Var2 = (u53) ll2Var.f1375o;
                                    if (u53Var2.d) {
                                        u53Var2.d = true;
                                    } else {
                                        u53Var2.g.a.g();
                                    }
                                } else {
                                    if (pointerId >= 0) {
                                        yt4Var.c.delete(pointerId);
                                        yt4Var.b.delete(pointerId);
                                    }
                                    u53Var2 = (u53) ll2Var.f1375o;
                                    if (u53Var2.d) {
                                        u53Var2.d = true;
                                    } else {
                                        u53Var2.g.a.g();
                                    }
                                }
                            }
                        } else if (motionEvent.getAction() == 0) {
                            motionEvent5 = androidComposeView.z0;
                            if (motionEvent5 != null) {
                                x = motionEvent5.getX();
                            } else {
                                x = Float.NaN;
                            }
                            MotionEvent motionEvent9 = androidComposeView.z0;
                            if (motionEvent9 != null) {
                            }
                            x2 = motionEvent.getX();
                            float y2 = motionEvent.getY();
                            if (x == x2) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            motionEvent6 = androidComposeView.z0;
                            if (motionEvent6 != null) {
                                eventTime = motionEvent6.getEventTime();
                            } else {
                                eventTime = -1;
                            }
                            if (eventTime != motionEvent.getEventTime()) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z4) {
                                if (pointerId >= 0) {
                                    yt4Var.c.delete(pointerId);
                                    yt4Var.b.delete(pointerId);
                                }
                                u53Var2 = (u53) ll2Var.f1375o;
                                if (u53Var2.d) {
                                    u53Var2.d = true;
                                } else {
                                    u53Var2.g.a.g();
                                }
                            } else {
                                if (pointerId >= 0) {
                                    yt4Var.c.delete(pointerId);
                                    yt4Var.b.delete(pointerId);
                                }
                                u53Var2 = (u53) ll2Var.f1375o;
                                if (u53Var2.d) {
                                    u53Var2.d = true;
                                } else {
                                    u53Var2.g.a.g();
                                }
                            }
                        }
                    }
                    androidComposeView.z0 = MotionEvent.obtainNoHistory(motionEvent);
                    if (z3) {
                        androidComposeView.I(motionEvent, 10, motionEvent.getEventTime(), true);
                    }
                    iH = H(motionEvent);
                    Trace.endSection();
                    if ((iH & 4) != 0) {
                        androidComposeView2 = this;
                    } else {
                        u53Var = (u53) ll2Var.f1375o;
                        if (u53Var.d) {
                            u53Var.d = true;
                        } else {
                            u53Var.g.a.g();
                        }
                        androidComposeView2 = this;
                        androidComposeView2.I(motionEvent, 9, motionEvent.getEventTime(), true);
                    }
                    androidComposeView2.n0 = false;
                    return iH;
                }
                try {
                    if (!((motionEvent7.getSource() == motionEvent.getSource() && motionEvent7.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                        motionEvent2 = motionEvent7;
                    } else if (motionEvent7.getButtonState() != 0 || (actionMasked = motionEvent7.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                        motionEvent2 = motionEvent7;
                        if (!ll2Var.m) {
                            ((mg4) ((g95) ll2Var.p).m).a();
                            ((u53) ll2Var.f1375o).c();
                        }
                    } else if (motionEvent7.getActionMasked() == 10 || !z6) {
                        motionEvent2 = motionEvent7;
                    } else {
                        androidComposeView3.I(motionEvent7, 10, motionEvent7.getEventTime(), true);
                        motionEvent2 = motionEvent7;
                    }
                    if (motionEvent.getToolType(0) == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z6 || !z || actionMasked2 == 3 || actionMasked2 == 9 || !n(motionEvent)) {
                        androidComposeView = this;
                    } else {
                        androidComposeView = this;
                        androidComposeView.I(motionEvent, 9, motionEvent.getEventTime(), true);
                    }
                    if (motionEvent.getButtonState() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (actionMasked2 == 8 || z2 || motionEvent2 == null || motionEvent2.isFromSource(4098)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    motionEvent3 = androidComposeView.z0;
                    if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                        motionEvent4 = androidComposeView.z0;
                        if (motionEvent4 != null) {
                            pointerId = motionEvent4.getPointerId(0);
                        } else {
                            pointerId = -1;
                        }
                        action = motionEvent.getAction();
                        yt4Var = androidComposeView.Q;
                        if (action == 9 || motionEvent.getHistorySize() != 0) {
                            if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                motionEvent5 = androidComposeView.z0;
                                if (motionEvent5 != null) {
                                    x = motionEvent5.getX();
                                } else {
                                    x = Float.NaN;
                                }
                                MotionEvent motionEvent10 = androidComposeView.z0;
                                float y3 = motionEvent10 != null ? motionEvent10.getY() : Float.NaN;
                                x2 = motionEvent.getX();
                                float y4 = motionEvent.getY();
                                if (x == x2 || y3 != y4) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                motionEvent6 = androidComposeView.z0;
                                if (motionEvent6 != null) {
                                    eventTime = motionEvent6.getEventTime();
                                } else {
                                    eventTime = -1;
                                }
                                if (eventTime != motionEvent.getEventTime()) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z4 || z5) {
                                    if (pointerId >= 0) {
                                        yt4Var.c.delete(pointerId);
                                        yt4Var.b.delete(pointerId);
                                    }
                                    u53Var2 = (u53) ll2Var.f1375o;
                                    if (u53Var2.d) {
                                        u53Var2.d = true;
                                    } else {
                                        u53Var2.g.a.g();
                                    }
                                }
                            }
                        } else if (pointerId >= 0) {
                            yt4Var.c.delete(pointerId);
                            yt4Var.b.delete(pointerId);
                        }
                    }
                    androidComposeView.z0 = MotionEvent.obtainNoHistory(motionEvent);
                    if (z3) {
                        androidComposeView.I(motionEvent, 10, motionEvent.getEventTime(), true);
                    }
                    iH = H(motionEvent);
                    try {
                        Trace.endSection();
                        if ((iH & 4) != 0 && z3) {
                            u53Var = (u53) ll2Var.f1375o;
                            if (u53Var.d) {
                                u53Var.d = true;
                            } else {
                                u53Var.g.a.g();
                            }
                            androidComposeView2 = this;
                            androidComposeView2.I(motionEvent, 9, motionEvent.getEventTime(), true);
                        } else {
                            androidComposeView2 = this;
                        }
                        androidComposeView2.n0 = false;
                        return iH;
                    } catch (Throwable th) {
                        th = th;
                        androidComposeView3 = this;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        androidComposeView3.n0 = false;
        throw th;
    }

    public final void k(LayoutNode layoutNode) {
        this.f0.y(layoutNode, false);
        xx4 xx4VarL = layoutNode.L();
        Object[] objArr = xx4VarL.m;
        int i = xx4VarL.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            k((LayoutNode) objArr[i2]);
        }
    }

    public final boolean n(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final boolean o(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.z0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        bd6 bd6Var;
        Object obj;
        super.onAttachedToWindow();
        if (!getRoot().W()) {
            getRoot().e(this);
        }
        byte b = 1;
        setAttached(true);
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(hm3.o());
        }
        this.insetsListener.onViewAttachedToWindow(this);
        if (!this.composeViewContextIncrementedDuringInit) {
            getComposeViewContext().e();
        }
        int i = 0;
        this.composeViewContextIncrementedDuringInit = false;
        k(getRoot());
        j(getRoot());
        getSnapshotObserver().a.g();
        AndroidComposeView outOfFrameExecutor = getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            hk0.l("Expected the view to be attached to window.");
            return;
        }
        outOfFrameExecutor.E(new ig(this, b));
        getComposeViewContext().d();
        c01 composeViewContext = getComposeViewContext();
        composeViewContext.g();
        we8 we8Var = composeViewContext.f;
        z84 z84Var = this.frameEndScheduler;
        if (we8Var == null || z84Var == null) {
            bd6Var = null;
        } else {
            ve8 ve8VarO = we8Var.getG0();
            te8 te8Var = new te8();
            af1 af1Var = af1.b;
            ve8VarO.getClass();
            af1Var.getClass();
            pn5 pn5Var = new pn5(ve8VarO, te8Var, af1Var);
            wt3 wt3VarB = w86.a.b(b94.class);
            String strC = wt3VarB.c();
            if (strC == null) {
                hk0.g("Local and anonymous classes can not be ViewModels");
                return;
            }
            b94 b94Var = (b94) pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            kw4 kw4Var = b94Var.n;
            Object objB = kw4Var.b(id);
            if (objB == null) {
                objB = new zw4(1);
                kw4Var.i(id, objB);
            }
            zw4 zw4Var = (zw4) objB;
            Object[] objArr = zw4Var.a;
            int i2 = zw4Var.b;
            while (true) {
                if (i >= i2) {
                    obj = null;
                    break;
                }
                obj = objArr[i];
                if (!((a94) obj).c) {
                    break;
                } else {
                    i++;
                }
            }
            a94 a94Var = (a94) obj;
            if (a94Var == null) {
                a94Var = new a94();
                zw4Var.a(a94Var);
            }
            a94Var.c = true;
            this.r = a94Var;
            bd6Var = a94Var.b;
        }
        if (bd6Var == null) {
            bd6Var = yl7.A;
        }
        this.retainedValuesStore = bd6Var;
        Function1 function1 = this.p0;
        if (function1 != null) {
            function1.invoke(getComposeViewContext());
            this.p0 = null;
        }
        x84 x84VarZ = getComposeViewContext().d().getR();
        x84VarZ.a(this);
        x84VarZ.a(this.contentCaptureManager);
        getInputModeManager().a.setValue(new hj3(isInTouchMode() ? (byte) 1 : (byte) 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            hh.a.b(this);
        }
        yf autofillManager = getAutofillManager();
        if (autofillManager != null) {
            ((lq2) getFocusOwner()).g.a(autofillManager);
            getSemanticsOwner().d.a(autofillManager);
        }
        ((lq2) getFocusOwner()).g.a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        bu6 bu6Var = (bu6) this.s0.get();
        xj xjVar = (xj) (bu6Var != null ? bu6Var.b : null);
        if (xjVar == null) {
            return getLegacyTextInputServiceAndroid().d;
        }
        bu6 bu6Var2 = (bu6) xjVar.p.get();
        gj3 gj3Var = (gj3) (bu6Var2 != null ? bu6Var2.b : null);
        return gj3Var != null && (gj3Var.e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        K(configuration);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x013c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0145  */
    /* JADX WARN: Code duplicated, block: B:107:0x0149  */
    /* JADX WARN: Code duplicated, block: B:108:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0150  */
    /* JADX WARN: Code duplicated, block: B:110:0x0155  */
    /* JADX WARN: Code duplicated, block: B:112:0x0158  */
    /* JADX WARN: Code duplicated, block: B:115:0x0160  */
    /* JADX WARN: Code duplicated, block: B:119:0x018f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        bu6 bu6Var = (bu6) this.s0.get();
        xj xjVar = (xj) (bu6Var != null ? bu6Var.b : null);
        int i2 = 0;
        Object[] objArr = 0;
        if (xjVar != null) {
            bu6 bu6Var2 = (bu6) xjVar.p.get();
            gj3 gj3Var = (gj3) (bu6Var2 != null ? bu6Var2.b : null);
            if (gj3Var == null) {
                return null;
            }
            synchronized (gj3Var.c) {
                if (gj3Var.e) {
                    return null;
                }
                t56 t56VarA = gj3Var.a.a(editorInfo);
                fj3 fj3Var = new fj3((Object) gj3Var, (byte) (objArr == true ? 1 : 0));
                InputConnection e65Var = Build.VERSION.SDK_INT >= 34 ? new e65(t56VarA, fj3Var) : new d65(t56VarA, fj3Var);
                gj3Var.d.b(new gh8(e65Var));
                return e65Var;
            }
        }
        ms7 legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
        if (!legacyTextInputServiceAndroid.d) {
            return null;
        }
        bf3 bf3Var = legacyTextInputServiceAndroid.h;
        zr7 zr7Var = legacyTextInputServiceAndroid.g;
        int i3 = bf3Var.e;
        boolean z = bf3Var.a;
        int i4 = 4;
        int i5 = 3;
        if (i3 == 1) {
            if (z) {
                i2 = 6;
            }
        } else if (i3 == 0) {
            i2 = 1;
        } else if (i3 == 2) {
            i2 = 2;
        } else if (i3 == 6) {
            i2 = 5;
        } else if (i3 == 5) {
            i2 = 7;
        } else if (i3 == 3) {
            i2 = 3;
        } else if (i3 == 4) {
            i2 = 4;
        } else {
            if (i3 != 7) {
                hk0.l("invalid ImeAction");
                return null;
            }
            i2 = 6;
        }
        editorInfo.imeOptions = i2;
        int i6 = bf3Var.d;
        byte b = 14;
        if (i6 != 1) {
            if (i6 == 2) {
                editorInfo.inputType = 1;
                i2 |= Integer.MIN_VALUE;
                editorInfo.imeOptions = i2;
            } else if (i6 == 3) {
                editorInfo.inputType = 2;
                i4 = 2;
            } else {
                if (i6 == 4) {
                    editorInfo.inputType = 3;
                } else {
                    i5 = 17;
                    if (i6 == 5) {
                        editorInfo.inputType = 17;
                    } else if (i6 == 6) {
                        i4 = 33;
                        editorInfo.inputType = 33;
                    } else if (i6 == 7) {
                        i4 = 129;
                        editorInfo.inputType = 129;
                    } else if (i6 == 8) {
                        editorInfo.inputType = 18;
                        i4 = 18;
                    } else if (i6 == 9) {
                        i4 = 8194;
                        editorInfo.inputType = 8194;
                    } else if (i6 == 10) {
                        i4 = 145;
                        editorInfo.inputType = 145;
                    } else if (i6 == 11) {
                        i4 = 113;
                        editorInfo.inputType = 113;
                    } else if (i6 == 12) {
                        i4 = 97;
                        editorInfo.inputType = 97;
                    } else if (i6 == 13) {
                        i4 = 49;
                        editorInfo.inputType = 49;
                    } else if (i6 == 14) {
                        i4 = 65;
                        editorInfo.inputType = 65;
                    } else if (i6 == 15) {
                        i4 = 81;
                        editorInfo.inputType = 81;
                    } else if (i6 == 16) {
                        i4 = 177;
                        editorInfo.inputType = 177;
                    } else if (i6 == 17) {
                        i4 = 193;
                        editorInfo.inputType = 193;
                    } else if (i6 == 18) {
                        editorInfo.inputType = 4;
                    } else {
                        i4 = 20;
                        if (i6 == 19) {
                            editorInfo.inputType = 20;
                        } else if (i6 == 20) {
                            i4 = 36;
                            editorInfo.inputType = 36;
                        } else if (i6 == 21) {
                            i4 = 4098;
                            editorInfo.inputType = 4098;
                        } else if (i6 == 22) {
                            i4 = 12290;
                            editorInfo.inputType = 12290;
                        } else if (i6 == 23) {
                            i4 = 8210;
                            editorInfo.inputType = 8210;
                        } else if (i6 == 24) {
                            i4 = 4114;
                            editorInfo.inputType = 4114;
                        } else {
                            if (i6 != 25) {
                                hk0.l("Invalid Keyboard Type");
                                return null;
                            }
                            i4 = 12306;
                            editorInfo.inputType = 12306;
                        }
                    }
                }
                i4 = i5;
            }
            if (!z && (i4 & 15) == 1) {
                i4 |= 131072;
                editorInfo.inputType = i4;
                if (i3 == 1) {
                    editorInfo.imeOptions = i2 | 1073741824;
                }
            }
            if ((i4 & 15) == 1) {
                i = bf3Var.b;
                if (i == 1) {
                    i4 |= 4096;
                    editorInfo.inputType = i4;
                } else if (i == 2) {
                    i4 |= 8192;
                    editorInfo.inputType = i4;
                } else if (i == 3) {
                    i4 |= 16384;
                    editorInfo.inputType = i4;
                }
                if (bf3Var.c) {
                    editorInfo.inputType = 32768 | i4;
                }
            }
            long j = zr7Var.b;
            int i7 = gt7.c;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = (int) (j & 4294967295L);
            vt1.L(editorInfo, zr7Var.a.n);
            editorInfo.imeOptions |= 33554432;
            if (a92.d()) {
                a92.a().i(editorInfo);
            }
            s56 s56Var = new s56(legacyTextInputServiceAndroid.g, new l07(legacyTextInputServiceAndroid, b), legacyTextInputServiceAndroid.h.c);
            legacyTextInputServiceAndroid.i.add(new WeakReference(s56Var));
            return s56Var;
        }
        editorInfo.inputType = 1;
        i4 = 1;
        if (!z) {
            i4 |= 131072;
            editorInfo.inputType = i4;
            if (i3 == 1) {
                editorInfo.imeOptions = i2 | 1073741824;
            }
        }
        if ((i4 & 15) == 1) {
            i = bf3Var.b;
            if (i == 1) {
                i4 |= 4096;
                editorInfo.inputType = i4;
            } else if (i == 2) {
                i4 |= 8192;
                editorInfo.inputType = i4;
            } else if (i == 3) {
                i4 |= 16384;
                editorInfo.inputType = i4;
            }
            if (bf3Var.c) {
                editorInfo.inputType = 32768 | i4;
            }
        }
        long j2 = zr7Var.b;
        int i8 = gt7.c;
        editorInfo.initialSelStart = (int) (j2 >> 32);
        editorInfo.initialSelEnd = (int) (j2 & 4294967295L);
        vt1.L(editorInfo, zr7Var.a.n);
        editorInfo.imeOptions |= 33554432;
        if (a92.d()) {
            a92.a().i(editorInfo);
        }
        s56 s56Var2 = new s56(legacyTextInputServiceAndroid.g, new l07(legacyTextInputServiceAndroid, b), legacyTextInputServiceAndroid.h.c);
        legacyTextInputServiceAndroid.i.add(new WeakReference(s56Var2));
        return s56Var2;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        ph phVar = this.contentCaptureManager;
        phVar.getClass();
        nh.f(phVar, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.insetsListener.onViewDetachedFromWindow(this);
        View view = this.x;
        if (l() && view != null) {
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            zw4 zw4Var = X0;
            synchronized (zw4Var) {
                zw4Var.j(this);
            }
        }
        getComposeViewContext().b();
        br5 br5Var = getSnapshotObserver().a;
        ar arVar = (ar) br5Var.i;
        if (arVar != null) {
            arVar.n();
        }
        br5Var.a();
        x84 x84VarZ = getComposeViewContext().d().getR();
        x84VarZ.f(this.contentCaptureManager);
        x84VarZ.f(this);
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        a94 a94Var = this.r;
        if (a94Var != null) {
            a94Var.c = false;
        }
        this.r = null;
        if (i >= 31) {
            hh.a.a(this);
        }
        yf autofillManager = getAutofillManager();
        if (autofillManager != null) {
            getSemanticsOwner().d.j(autofillManager);
            ((lq2) getFocusOwner()).g.j(autofillManager);
        }
        x56 rectManager = getRectManager();
        rectManager.g = rectManager.d.c(0L, 0L, null, 0, 0);
        getRectManager().a();
        x56 rectManager2 = getRectManager();
        lg lgVar = rectManager2.i;
        if (lgVar != null) {
            rectManager2.b.removeCallbacks(lgVar);
            rectManager2.i = null;
        }
        ((lq2) getFocusOwner()).g.j(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        lq2 lq2Var = (lq2) getFocusOwner();
        vs1.O(lq2Var.c, true);
        if (lq2Var.g() != null) {
            br2 br2VarG = lq2Var.g();
            lq2Var.j(null);
            if (br2VarG != null) {
                br2VarG.V0(wq2.m, wq2.f2437o);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.lastMatrixRecalculationAnimationTime = 0L;
        L();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        K(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.lastMatrixRecalculationAnimationTime = 0L;
            this.f0.q(this.M0);
            this.d0 = null;
            L();
            if (this.c0 != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                try {
                    getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        sn1 sn1Var = this.f0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!getRoot().W()) {
                getRoot().e(this);
            }
            if (!isAttachedToWindow()) {
                k(getRoot());
            }
            long jD = d(i);
            long jD2 = d(i2);
            long jS = kh.s((int) (jD >>> 32), (int) (jD & 4294967295L), (int) (jD2 >>> 32), (int) (4294967295L & jD2));
            r61 r61Var = this.d0;
            if (r61Var == null) {
                this.d0 = new r61(jS);
                this.e0 = false;
            } else if (!r61.c(r61Var.a, jS)) {
                this.e0 = true;
            }
            sn1Var.z(jS);
            sn1Var.s();
            setMeasuredDimension(getRoot().I(), getRoot().r());
            if (this.c0 != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                try {
                    getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().I(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().r(), 1073741824));
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (viewStructure == null || this.Q0) {
            return;
        }
        z(viewStructure);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        gn5 gn5Var;
        int toolType = motionEvent.getToolType(i);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (gn5Var = ((sg) getPointerIconService()).a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        Context context = getContext();
        return gn5Var instanceof yj ? PointerIcon.getSystemIcon(context, ((yj) gn5Var).b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        hl0 hl0VarS;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(hm3.o());
        }
        a94 a94Var = this.r;
        if (a94Var != null) {
            z84 z84Var = this.frameEndScheduler;
            z84Var.getClass();
            am4 am4Var = (am4) a94Var.a.n;
            if (!am4Var.m || am4Var.f337o) {
                return;
            }
            try {
                hl0VarS = ((vn8) z84Var).m.s(new vm3((Object) a94Var, (byte) 5));
            } catch (CancellationException unused) {
                if (!am4Var.n) {
                    if (am4Var.f337o) {
                        vp5.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    am4Var.a();
                    am4Var.f337o = true;
                }
                hl0VarS = null;
            }
            hl0 hl0Var = a94Var.d;
            if (hl0Var != null) {
                hl0Var.cancel();
            }
            a94Var.d = hl0VarS;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        j04 j04Var;
        if (this.f14o) {
            int[] iArr = fq2.a;
            j04 j04Var2 = j04.m;
            if (i != 0) {
                j04Var = i != 1 ? null : j04.n;
            } else {
                j04Var = j04Var2;
            }
            if (j04Var != null) {
                j04Var2 = j04Var;
            }
            setLayoutDirection(j04Var2);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        tj6 tj6Var;
        if (Build.VERSION.SDK_INT < 31 || (tj6Var = this.R0) == null) {
            return;
        }
        tj6Var.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        L();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        a94 a94Var = this.r;
        if (a94Var != null) {
            am4 am4Var = (am4) a94Var.a.n;
            if (am4Var.m && !am4Var.f337o) {
                hl0 hl0Var = a94Var.d;
                if (hl0Var != null) {
                    hl0Var.cancel();
                }
                a94Var.d = null;
                return;
            }
            if (am4Var.n) {
                return;
            }
            if (!am4Var.f337o) {
                vp5.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!am4Var.p.i()) {
                vp5.a("Attempted to start retaining exited values with pending exited values");
            }
            am4Var.f337o = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        getInputModeManager().a.setValue(new hj3(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        ph phVar = this.contentCaptureManager;
        phVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (im3.n(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            nh.b(phVar, longSparseArray);
        } else {
            phVar.m.post(new u4((Object) phVar, (Object) longSparseArray, (byte) 16));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zO;
        this.O0 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zO = hm3.o())) {
            return;
        }
        setShowLayoutBounds(zO);
        j(getRoot());
    }

    public final void p(float[] fArr) {
        A();
        wn4.f(fArr, this.k0);
        kh.x(fArr, Float.intBitsToFloat((int) (this.o0 >> 32)), Float.intBitsToFloat((int) (this.o0 & 4294967295L)), this.i0);
    }

    public final long q(long j) {
        A();
        long jB = wn4.b(j, this.k0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.o0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.o0 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public final void r(boolean z) {
        sn1 sn1Var = this.f0;
        if (((iu) sn1Var.e).I() || ((xx4) ((a65) sn1Var.f).n).f2559o != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            try {
                if (sn1Var.q(z ? this.M0 : this.N0)) {
                    requestLayout();
                }
                sn1Var.e(false);
                getRectManager().a();
                if (this.P) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.P = false;
                }
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        byte b = 1;
        if (!isFocused()) {
            wp2 wp2VarD = fq2.d(i);
            int i2 = wp2VarD != null ? wp2VarD.a : 7;
            Boolean boolF = ((lq2) getFocusOwner()).f(i2, rect != null ? ds1.l0(rect) : null, new mg(i2, (byte) 0));
            Boolean bool = Boolean.TRUE;
            if (!im3.n(boolF, bool)) {
                if (!im3.n(((lq2) getFocusOwner()).f(i2, null, new mg(i2, b)), bool)) {
                    if (hasFocus() && (i2 == 1 || i2 == 2)) {
                        return ((lq2) getFocusOwner()).i(i2);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void s(LayoutNode layoutNode, long j) {
        sn1 sn1Var = this.f0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            sn1Var.r(layoutNode, j);
            if (!((iu) sn1Var.e).I()) {
                sn1Var.e(false);
                getRectManager().a();
                this.N0.a();
                if (this.P) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.P = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long intervalMillis) {
        this.I.t = intervalMillis;
    }

    public final void setComposeViewContext(c01 c01Var) {
        if (getCoroutineContext() != c01Var.c().j() && !getRoot().getChildren$ui().isEmpty()) {
            ki3.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        n47 n47VarC = el5.c();
        Function1 function1E = n47VarC != null ? n47VarC.e() : null;
        n47 n47VarF = el5.f(n47VarC);
        try {
            c01 c01Var2 = get_composeViewContext();
            el5.h(n47VarC, n47VarF, function1E);
            if (c01Var != c01Var2) {
                if (isAttachedToWindow()) {
                    c01Var2.b();
                    c01Var.e();
                }
                set_composeViewContext(c01Var);
                setCoroutineContext(c01Var.c().j());
            }
        } catch (Throwable th) {
            el5.h(n47VarC, n47VarF, function1E);
            throw th;
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.composeViewContextIncrementedDuringInit = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.S.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(ph phVar) {
        this.contentCaptureManager = phVar;
    }

    public void setCoroutineContext(de1 de1Var) {
        this.coroutineContext = de1Var;
    }

    public final void setFrameEndScheduler$ui(z84 z84Var) {
        this.frameEndScheduler = z84Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.lastMatrixRecalculationAnimationTime = j;
    }

    public final void setOnReadyForComposition(Function1 callback) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.composeViewContextIncrementedDuringInit) {
            callback.invoke(getComposeViewContext());
        } else {
            this.p0 = callback;
        }
    }

    public final void setPlayNavigationSoundEffect$ui(hw2 hw2Var) {
        this.playNavigationSoundEffect = hw2Var;
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m2setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(dh3 dh3Var) {
        this.primaryDirectionalMotionAxisOverride = dh3Var;
    }

    @Override // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    public void setUncaughtExceptionHandler(af6 handler) {
        this.f0.getClass();
    }

    public final void setUncaughtExceptionHandler$ui(af6 af6Var) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean t(int i) {
        if (i != 7 && i != 8) {
            Integer numC = fq2.c(i);
            if (numC == null) {
                throw ua5.r("Invalid focus direction");
            }
            int iIntValue = numC.intValue();
            br2 br2VarG = ((lq2) getFocusOwner()).g();
            if (br2VarG == null) {
                hk0.l("findNextViewInEmbeddedView called when owner does not have anything focused.");
                return false;
            }
            Integer numC2 = fq2.c(i);
            if (numC2 == null) {
                throw ua5.r("Invalid focus direction");
            }
            int iIntValue2 = numC2.intValue();
            ge8 ge8Var = vn4.p0(br2VarG).B;
            View interopView = ge8Var != null ? ge8Var.getInteropView() : null;
            View viewFindFocus = findFocus();
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            rootView.getClass();
            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
            if (viewFindNextFocus == null || interopView == null || !kh.o(interopView, viewFindNextFocus)) {
                viewFindNextFocus = null;
            }
            if (viewFindNextFocus != null) {
                return fq2.b(viewFindNextFocus, Integer.valueOf(iIntValue), null);
            }
        }
        return false;
    }

    public final void u() {
        zw4 zw4Var;
        Object[] objArr;
        if (this.W) {
            br5 br5Var = getSnapshotObserver().a;
            at4 at4Var = new at4((byte) 21);
            synchronized (br5Var.h) {
                try {
                    xx4 xx4Var = (xx4) br5Var.g;
                    int i = xx4Var.f2559o;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = xx4Var.m;
                        if (i2 >= i) {
                            break;
                        }
                        m57 m57Var = (m57) objArr[i2];
                        m57Var.d(at4Var);
                        if (!m57Var.f.j()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = xx4Var.m;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    xx4Var.f2559o = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.W = false;
        }
        cm cmVar = this.c0;
        if (cmVar != null) {
            c(cmVar);
        }
        yf autofillManager = getAutofillManager();
        if (autofillManager != null) {
            lw4 lw4Var = autofillManager.t;
            if (lw4Var.d == 0 && autofillManager.u) {
                autofillManager.m.C0().commit();
                autofillManager.u = false;
            }
            if (lw4Var.d != 0) {
                autofillManager.u = true;
            }
        }
        while (this.C0.i() && this.C0.f(0) != null) {
            int i5 = this.C0.b;
            int i6 = 0;
            while (true) {
                zw4Var = this.C0;
                if (i6 < i5) {
                    Function0 function0 = (Function0) zw4Var.f(i6);
                    this.C0.n(i6, null);
                    if (function0 != null) {
                        function0.a();
                    }
                    i6++;
                }
            }
            zw4Var.l(0, i5);
        }
    }

    public final void v(LayoutNode layoutNode) {
        bh bhVar = this.I;
        bhVar.J = true;
        if (bhVar.v()) {
            bhVar.w(layoutNode);
        }
        ph phVar = this.contentCaptureManager;
        phVar.r = true;
        if (phVar.d()) {
            phVar.s.b(f88.a);
        }
    }

    public final void w(LayoutNode layoutNode, boolean z, boolean z2, boolean z3) {
        LayoutNode layoutNodeF;
        LayoutNode layoutNodeF2;
        sn1 sn1Var = this.f0;
        if (!z) {
            if (sn1Var.y(layoutNode, z2) && z3) {
                F(layoutNode);
                return;
            }
            return;
        }
        iu iuVar = (iu) sn1Var.e;
        if (layoutNode.u == null) {
            ki3.c("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = layoutNode.v().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    gk0.s();
                    return;
                }
                if (!layoutNode.x() || z2) {
                    layoutNode.f0();
                    layoutNode.g0();
                    if (layoutNode.c0) {
                        return;
                    }
                    if ((im3.n(layoutNode.Z(), Boolean.TRUE) || sn1.m(layoutNode)) && ((layoutNodeF = layoutNode.F()) == null || !layoutNodeF.x())) {
                        iuVar.b(layoutNode, sm3.m);
                    } else if ((layoutNode.X() || sn1.n(layoutNode)) && ((layoutNodeF2 = layoutNode.F()) == null || !layoutNodeF2.A())) {
                        iuVar.b(layoutNode, sm3.f2031o);
                    }
                    if (sn1Var.c || !z3) {
                        return;
                    }
                    F(layoutNode);
                    return;
                }
                return;
            }
        }
        ((xx4) sn1Var.h).b(new ao4(layoutNode, true, z2));
    }

    public final void x(LayoutNode layoutNode, boolean z, boolean z2) {
        sm3 sm3Var = sm3.p;
        sn1 sn1Var = this.f0;
        if (!z) {
            sn1Var.getClass();
            int iOrdinal = layoutNode.v().ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                gk0.s();
                return;
            }
            LayoutNode layoutNodeF = layoutNode.F();
            boolean z3 = layoutNodeF == null || layoutNodeF.X();
            if (!z2) {
                if (layoutNode.A()) {
                    return;
                }
                if (layoutNode.u() && layoutNode.X() == z3 && layoutNode.X() == layoutNode.Y()) {
                    return;
                }
            }
            layoutNode.d0();
            if (!layoutNode.c0 && layoutNode.Y() && z3) {
                if ((layoutNodeF == null || !layoutNodeF.u()) && (layoutNodeF == null || !layoutNodeF.A())) {
                    ((iu) sn1Var.e).b(layoutNode, sm3Var);
                }
                if (sn1Var.c) {
                    return;
                }
                F(null);
                return;
            }
            return;
        }
        iu iuVar = (iu) sn1Var.e;
        int iOrdinal2 = layoutNode.v().ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    gk0.s();
                    return;
                }
            }
        }
        if ((layoutNode.x() || layoutNode.w()) && !z2) {
            return;
        }
        layoutNode.e0();
        layoutNode.d0();
        if (layoutNode.c0) {
            return;
        }
        LayoutNode layoutNodeF2 = layoutNode.F();
        if (im3.n(layoutNode.Z(), Boolean.TRUE) && ((layoutNodeF2 == null || !layoutNodeF2.x()) && (layoutNodeF2 == null || !layoutNodeF2.w()))) {
            iuVar.b(layoutNode, sm3.n);
        } else if (layoutNode.X() && ((layoutNodeF2 == null || !layoutNodeF2.u()) && (layoutNodeF2 == null || !layoutNodeF2.A()))) {
            iuVar.b(layoutNode, sm3Var);
        }
        if (sn1Var.c) {
            return;
        }
        F(null);
    }

    public final void y() {
        bh bhVar = this.I;
        bhVar.J = true;
        Handler handler = bhVar.p.getHandler();
        if (bhVar.v() && !bhVar.U && handler != null) {
            bhVar.U = true;
            handler.post(bhVar.W);
        }
        ph phVar = this.contentCaptureManager;
        phVar.r = true;
        Handler handler2 = phVar.m.getHandler();
        if (!phVar.d() || phVar.x || handler2 == null) {
            return;
        }
        phVar.x = true;
        handler2.post(phVar.y);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    public final void z(ViewStructure viewStructure) {
        yf autofillManager = getAutofillManager();
        if (autofillManager != null) {
            LayoutNode layoutNode = autofillManager.n.a;
            AutofillId autofillId = autofillManager.s;
            String str = autofillManager.q;
            x56 x56Var = autofillManager.p;
            zu1.H(viewStructure, layoutNode, autofillId, str, x56Var);
            Object[] objArr = i65.a;
            zw4 zw4Var = new zw4(2);
            zw4Var.a(layoutNode);
            zw4Var.a(viewStructure);
            while (zw4Var.i()) {
                Object objK = zw4Var.k(zw4Var.b - 1);
                objK.getClass();
                ViewStructure viewStructure2 = (ViewStructure) objK;
                Object objK2 = zw4Var.k(zw4Var.b - 1);
                objK2.getClass();
                List<LayoutNode> childrenInfo = ((LayoutNode) objK2).getChildrenInfo();
                int size = childrenInfo.size();
                for (int i = 0; i < size; i++) {
                    LayoutNode layoutNode2 = childrenInfo.get(i);
                    if (!layoutNode2.c0 && layoutNode2.W() && layoutNode2.X()) {
                        ap6 ap6VarH = layoutNode2.H();
                        if (ap6VarH != null) {
                            jx4 jx4Var = ap6VarH.m;
                            if (jx4Var.b(zo6.g) || jx4Var.b(zo6.h) || jx4Var.b(kp6.r) || jx4Var.b(kp6.s) || (Build.VERSION.SDK_INT >= 34 && jx4Var.b(pm8.u))) {
                                ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                zu1.H(viewStructureNewChild, layoutNode2, autofillId, str, x56Var);
                                zw4Var.a(layoutNode2);
                                zw4Var.a(viewStructureNewChild);
                            } else {
                                zw4Var.a(layoutNode2);
                                zw4Var.a(viewStructure2);
                            }
                        } else {
                            zw4Var.a(layoutNode2);
                            zw4Var.a(viewStructure2);
                        }
                    }
                }
            }
        }
        xf autofill = getAutofill();
        if (autofill != null) {
            a10 a10Var = autofill.b;
            LinkedHashMap linkedHashMap = a10Var.a;
            LinkedHashMap linkedHashMap2 = a10Var.a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int iIntValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    h2.f();
                    return;
                }
                ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                viewStructureNewChild2.setAutofillId(autofill.c, iIntValue);
                viewStructureNewChild2.setId(iIntValue, autofill.a.getContext().getPackageName(), null, null);
                viewStructureNewChild2.setAutofillType(1);
                throw null;
            }
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public xf getAutofill() {
        return this.autofill;
    }

    @Override // androidx.compose.ui.node.Owner
    public yf getAutofillManager() {
        return this.autofillManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public hi getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    /* JADX INFO: renamed from: getLayoutNodes, reason: from getter and merged with bridge method [inline-methods] */
    public kw4 m3getLayoutNodes() {
        return this.layoutNodes;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }
}
