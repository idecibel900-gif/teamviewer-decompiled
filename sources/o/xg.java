package o;

import android.content.ClipDescription;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class xg extends df6 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ p3 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xg(p3 p3Var, byte b) {
        super((byte) 6);
        this.t = b;
        this.u = p3Var;
    }

    @Override // o.df6
    public void g(int i, g4 g4Var, String str, Bundle bundle) {
        switch (this.t) {
            case 0:
                ((bh) this.u).j(i, g4Var, str, bundle);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0216  */
    /* JADX WARN: Code duplicated, block: B:106:0x021b  */
    /* JADX WARN: Code duplicated, block: B:111:0x022e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0238  */
    /* JADX WARN: Code duplicated, block: B:115:0x0247  */
    /* JADX WARN: Code duplicated, block: B:117:0x0263  */
    /* JADX WARN: Code duplicated, block: B:119:0x026c  */
    /* JADX WARN: Code duplicated, block: B:11:0x0045  */
    /* JADX WARN: Code duplicated, block: B:121:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:122:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:124:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:125:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:131:0x02e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:136:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:139:0x0306  */
    /* JADX WARN: Code duplicated, block: B:141:0x030c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0318  */
    /* JADX WARN: Code duplicated, block: B:146:0x0322  */
    /* JADX WARN: Code duplicated, block: B:149:0x0333  */
    /* JADX WARN: Code duplicated, block: B:152:0x0366  */
    /* JADX WARN: Code duplicated, block: B:155:0x0371  */
    /* JADX WARN: Code duplicated, block: B:157:0x0381  */
    /* JADX WARN: Code duplicated, block: B:163:0x039f  */
    /* JADX WARN: Code duplicated, block: B:166:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:168:0x03b9 A[LOOP:3: B:165:0x03a5->B:168:0x03b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:175:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:183:0x040e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0426  */
    /* JADX WARN: Code duplicated, block: B:189:0x0449  */
    /* JADX WARN: Code duplicated, block: B:191:0x0457  */
    /* JADX WARN: Code duplicated, block: B:199:0x048b  */
    /* JADX WARN: Code duplicated, block: B:201:0x0495  */
    /* JADX WARN: Code duplicated, block: B:203:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:207:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:210:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:212:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:214:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:217:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:218:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:221:0x0516  */
    /* JADX WARN: Code duplicated, block: B:224:0x051c  */
    /* JADX WARN: Code duplicated, block: B:226:0x0520  */
    /* JADX WARN: Code duplicated, block: B:227:0x0525  */
    /* JADX WARN: Code duplicated, block: B:229:0x0529  */
    /* JADX WARN: Code duplicated, block: B:232:0x0535  */
    /* JADX WARN: Code duplicated, block: B:235:0x053b  */
    /* JADX WARN: Code duplicated, block: B:237:0x0541  */
    /* JADX WARN: Code duplicated, block: B:238:0x0545  */
    /* JADX WARN: Code duplicated, block: B:240:0x054c  */
    /* JADX WARN: Code duplicated, block: B:243:0x0556  */
    /* JADX WARN: Code duplicated, block: B:248:0x0568  */
    /* JADX WARN: Code duplicated, block: B:250:0x0570  */
    /* JADX WARN: Code duplicated, block: B:253:0x0576  */
    /* JADX WARN: Code duplicated, block: B:254:0x057d  */
    /* JADX WARN: Code duplicated, block: B:258:0x058a  */
    /* JADX WARN: Code duplicated, block: B:261:0x0590  */
    /* JADX WARN: Code duplicated, block: B:263:0x0593  */
    /* JADX WARN: Code duplicated, block: B:266:0x05aa A[LOOP:7: B:262:0x0591->B:266:0x05aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:269:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:272:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:275:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:277:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:278:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:281:0x05db  */
    /* JADX WARN: Code duplicated, block: B:284:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:286:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:287:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:290:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:292:0x0600  */
    /* JADX WARN: Code duplicated, block: B:293:0x0604  */
    /* JADX WARN: Code duplicated, block: B:296:0x061c  */
    /* JADX WARN: Code duplicated, block: B:299:0x062f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:302:0x0635  */
    /* JADX WARN: Code duplicated, block: B:303:0x063a  */
    /* JADX WARN: Code duplicated, block: B:306:0x0654  */
    /* JADX WARN: Code duplicated, block: B:308:0x0667  */
    /* JADX WARN: Code duplicated, block: B:310:0x0671  */
    /* JADX WARN: Code duplicated, block: B:311:0x0678  */
    /* JADX WARN: Code duplicated, block: B:314:0x0689  */
    /* JADX WARN: Code duplicated, block: B:315:0x0691  */
    /* JADX WARN: Code duplicated, block: B:318:0x069c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:321:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:324:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:326:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:327:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:333:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:336:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:339:0x06dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:346:0x06e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:350:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:353:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:358:0x071a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:360:0x0724  */
    /* JADX WARN: Code duplicated, block: B:363:0x073a  */
    /* JADX WARN: Code duplicated, block: B:366:0x074c  */
    /* JADX WARN: Code duplicated, block: B:368:0x0756  */
    /* JADX WARN: Code duplicated, block: B:371:0x076c  */
    /* JADX WARN: Code duplicated, block: B:374:0x0783  */
    /* JADX WARN: Code duplicated, block: B:377:0x0799  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:381:0x07af  */
    /* JADX WARN: Code duplicated, block: B:382:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:384:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:387:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:392:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:393:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:396:0x0811  */
    /* JADX WARN: Code duplicated, block: B:398:0x0817  */
    /* JADX WARN: Code duplicated, block: B:407:0x0838  */
    /* JADX WARN: Code duplicated, block: B:409:0x083e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:417:0x0857  */
    /* JADX WARN: Code duplicated, block: B:419:0x085d  */
    /* JADX WARN: Code duplicated, block: B:421:0x0867  */
    /* JADX WARN: Code duplicated, block: B:423:0x0870  */
    /* JADX WARN: Code duplicated, block: B:426:0x0874  */
    /* JADX WARN: Code duplicated, block: B:429:0x088d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:437:0x08a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:440:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:443:0x08d8  */
    /* JADX WARN: Code duplicated, block: B:445:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:446:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:449:0x08ef  */
    /* JADX WARN: Code duplicated, block: B:452:0x08fd  */
    /* JADX WARN: Code duplicated, block: B:455:0x0906  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:460:0x092e  */
    /* JADX WARN: Code duplicated, block: B:462:0x0932  */
    /* JADX WARN: Code duplicated, block: B:464:0x0938  */
    /* JADX WARN: Code duplicated, block: B:465:0x093c  */
    /* JADX WARN: Code duplicated, block: B:467:0x094a  */
    /* JADX WARN: Code duplicated, block: B:469:0x094e  */
    /* JADX WARN: Code duplicated, block: B:471:0x095c  */
    /* JADX WARN: Code duplicated, block: B:474:0x0962  */
    /* JADX WARN: Code duplicated, block: B:479:0x096b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:482:0x097a  */
    /* JADX WARN: Code duplicated, block: B:484:0x098c  */
    /* JADX WARN: Code duplicated, block: B:486:0x09a2  */
    /* JADX WARN: Code duplicated, block: B:488:0x09b3  */
    /* JADX WARN: Code duplicated, block: B:492:0x09c2  */
    /* JADX WARN: Code duplicated, block: B:494:0x09c8  */
    /* JADX WARN: Code duplicated, block: B:495:0x09ca  */
    /* JADX WARN: Code duplicated, block: B:498:0x09ce  */
    /* JADX WARN: Code duplicated, block: B:501:0x09dd  */
    /* JADX WARN: Code duplicated, block: B:503:0x09ee  */
    /* JADX WARN: Code duplicated, block: B:506:0x0a05 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:509:0x0a15  */
    /* JADX WARN: Code duplicated, block: B:511:0x0a19  */
    /* JADX WARN: Code duplicated, block: B:513:0x0a27  */
    /* JADX WARN: Code duplicated, block: B:516:0x0a2c  */
    /* JADX WARN: Code duplicated, block: B:519:0x0a41  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    /* JADX WARN: Code duplicated, block: B:522:0x0a4b  */
    /* JADX WARN: Code duplicated, block: B:524:0x0a53  */
    /* JADX WARN: Code duplicated, block: B:526:0x0a5e  */
    /* JADX WARN: Code duplicated, block: B:527:0x0a61  */
    /* JADX WARN: Code duplicated, block: B:529:0x0a67  */
    /* JADX WARN: Code duplicated, block: B:532:0x0a6f  */
    /* JADX WARN: Code duplicated, block: B:534:0x0a78  */
    /* JADX WARN: Code duplicated, block: B:535:0x0a7b  */
    /* JADX WARN: Code duplicated, block: B:539:0x0a8a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:542:0x0a9a  */
    /* JADX WARN: Code duplicated, block: B:544:0x0a9e  */
    /* JADX WARN: Code duplicated, block: B:546:0x0aac  */
    /* JADX WARN: Code duplicated, block: B:549:0x0ab1  */
    /* JADX WARN: Code duplicated, block: B:54:0x011d  */
    /* JADX WARN: Code duplicated, block: B:552:0x0ac6  */
    /* JADX WARN: Code duplicated, block: B:555:0x0ad0  */
    /* JADX WARN: Code duplicated, block: B:557:0x0ad6  */
    /* JADX WARN: Code duplicated, block: B:560:0x0ae6  */
    /* JADX WARN: Code duplicated, block: B:563:0x0af6  */
    /* JADX WARN: Code duplicated, block: B:566:0x0b05  */
    /* JADX WARN: Code duplicated, block: B:567:0x0b09  */
    /* JADX WARN: Code duplicated, block: B:570:0x0b18  */
    /* JADX WARN: Code duplicated, block: B:572:0x0b22  */
    /* JADX WARN: Code duplicated, block: B:575:0x0b38  */
    /* JADX WARN: Code duplicated, block: B:578:0x0b4e  */
    /* JADX WARN: Code duplicated, block: B:57:0x012a  */
    /* JADX WARN: Code duplicated, block: B:581:0x0b62  */
    /* JADX WARN: Code duplicated, block: B:583:0x0b72  */
    /* JADX WARN: Code duplicated, block: B:585:0x0b88  */
    /* JADX WARN: Code duplicated, block: B:587:0x0b9d  */
    /* JADX WARN: Code duplicated, block: B:589:0x0ba8  */
    /* JADX WARN: Code duplicated, block: B:590:0x0bba  */
    /* JADX WARN: Code duplicated, block: B:594:0x0bd1  */
    /* JADX WARN: Code duplicated, block: B:597:0x0bd8  */
    /* JADX WARN: Code duplicated, block: B:599:0x0be2  */
    /* JADX WARN: Code duplicated, block: B:600:0x0be9  */
    /* JADX WARN: Code duplicated, block: B:602:0x0bec  */
    /* JADX WARN: Code duplicated, block: B:604:0x0bf8  */
    /* JADX WARN: Code duplicated, block: B:607:0x0c08  */
    /* JADX WARN: Code duplicated, block: B:609:0x0c13  */
    /* JADX WARN: Code duplicated, block: B:60:0x0130  */
    /* JADX WARN: Code duplicated, block: B:612:0x0c2a  */
    /* JADX WARN: Code duplicated, block: B:613:0x0c2e  */
    /* JADX WARN: Code duplicated, block: B:616:0x0c3b  */
    /* JADX WARN: Code duplicated, block: B:618:0x0c45  */
    /* JADX WARN: Code duplicated, block: B:619:0x0c4b  */
    /* JADX WARN: Code duplicated, block: B:621:0x0c58  */
    /* JADX WARN: Code duplicated, block: B:624:0x0c65  */
    /* JADX WARN: Code duplicated, block: B:629:0x0c81  */
    /* JADX WARN: Code duplicated, block: B:62:0x0138  */
    /* JADX WARN: Code duplicated, block: B:639:0x0c96  */
    /* JADX WARN: Code duplicated, block: B:641:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x033f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x03cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0148  */
    /* JADX WARN: Code duplicated, block: B:660:0x0430 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:0x05af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:0x059f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:0x0853 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:0x084e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:0x09b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:0x09b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0151  */
    /* JADX WARN: Code duplicated, block: B:69:0x0160  */
    /* JADX WARN: Code duplicated, block: B:71:0x0163  */
    /* JADX WARN: Code duplicated, block: B:72:0x0172  */
    /* JADX WARN: Code duplicated, block: B:78:0x0183  */
    /* JADX WARN: Code duplicated, block: B:79:0x0187  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ef  */
    /* JADX WARN: Instruction removed from duplicated block: B:639:0x0c96, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [o.ea2] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v51, types: [java.util.ArrayList] */
    @Override // o.df6
    public final g4 k(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain;
        g4 g4Var;
        int i2;
        fp6 fp6VarL;
        Integer numValueOf;
        int iIntValue;
        iw4 iw4Var;
        n77 n77Var;
        Resources resources;
        ap6 ap6Var;
        jx4 jx4Var;
        Object objG;
        pe6 pe6Var;
        AccessibilityManager accessibilityManager;
        n77 n77Var2;
        boolean zI;
        List listI;
        int size;
        boolean z;
        int i3;
        int i4;
        AccessibilityNodeInfo accessibilityNodeInfo;
        xo xoVarF0;
        ap6 ap6Var2;
        pe6 pe6Var2;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        jx4 jx4Var2;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        g4 g4Var2;
        fp6 fp6Var;
        SpannableString spannableString;
        g4 g4Var3;
        np6 np6Var;
        jx4 jx4Var3;
        AccessibilityNodeInfo accessibilityNodeInfo4;
        AccessibilityNodeInfo accessibilityNodeInfo5;
        String strE0;
        Object objG2;
        xv7 xv7Var;
        Object objG3;
        Boolean bool;
        pe6 pe6Var3;
        int i5;
        ap6 ap6Var3;
        Object objG4;
        List list;
        String str;
        Object objG5;
        String str2;
        Object objG6;
        Object objG7;
        int i6;
        Object objG8;
        Boolean bool2;
        Object objG9;
        Integer num;
        int iIntValue2;
        np6 np6Var2;
        bh bhVar;
        boolean z2;
        fp6 fp6VarL2;
        Object objG10;
        qc4 qc4Var;
        m3 m3Var;
        m3 m3Var2;
        m3 m3Var3;
        String strT;
        ArrayList arrayList;
        CharSequence charSequenceG;
        pt5 pt5Var;
        float f;
        Object objG11;
        float f2;
        rj6 rj6Var;
        rj6 rj6Var2;
        int i7;
        CharSequence charSequence;
        boolean zH0;
        int iD;
        Bundle bundle;
        AndroidComposeView androidComposeView;
        int iD2;
        String str3;
        g4 g4Var4;
        xl xlVarN;
        xl xlVarN2;
        m3 m3Var4;
        m3 m3Var5;
        m3 m3Var6;
        np6 np6Var3;
        List list2;
        int size2;
        jw4 jw4Var;
        int i8;
        n77 n77Var3;
        vw4 vw4Var;
        int[] iArr;
        int i9;
        int[] iArrCopyOf;
        int i10;
        int i11;
        ArrayList arrayList2;
        int i12;
        Object objG12;
        Object objG13;
        Object objG14;
        boolean z3;
        j04 j04Var;
        LayoutNode layoutNode;
        a4 a4Var;
        a4 a4Var2;
        Object objG15;
        fp6 fp6VarL3;
        Object objG16;
        Object objG17;
        iv0 iv0Var;
        ArrayList arrayList3;
        List listI2;
        int size3;
        int i13;
        int i14;
        boolean zI2;
        int i15;
        Object objG18;
        fp6 fp6Var2;
        m3 m3Var7;
        np6 np6Var4;
        m3 m3Var8;
        String str4;
        List list3;
        LayoutNode layoutNodeF;
        ap6 ap6VarH;
        boolean zN;
        Object objG19;
        ap6 ap6VarH2;
        m3 m3Var9;
        m3 m3Var10;
        m3 m3Var11;
        m3 m3Var12;
        ClipDescription primaryClipDescription;
        boolean zHasMimeType;
        boolean z4;
        boolean z5;
        boolean z6;
        int i16;
        int iD3;
        fp6 fp6VarL4;
        boolean zBooleanValue;
        ap6 ap6Var4;
        np6 np6Var5;
        boolean zBooleanValue2;
        Object objG20;
        in1 density;
        y58 y58Var;
        SpannableString spannableString2;
        List list4;
        ArrayList arrayList4;
        SpannableString spannableString3;
        ?? arrayList5;
        ?? arrayList6;
        int size4;
        int i17;
        int size5;
        int i18;
        List listA;
        int size6;
        int i19;
        wo woVar;
        int i20;
        Object obj;
        int i21;
        ga4 ga4Var;
        WeakHashMap weakHashMap;
        Object kz0Var;
        z98 z98Var;
        WeakHashMap weakHashMap2;
        Object uRLSpan;
        int size7;
        int i22;
        wo woVar2;
        sc8 sc8Var;
        int i23;
        int i24;
        int size8;
        int i25;
        wo woVar3;
        int size9;
        int i26;
        int i27;
        int i28;
        long jB;
        ms2 ms2Var;
        ks2 ks2Var;
        cs7 cs7Var;
        long j;
        vp7 vp7Var;
        bs7 bs7Var;
        long jB2;
        bs7 gw0Var;
        SpannableString spannableString4;
        ms2 ms2Var2;
        int i29;
        int i30;
        int i31;
        fp6 fp6Var3;
        tk3 tk3VarS;
        int i32;
        xl xlVar;
        hp6 hp6Var;
        boolean zN2;
        fp6 fp6Var4;
        byte b;
        byte b2;
        String strU;
        Object parentForAccessibility;
        View view;
        byte b3 = this.t;
        p3 p3Var = this.u;
        switch (b3) {
            case 0:
                bh bhVar2 = (bh) p3Var;
                AccessibilityManager accessibilityManager2 = bhVar2.s;
                AndroidComposeView androidComposeView2 = bhVar2.p;
                if (androidComposeView2.getComposeViewContext().d().getR().i == m84.m) {
                    if (accessibilityManager2.isEnabled()) {
                        g4Var4 = null;
                    } else {
                        g4Var4 = new g4(AccessibilityNodeInfo.obtain());
                    }
                    bhVar = bhVar2;
                    i6 = i;
                } else {
                    hp6 hp6Var2 = (hp6) bhVar2.s().b(i);
                    if (hp6Var2 == null) {
                        if (accessibilityManager2.isEnabled()) {
                            g4Var4 = null;
                        } else {
                            g4Var4 = new g4(AccessibilityNodeInfo.obtain());
                        }
                        bhVar = bhVar2;
                        i6 = i;
                    } else {
                        fp6 fp6Var5 = hp6Var2.a;
                        ap6 ap6VarK = fp6Var5.k();
                        LayoutNode layoutNode2 = fp6Var5.c;
                        Object objG21 = ap6VarK.m.g(kp6.f1291o);
                        if (objG21 == null) {
                            objG21 = null;
                        }
                        boolean zN3 = im3.n(objG21, Boolean.TRUE);
                        if (!zN3) {
                            accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                            g4Var = new g4(accessibilityNodeInfoObtain);
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 34) {
                                q3.k(accessibilityNodeInfoObtain, zN3);
                            } else {
                                g4Var.h(64, zN3);
                            }
                            if (i == -1) {
                                parentForAccessibility = androidComposeView2.getParentForAccessibility();
                                if (parentForAccessibility instanceof View) {
                                    view = (View) parentForAccessibility;
                                } else {
                                    view = null;
                                }
                                g4Var.b = -1;
                                accessibilityNodeInfoObtain.setParent(view);
                            } else {
                                fp6VarL = fp6Var5.l();
                                if (fp6VarL != null) {
                                    numValueOf = Integer.valueOf(fp6VarL.f);
                                } else {
                                    numValueOf = null;
                                }
                                if (numValueOf != null) {
                                    ki3.d("semanticsNode " + i + " has null parent");
                                    hk0.b();
                                    return null;
                                }
                                iIntValue = numValueOf.intValue();
                                if (iIntValue == androidComposeView2.getSemanticsOwner().a().f) {
                                    iIntValue = -1;
                                }
                                g4Var.b = iIntValue;
                                accessibilityNodeInfoObtain.setParent(androidComposeView2, iIntValue);
                            }
                            g4Var.c = i;
                            accessibilityNodeInfoObtain.setSource(androidComposeView2, i);
                            accessibilityNodeInfoObtain.setBoundsInScreen(bhVar2.k(hp6Var2));
                            iw4Var = bhVar2.V;
                            n77Var = bhVar2.E;
                            resources = androidComposeView2.getContext().getResources();
                            g4Var.i("android.view.View");
                            ap6Var = fp6Var5.d;
                            jx4Var = ap6Var.m;
                            if (jx4Var.c(kp6.G)) {
                                g4Var.i("android.widget.EditText");
                            }
                            if (jx4Var.c(kp6.C)) {
                                g4Var.i("android.widget.TextView");
                            }
                            objG = jx4Var.g(kp6.z);
                            if (objG == null) {
                                objG = null;
                            }
                            pe6Var = (pe6) objG;
                            if (pe6Var != null) {
                                b = pe6Var.a;
                                if (fp6Var5.n()) {
                                    accessibilityManager = accessibilityManager2;
                                    b2 = 4;
                                    n77Var2 = n77Var;
                                    if (fp6Var5.i((4 & 1) != 0 ? !fp6Var5.b : false, (4 & 2) == 0).isEmpty()) {
                                    }
                                } else {
                                    accessibilityManager = accessibilityManager2;
                                    b2 = 4;
                                    n77Var2 = n77Var;
                                }
                                if (b == b2) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                                } else if (b == 2) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                                } else {
                                    strU = bt1.U(b);
                                    if (b == 5 || vn4.i0(fp6Var5) || ap6Var.f346o) {
                                        g4Var.i(strU);
                                    }
                                }
                            } else {
                                accessibilityManager = accessibilityManager2;
                                n77Var2 = n77Var;
                            }
                            accessibilityNodeInfoObtain.setPackageName(androidComposeView2.getContext().getPackageName());
                            accessibilityNodeInfoObtain.setImportantForAccessibility(db8.R(fp6Var5));
                            if (i2 >= 34) {
                                zI = q3.i(accessibilityManager);
                            } else {
                                zI = true;
                            }
                            listI = fp6Var5.i((4 & 1) != 0 ? !fp6Var5.b : false, (4 & 2) == 0);
                            size = listI.size();
                            z = zI;
                            i3 = 0;
                            i4 = 0;
                            while (true) {
                                accessibilityNodeInfo = g4Var.a;
                                if (i4 < size) {
                                    int i33 = size;
                                    fp6Var3 = (fp6) listI.get(i4);
                                    List list5 = listI;
                                    tk3VarS = bhVar2.s();
                                    int i34 = i4;
                                    i32 = fp6Var3.f;
                                    if (tk3VarS.a(i32)) {
                                        xlVar = androidComposeView2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(fp6Var3.c);
                                        if (i32 != -1) {
                                            if (xlVar != null) {
                                                accessibilityNodeInfoObtain.addChild(xlVar);
                                            } else {
                                                hp6Var = (hp6) bhVar2.s().b(i32);
                                                if (hp6Var != null || (fp6Var4 = hp6Var.a) == null) {
                                                    zN2 = false;
                                                } else {
                                                    Object objG22 = fp6Var4.k().m.g(kp6.f1291o);
                                                    if (objG22 == null) {
                                                        objG22 = null;
                                                    }
                                                    zN2 = im3.n(objG22, Boolean.TRUE);
                                                }
                                                if (z || !zN2) {
                                                    accessibilityNodeInfo.addChild(androidComposeView2, i32);
                                                }
                                            }
                                            iw4Var.f(i32, i3);
                                            i3++;
                                        }
                                    }
                                    i4 = i34 + 1;
                                    listI = list5;
                                    size = i33;
                                } else {
                                    if (i == bhVar2.w) {
                                        accessibilityNodeInfo.setAccessibilityFocused(true);
                                        g4Var.b(a4.g);
                                    } else {
                                        accessibilityNodeInfo.setAccessibilityFocused(false);
                                        g4Var.b(a4.f);
                                    }
                                    xoVarF0 = vn4.f0(fp6Var5);
                                    if (xoVarF0 != null) {
                                        androidComposeView2.getFontFamilyResolver();
                                        density = androidComposeView2.getDensity();
                                        y58Var = bhVar2.R;
                                        String str5 = xoVarF0.n;
                                        list4 = xoVarF0.m;
                                        spannableString2 = new SpannableString(str5);
                                        arrayList4 = xoVarF0.f2540o;
                                        if (arrayList4 != null) {
                                            size9 = arrayList4.size();
                                            i26 = 0;
                                            while (i26 < size9) {
                                                int i35 = size9;
                                                wo woVar4 = (wo) arrayList4.get(i26);
                                                int i36 = i26;
                                                c77 c77Var = (c77) woVar4.a;
                                                ArrayList arrayList7 = arrayList4;
                                                i27 = woVar4.b;
                                                i28 = woVar4.c;
                                                ap6 ap6Var5 = ap6Var;
                                                pe6 pe6Var4 = pe6Var;
                                                jB = c77Var.a.b();
                                                AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfo;
                                                jx4 jx4Var4 = jx4Var;
                                                long j2 = c77Var.b;
                                                ms2Var = c77Var.c;
                                                ks2Var = c77Var.d;
                                                cs7Var = c77Var.j;
                                                kd4 kd4Var = c77Var.k;
                                                AccessibilityNodeInfo accessibilityNodeInfo7 = accessibilityNodeInfoObtain;
                                                g4 g4Var5 = g4Var;
                                                j = c77Var.l;
                                                vp7Var = c77Var.m;
                                                bs7Var = c77Var.a;
                                                fp6 fp6Var6 = fp6Var5;
                                                jB2 = bs7Var.b();
                                                int i37 = rv0.i;
                                                if (z68.a(jB, jB2)) {
                                                    gw0Var = bs7Var;
                                                } else if (jB != 16) {
                                                    gw0Var = new gw0(jB);
                                                } else {
                                                    gw0Var = as7.a;
                                                }
                                                g77.o(spannableString2, gw0Var.b(), i27, i28);
                                                spannableString4 = spannableString2;
                                                g77.p(spannableString4, j2, density, i27, i28);
                                                if (ms2Var == null || ks2Var != null) {
                                                    if (ms2Var == null) {
                                                        ms2Var2 = ms2.f1503o;
                                                    } else {
                                                        ms2Var2 = ms2Var;
                                                    }
                                                    if (ks2Var != null) {
                                                        i29 = ks2Var.a;
                                                    } else {
                                                        i29 = 0;
                                                    }
                                                    StyleSpan styleSpan = new StyleSpan(pm8.t(ms2Var2, i29));
                                                    i30 = 33;
                                                    spannableString4.setSpan(styleSpan, i27, i28, 33);
                                                } else {
                                                    i30 = 33;
                                                }
                                                if (vp7Var != null) {
                                                    i31 = vp7Var.a;
                                                    if ((i31 | 1) == i31) {
                                                        spannableString4.setSpan(new UnderlineSpan(), i27, i28, i30);
                                                    }
                                                    if ((i31 | 2) == i31) {
                                                        spannableString4.setSpan(new StrikethroughSpan(), i27, i28, i30);
                                                    }
                                                }
                                                if (cs7Var != null) {
                                                    spannableString4.setSpan(new ScaleXSpan(cs7Var.a), i27, i28, i30);
                                                }
                                                g77.q(spannableString4, kd4Var, i27, i28);
                                                if (j != 16) {
                                                    spannableString4.setSpan(new BackgroundColorSpan(j51.U(j)), i27, i28, i30);
                                                }
                                                i26 = i36 + 1;
                                                spannableString2 = spannableString4;
                                                fp6Var5 = fp6Var6;
                                                size9 = i35;
                                                arrayList4 = arrayList7;
                                                ap6Var = ap6Var5;
                                                pe6Var = pe6Var4;
                                                accessibilityNodeInfo = accessibilityNodeInfo6;
                                                jx4Var = jx4Var4;
                                                accessibilityNodeInfoObtain = accessibilityNodeInfo7;
                                                g4Var = g4Var5;
                                            }
                                        }
                                        ap6Var2 = ap6Var;
                                        pe6Var2 = pe6Var;
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        jx4Var2 = jx4Var;
                                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                                        g4Var2 = g4Var;
                                        spannableString3 = spannableString2;
                                        fp6Var = fp6Var5;
                                        int length = str5.length();
                                        arrayList5 = ea2.m;
                                        if (list4 != null) {
                                            arrayList6 = new ArrayList(list4.size());
                                            size8 = list4.size();
                                            while (i25 < size8) {
                                                Object obj2 = list4.get(i25);
                                                woVar3 = (wo) obj2;
                                                if (!(woVar3.a instanceof sc8) && yo.b(0, length, woVar3.b, woVar3.c)) {
                                                    arrayList6.add(obj2);
                                                }
                                            }
                                        } else {
                                            arrayList6 = arrayList5;
                                        }
                                        size4 = arrayList6.size();
                                        while (i17 < size4) {
                                            wo woVar5 = (wo) arrayList6.get(i17);
                                            sc8Var = (sc8) woVar5.a;
                                            i23 = woVar5.b;
                                            i24 = woVar5.c;
                                            if (sc8Var instanceof sc8) {
                                                gk0.s();
                                                return null;
                                            }
                                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(sc8Var.a).build(), i23, i24, 33);
                                        }
                                        int length2 = str5.length();
                                        if (list4 != null) {
                                            arrayList5 = new ArrayList(list4.size());
                                            size7 = list4.size();
                                            while (i22 < size7) {
                                                Object obj3 = list4.get(i22);
                                                woVar2 = (wo) obj3;
                                                if (!(woVar2.a instanceof z98) && yo.b(0, length2, woVar2.b, woVar2.c)) {
                                                    arrayList5.add(obj3);
                                                }
                                            }
                                        }
                                        size5 = arrayList5.size();
                                        while (i18 < size5) {
                                            wo woVar6 = (wo) arrayList5.get(i18);
                                            z98Var = (z98) woVar6.a;
                                            int i38 = woVar6.b;
                                            int i39 = woVar6.c;
                                            weakHashMap2 = (WeakHashMap) y58Var.n;
                                            uRLSpan = weakHashMap2.get(z98Var);
                                            if (uRLSpan == null) {
                                                uRLSpan = new URLSpan(z98Var.a);
                                                weakHashMap2.put(z98Var, uRLSpan);
                                            }
                                            spannableString3.setSpan((URLSpan) uRLSpan, i38, i39, 33);
                                        }
                                        listA = xoVarF0.a(str5.length());
                                        size6 = listA.size();
                                        while (i19 < size6) {
                                            woVar = (wo) listA.get(i19);
                                            i20 = woVar.b;
                                            obj = woVar.a;
                                            i21 = woVar.c;
                                            if (i20 != i21) {
                                                ga4Var = (ga4) obj;
                                                if ((ga4Var instanceof fa4) || ((fa4) ga4Var).c != null) {
                                                    weakHashMap = (WeakHashMap) y58Var.p;
                                                    kz0Var = weakHashMap.get(woVar);
                                                    if (kz0Var == null) {
                                                        kz0Var = new kz0(ga4Var);
                                                        weakHashMap.put(woVar, kz0Var);
                                                    }
                                                    spannableString3.setSpan((ClickableSpan) kz0Var, i20, i21, 33);
                                                } else {
                                                    obj.getClass();
                                                    fa4 fa4Var = (fa4) obj;
                                                    wo woVar7 = new wo(i20, i21, fa4Var);
                                                    WeakHashMap weakHashMap3 = (WeakHashMap) y58Var.f2579o;
                                                    Object uRLSpan2 = weakHashMap3.get(woVar7);
                                                    if (uRLSpan2 == null) {
                                                        uRLSpan2 = new URLSpan(fa4Var.a);
                                                        weakHashMap3.put(woVar7, uRLSpan2);
                                                    }
                                                    spannableString3.setSpan((URLSpan) uRLSpan2, i20, i21, 33);
                                                }
                                            }
                                        }
                                        spannableString = (SpannableString) bh.P(spannableString3);
                                    } else {
                                        iw4Var = iw4Var;
                                        ap6Var2 = ap6Var;
                                        pe6Var2 = pe6Var;
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        jx4Var2 = jx4Var;
                                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                                        g4Var2 = g4Var;
                                        fp6Var = fp6Var5;
                                        spannableString = null;
                                    }
                                    g4Var3 = g4Var2;
                                    g4Var3.k(spannableString);
                                    np6Var = kp6.O;
                                    jx4Var3 = jx4Var2;
                                    if (jx4Var3.c(np6Var)) {
                                        accessibilityNodeInfo5 = accessibilityNodeInfo3;
                                        accessibilityNodeInfo5.setContentInvalid(true);
                                        objG20 = jx4Var3.g(np6Var);
                                        if (objG20 == null) {
                                            objG20 = null;
                                        }
                                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                                        accessibilityNodeInfo4.setError((CharSequence) objG20);
                                    } else {
                                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                                        accessibilityNodeInfo5 = accessibilityNodeInfo3;
                                    }
                                    strE0 = vn4.e0(fp6Var, resources);
                                    if (Build.VERSION.SDK_INT >= 30) {
                                        b4.m(accessibilityNodeInfo4, strE0);
                                    } else {
                                        accessibilityNodeInfo4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strE0);
                                    }
                                    accessibilityNodeInfo4.setCheckable(vn4.d0(fp6Var));
                                    objG2 = jx4Var3.g(kp6.L);
                                    if (objG2 == null) {
                                        objG2 = null;
                                    }
                                    xv7Var = (xv7) objG2;
                                    if (xv7Var != null) {
                                        if (xv7Var == xv7.m) {
                                            accessibilityNodeInfo4.setChecked(true);
                                        } else if (xv7Var == xv7.n) {
                                            accessibilityNodeInfo4.setChecked(false);
                                        }
                                    }
                                    objG3 = jx4Var3.g(kp6.K);
                                    if (objG3 == null) {
                                        objG3 = null;
                                    }
                                    bool = (Boolean) objG3;
                                    if (bool != null) {
                                        zBooleanValue2 = bool.booleanValue();
                                        if (pe6Var2 == null) {
                                            pe6Var3 = pe6Var2;
                                            i5 = 4;
                                        } else {
                                            pe6Var3 = pe6Var2;
                                            i5 = 4;
                                            if (pe6Var3.a == 4) {
                                                accessibilityNodeInfo5.setSelected(zBooleanValue2);
                                            }
                                        }
                                        accessibilityNodeInfo4.setChecked(zBooleanValue2);
                                    } else {
                                        pe6Var3 = pe6Var2;
                                        i5 = 4;
                                    }
                                    ap6Var3 = ap6Var2;
                                    if (ap6Var3.f346o || fp6Var.i((4 & 1) != 0 ? !fp6Var.b : false, (4 & 2) == 0).isEmpty()) {
                                        objG4 = jx4Var3.g(kp6.a);
                                        if (objG4 == null) {
                                            objG4 = null;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            str = (String) lv0.o0(list);
                                        } else {
                                            str = null;
                                        }
                                        accessibilityNodeInfo4.setContentDescription(str);
                                    }
                                    objG5 = jx4Var3.g(kp6.A);
                                    if (objG5 == null) {
                                        objG5 = null;
                                    }
                                    str2 = (String) objG5;
                                    if (str2 != null) {
                                        fp6VarL4 = fp6Var;
                                        while (true) {
                                            if (fp6VarL4 != null) {
                                                ap6Var4 = fp6VarL4.d;
                                                np6Var5 = pm8.s;
                                                if (ap6Var4.m.c(np6Var5)) {
                                                    zBooleanValue = ((Boolean) ap6Var4.b(np6Var5)).booleanValue();
                                                } else {
                                                    fp6VarL4 = fp6VarL4.l();
                                                }
                                            } else {
                                                zBooleanValue = false;
                                            }
                                        }
                                        if (zBooleanValue) {
                                            accessibilityNodeInfo5.setViewIdResourceName(str2);
                                        }
                                    }
                                    objG6 = jx4Var3.g(kp6.h);
                                    if (objG6 == null) {
                                        objG6 = null;
                                    }
                                    if (((f88) objG6) != null) {
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            accessibilityNodeInfo4.setHeading(true);
                                        } else {
                                            g4Var3.h(2, true);
                                        }
                                    }
                                    objG7 = jx4Var3.g(kp6.i);
                                    if (objG7 == null) {
                                        objG7 = null;
                                    }
                                    if (((f88) objG7) != null) {
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            accessibilityNodeInfo5.setTextEntryKey(true);
                                        } else {
                                            g4Var3.h(8, true);
                                        }
                                    }
                                    i6 = i;
                                    if (i6 != -1) {
                                        iD3 = iw4Var.d(fp6Var.f);
                                        if (iD3 != -1) {
                                            accessibilityNodeInfo5.setDrawingOrder(iD3);
                                        } else {
                                            io.sentry.android.core.v0.j("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                                        }
                                    }
                                    accessibilityNodeInfo5.setPassword(jx4Var3.c(kp6.N));
                                    objG8 = jx4Var3.g(kp6.Q);
                                    if (objG8 == null) {
                                        objG8 = null;
                                    }
                                    bool2 = Boolean.TRUE;
                                    accessibilityNodeInfo5.setEditable(im3.n(objG8, bool2));
                                    objG9 = jx4Var3.g(kp6.R);
                                    if (objG9 == null) {
                                        objG9 = null;
                                    }
                                    num = (Integer) objG9;
                                    if (num != null) {
                                        iIntValue2 = num.intValue();
                                    } else {
                                        iIntValue2 = -1;
                                    }
                                    accessibilityNodeInfo4.setMaxTextLength(iIntValue2);
                                    accessibilityNodeInfo4.setEnabled(vn4.c0(fp6Var));
                                    np6Var2 = kp6.l;
                                    accessibilityNodeInfo4.setFocusable(jx4Var3.c(np6Var2));
                                    if (accessibilityNodeInfo5.isFocusable()) {
                                        accessibilityNodeInfo4.setFocused(((Boolean) ap6Var3.b(np6Var2)).booleanValue());
                                        if (accessibilityNodeInfo5.isFocused()) {
                                            g4Var3.a(2);
                                            bhVar = bhVar2;
                                            bhVar.x = i6;
                                        } else {
                                            bhVar = bhVar2;
                                            z2 = true;
                                            g4Var3.a(1);
                                        }
                                        accessibilityNodeInfo4.setVisibleToUser(db8.Q(fp6Var) ^ z2);
                                        if (fp6Var.n()) {
                                            fp6VarL2 = fp6Var.l();
                                            fp6VarL2.getClass();
                                        } else {
                                            fp6VarL2 = fp6Var;
                                        }
                                        if (fp6VarL2.m().f()) {
                                            accessibilityNodeInfo4.setVisibleToUser(false);
                                        }
                                        objG10 = jx4Var3.g(kp6.k);
                                        if (objG10 == null) {
                                            objG10 = null;
                                        }
                                        qc4Var = (qc4) objG10;
                                        if (qc4Var != null) {
                                            z6 = qc4Var.a;
                                            if (z6 && z6) {
                                                i16 = 2;
                                            } else {
                                                i16 = 1;
                                            }
                                            accessibilityNodeInfo5.setLiveRegion(i16);
                                        }
                                        accessibilityNodeInfo4.setClickable(false);
                                        m3Var = (m3) qs1.P(ap6Var3, zo6.b);
                                        if (m3Var != null) {
                                            boolean zN4 = im3.n(qs1.P(ap6Var3, kp6.K), bool2);
                                            z4 = (pe6Var3 == null && pe6Var3.a == 4) || (pe6Var3 != null && pe6Var3.a == 3);
                                            if (z4 || (z4 && !zN4)) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            accessibilityNodeInfo4.setClickable(z5);
                                            if (vn4.c0(fp6Var) && accessibilityNodeInfo5.isClickable()) {
                                                g4Var3.b(new a4(16, m3Var.a));
                                            }
                                        }
                                        accessibilityNodeInfo4.setLongClickable(false);
                                        m3Var2 = (m3) qs1.P(ap6Var3, zo6.c);
                                        if (m3Var2 != null) {
                                            accessibilityNodeInfo4.setLongClickable(true);
                                            if (vn4.c0(fp6Var)) {
                                                g4Var3.b(new a4(32, m3Var2.a));
                                            }
                                        }
                                        m3Var3 = (m3) qs1.P(ap6Var3, zo6.q);
                                        if (m3Var3 != null) {
                                            g4Var3.b(new a4(16384, m3Var3.a));
                                        }
                                        if (vn4.c0(fp6Var)) {
                                            m3Var9 = (m3) qs1.P(ap6Var3, zo6.k);
                                            if (m3Var9 != null) {
                                                g4Var3.b(new a4(2097152, m3Var9.a));
                                            }
                                            m3Var10 = (m3) qs1.P(ap6Var3, zo6.p);
                                            if (m3Var10 != null) {
                                                g4Var3.b(new a4(android.R.id.accessibilityActionImeEnter, m3Var10.a));
                                            }
                                            m3Var11 = (m3) qs1.P(ap6Var3, zo6.r);
                                            if (m3Var11 != null) {
                                                g4Var3.b(new a4(65536, m3Var11.a));
                                            }
                                            m3Var12 = (m3) qs1.P(ap6Var3, zo6.s);
                                            if (m3Var12 != null && accessibilityNodeInfo5.isFocused()) {
                                                primaryClipDescription = ((cj3) androidComposeView2.getClipboardManager()).F().getPrimaryClipDescription();
                                                if (primaryClipDescription != null) {
                                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                } else {
                                                    zHasMimeType = false;
                                                }
                                                if (zHasMimeType) {
                                                    g4Var3.b(new a4(32768, m3Var12.a));
                                                }
                                            }
                                        }
                                        strT = bh.t(fp6Var);
                                        if (strT != null && strT.length() != 0) {
                                            accessibilityNodeInfo5.setTextSelection(bhVar.r(fp6Var), bhVar.q(fp6Var));
                                            m3Var8 = (m3) qs1.P(ap6Var3, zo6.j);
                                            if (m3Var8 != null) {
                                                str4 = m3Var8.a;
                                            } else {
                                                str4 = null;
                                            }
                                            g4Var3.b(new a4(131072, str4));
                                            g4Var3.a(256);
                                            g4Var3.a(512);
                                            accessibilityNodeInfo4.setMovementGranularities(11);
                                            list3 = (List) qs1.P(ap6Var3, kp6.a);
                                            if ((list3 != null || list3.isEmpty()) && jx4Var3.c(zo6.a) && (!jx4Var3.c(kp6.G) || im3.n(qs1.P(ap6Var3, np6Var2), bool2))) {
                                                layoutNodeF = layoutNode2.F();
                                                while (true) {
                                                    if (layoutNodeF == null) {
                                                        layoutNodeF = null;
                                                    } else {
                                                        ap6VarH2 = layoutNodeF.H();
                                                        if (ap6VarH2 == null && ap6VarH2.f346o) {
                                                            if (ap6VarH2.m.c(kp6.G)) {
                                                            }
                                                        }
                                                        layoutNodeF = layoutNodeF.F();
                                                    }
                                                }
                                                if (layoutNodeF == null) {
                                                    accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                                } else {
                                                    ap6VarH = layoutNodeF.H();
                                                    if (ap6VarH != null) {
                                                        objG19 = ap6VarH.m.g(kp6.l);
                                                        if (objG19 == null) {
                                                            objG19 = null;
                                                        }
                                                        zN = im3.n(objG19, Boolean.TRUE);
                                                    } else {
                                                        zN = false;
                                                    }
                                                    if (zN) {
                                                        accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                                    }
                                                }
                                            }
                                        }
                                        arrayList = new ArrayList();
                                        arrayList.add("androidx.compose.ui.semantics.id");
                                        charSequenceG = g4Var3.g();
                                        if (charSequenceG != null && charSequenceG.length() != 0 && jx4Var3.c(zo6.a)) {
                                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                        }
                                        if (jx4Var3.c(kp6.A)) {
                                            arrayList.add("androidx.compose.ui.semantics.testTag");
                                        }
                                        if (jx4Var3.c(kp6.S)) {
                                            arrayList.add("androidx.compose.ui.semantics.shapeType");
                                            arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                                        }
                                        accessibilityNodeInfo5.setAvailableExtraData(arrayList);
                                        pt5Var = (pt5) qs1.P(ap6Var3, kp6.c);
                                        f = 0.0f;
                                        if (pt5Var != null) {
                                            np6Var4 = zo6.i;
                                            if (jx4Var3.c(np6Var4)) {
                                                g4Var3.i("android.widget.SeekBar");
                                            } else {
                                                g4Var3.i("android.widget.ProgressBar");
                                            }
                                            if (pt5Var != pt5.b) {
                                                accessibilityNodeInfo5.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                                            }
                                            if (jx4Var3.c(np6Var4)) {
                                                vn4.c0(fp6Var);
                                            }
                                        }
                                        if (vn4.c0(fp6Var) && (m3Var7 = (m3) qs1.P(ap6Var3, zo6.i)) != null) {
                                            g4Var3.b(new a4(android.R.id.accessibilityActionSetProgress, m3Var7.a));
                                        }
                                        ga0.w(g4Var3, fp6Var);
                                        objG11 = fp6Var.k().m.g(kp6.g);
                                        if (objG11 == null) {
                                            objG11 = null;
                                        }
                                        if (objG11 == null) {
                                            fp6VarL3 = fp6Var.l();
                                            if (fp6VarL3 == null) {
                                                f2 = 0.0f;
                                            } else {
                                                objG16 = fp6VarL3.k().m.g(kp6.e);
                                                if (objG16 == null) {
                                                    objG16 = null;
                                                }
                                                if (objG16 != null) {
                                                    objG17 = fp6VarL3.k().m.g(kp6.f);
                                                    if (objG17 == null) {
                                                        objG17 = null;
                                                    }
                                                    iv0Var = (iv0) objG17;
                                                    if (iv0Var == null && (iv0Var.a < 0 || iv0Var.b < 0)) {
                                                        f2 = 0.0f;
                                                    } else if (fp6Var.k().m.c(kp6.K)) {
                                                        f2 = 0.0f;
                                                    } else {
                                                        arrayList3 = new ArrayList();
                                                        listI2 = fp6VarL3.i((4 & 1) != 0 ? !fp6VarL3.b : false, (4 & 2) == 0);
                                                        size3 = listI2.size();
                                                        i13 = 0;
                                                        i14 = 0;
                                                        while (i13 < size3) {
                                                            fp6Var2 = (fp6) listI2.get(i13);
                                                            float f3 = f;
                                                            if (fp6Var2.k().m.c(kp6.K)) {
                                                                arrayList3.add(fp6Var2);
                                                                if (fp6Var2.c.G() < fp6Var.c.G()) {
                                                                    i14++;
                                                                }
                                                            }
                                                            i13++;
                                                            f = f3;
                                                        }
                                                        f2 = f;
                                                        if (!arrayList3.isEmpty()) {
                                                            zI2 = ga0.i(arrayList3);
                                                            if (zI2) {
                                                                i15 = 0;
                                                            } else {
                                                                i15 = i14;
                                                            }
                                                            if (!zI2) {
                                                                i14 = 0;
                                                            }
                                                            objG18 = fp6Var.k().m.g(kp6.K);
                                                            if (objG18 == null) {
                                                                objG18 = Boolean.FALSE;
                                                            }
                                                            g4Var3.j(f4.c(((Boolean) objG18).booleanValue(), i15, 1, i14, 1));
                                                        }
                                                    }
                                                } else {
                                                    f2 = 0.0f;
                                                }
                                            }
                                        } else {
                                            f2 = 0.0f;
                                            io.sentry.h2.f();
                                        }
                                        rj6Var = (rj6) qs1.P(ap6Var3, kp6.v);
                                        m3 m3Var13 = (m3) qs1.P(ap6Var3, zo6.d);
                                        if (rj6Var != null && m3Var13 != null) {
                                            objG14 = fp6Var.k().m.g(kp6.f);
                                            if (objG14 == null) {
                                                objG14 = null;
                                            }
                                            if (objG14 == null) {
                                                objG15 = fp6Var.k().m.g(kp6.e);
                                                if (objG15 == null) {
                                                    objG15 = null;
                                                }
                                                if (objG15 == null) {
                                                    g4Var3.i("android.widget.HorizontalScrollView");
                                                }
                                            }
                                            if (((Number) rj6Var.b.a()).floatValue() > f2) {
                                                accessibilityNodeInfo4.setScrollable(true);
                                            }
                                            if (vn4.c0(fp6Var)) {
                                                z3 = bh.z(rj6Var);
                                                j04Var = j04.n;
                                                if (z3) {
                                                    g4Var3.b(a4.h);
                                                    layoutNode = layoutNode2;
                                                    if (layoutNode.M == j04Var) {
                                                        a4Var2 = a4.f292o;
                                                    } else {
                                                        a4Var2 = a4.q;
                                                    }
                                                    g4Var3.b(a4Var2);
                                                } else {
                                                    layoutNode = layoutNode2;
                                                }
                                                if (bh.y(rj6Var)) {
                                                    g4Var3.b(a4.i);
                                                    if (layoutNode.M == j04Var) {
                                                        a4Var = a4.q;
                                                    } else {
                                                        a4Var = a4.f292o;
                                                    }
                                                    g4Var3.b(a4Var);
                                                }
                                            }
                                        }
                                        rj6Var2 = (rj6) qs1.P(ap6Var3, kp6.w);
                                        if (rj6Var2 != null && m3Var13 != null) {
                                            objG12 = fp6Var.k().m.g(kp6.f);
                                            if (objG12 == null) {
                                                objG12 = null;
                                            }
                                            if (objG12 == null) {
                                                objG13 = fp6Var.k().m.g(kp6.e);
                                                if (objG13 == null) {
                                                    objG13 = null;
                                                }
                                                if (objG13 == null) {
                                                    g4Var3.i("android.widget.ScrollView");
                                                }
                                            }
                                            if (((Number) rj6Var2.b.a()).floatValue() > f2) {
                                                accessibilityNodeInfo4.setScrollable(true);
                                            }
                                            if (vn4.c0(fp6Var)) {
                                                if (bh.z(rj6Var2)) {
                                                    g4Var3.b(a4.h);
                                                    g4Var3.b(a4.p);
                                                }
                                                if (bh.y(rj6Var2)) {
                                                    g4Var3.b(a4.i);
                                                    g4Var3.b(a4.n);
                                                }
                                            }
                                        }
                                        i7 = Build.VERSION.SDK_INT;
                                        if (i7 >= 29) {
                                            im3.m(g4Var3, fp6Var);
                                        }
                                        charSequence = (CharSequence) qs1.P(ap6Var3, kp6.d);
                                        if (i7 >= 28) {
                                            accessibilityNodeInfo4.setPaneTitle(charSequence);
                                        } else {
                                            accessibilityNodeInfo4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                        }
                                        if (vn4.c0(fp6Var)) {
                                            m3Var4 = (m3) qs1.P(ap6Var3, zo6.t);
                                            if (m3Var4 != null) {
                                                g4Var3.b(new a4(262144, m3Var4.a));
                                            }
                                            m3Var5 = (m3) qs1.P(ap6Var3, zo6.u);
                                            if (m3Var5 != null) {
                                                g4Var3.b(new a4(524288, m3Var5.a));
                                            }
                                            m3Var6 = (m3) qs1.P(ap6Var3, zo6.v);
                                            if (m3Var6 != null) {
                                                g4Var3.b(new a4(1048576, m3Var6.a));
                                            }
                                            np6Var3 = zo6.x;
                                            if (jx4Var3.c(np6Var3)) {
                                                list2 = (List) ap6Var3.b(np6Var3);
                                                size2 = list2.size();
                                                jw4Var = bh.Z;
                                                i8 = jw4Var.b;
                                                if (size2 < i8) {
                                                    n77 n77Var4 = new n77(0);
                                                    vw4 vw4VarA = h65.a();
                                                    n77Var3 = n77Var2;
                                                    if (j51.s(n77Var3.f1550o, i6, n77Var3.m) >= 0) {
                                                        vw4Var = (vw4) ck3.u(n77Var3, i6);
                                                        iArr = jw4Var.a;
                                                        i9 = jw4Var.b;
                                                        iArrCopyOf = new int[16];
                                                        i10 = 0;
                                                        i11 = 0;
                                                        while (i10 < i9) {
                                                            int i40 = iArr[i10];
                                                            int i41 = i9;
                                                            i12 = i11 + 1;
                                                            int i42 = i10;
                                                            if (iArrCopyOf.length < i12) {
                                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i12, (iArrCopyOf.length * 3) / 2));
                                                            }
                                                            iArrCopyOf[i11] = i40;
                                                            i10 = i42 + 1;
                                                            i11 = i12;
                                                            i9 = i41;
                                                        }
                                                        arrayList2 = new ArrayList();
                                                        if (list2.size() <= 0) {
                                                            ua5.u(list2.get(0));
                                                            vw4Var.getClass();
                                                            throw null;
                                                        }
                                                        if (arrayList2.size() > 0) {
                                                            ua5.u(arrayList2.get(0));
                                                            if (i11 <= 0) {
                                                                int i43 = iArrCopyOf[0];
                                                                throw null;
                                                            }
                                                            hk0.r("Index must be between 0 and size");
                                                        }
                                                    } else if (list2.size() > 0) {
                                                        ua5.u(list2.get(0));
                                                        jw4Var.c(0);
                                                        throw null;
                                                    }
                                                    bhVar.D.c(i6, n77Var4);
                                                    n77Var3.c(i6, vw4VarA);
                                                } else {
                                                    hk0.l(fx3.f(i8, "Can't have more than ", " custom actions for one widget"));
                                                }
                                                return null;
                                            }
                                        }
                                        zH0 = vn4.h0(fp6Var, resources);
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            accessibilityNodeInfo4.setScreenReaderFocusable(zH0);
                                        } else {
                                            g4Var3.h(1, zH0);
                                        }
                                        iD = bhVar.N.d(i6);
                                        if (iD != -1) {
                                            xlVarN2 = bt1.N(androidComposeView2.getAndroidViewsHandler$ui(), iD);
                                            if (xlVarN2 != null) {
                                                accessibilityNodeInfo4.setTraversalBefore(xlVarN2);
                                                androidComposeView = androidComposeView2;
                                            } else {
                                                androidComposeView = androidComposeView2;
                                                accessibilityNodeInfo4.setTraversalBefore(androidComposeView, iD);
                                            }
                                            bundle = null;
                                            bhVar.j(i6, g4Var3, bhVar.P, null);
                                        } else {
                                            bundle = null;
                                            androidComposeView = androidComposeView2;
                                        }
                                        iD2 = bhVar.O.d(i6);
                                        if (iD2 != -1 && (xlVarN = bt1.N(androidComposeView.getAndroidViewsHandler$ui(), iD2)) != null) {
                                            accessibilityNodeInfo4.setTraversalAfter(xlVarN);
                                            bhVar.j(i6, g4Var3, bhVar.Q, bundle);
                                        }
                                        str3 = (String) qs1.P(ap6Var3, pm8.t);
                                        if (str3 != null) {
                                            g4Var3.i(str3);
                                        }
                                        g4Var4 = g4Var3;
                                    } else {
                                        bhVar = bhVar2;
                                    }
                                    z2 = true;
                                    accessibilityNodeInfo4.setVisibleToUser(db8.Q(fp6Var) ^ z2);
                                    if (fp6Var.n()) {
                                        fp6VarL2 = fp6Var.l();
                                        fp6VarL2.getClass();
                                    } else {
                                        fp6VarL2 = fp6Var;
                                    }
                                    if (fp6VarL2.m().f()) {
                                        accessibilityNodeInfo4.setVisibleToUser(false);
                                    }
                                    objG10 = jx4Var3.g(kp6.k);
                                    if (objG10 == null) {
                                        objG10 = null;
                                    }
                                    qc4Var = (qc4) objG10;
                                    if (qc4Var != null) {
                                        z6 = qc4Var.a;
                                        if (z6) {
                                            i16 = 1;
                                        } else {
                                            i16 = 2;
                                        }
                                        accessibilityNodeInfo5.setLiveRegion(i16);
                                    }
                                    accessibilityNodeInfo4.setClickable(false);
                                    m3Var = (m3) qs1.P(ap6Var3, zo6.b);
                                    if (m3Var != null) {
                                        boolean zN5 = im3.n(qs1.P(ap6Var3, kp6.K), bool2);
                                        if (pe6Var3 == null) {
                                        }
                                        if (z4) {
                                            z5 = true;
                                        } else {
                                            z5 = true;
                                        }
                                        accessibilityNodeInfo4.setClickable(z5);
                                        if (vn4.c0(fp6Var)) {
                                            g4Var3.b(new a4(16, m3Var.a));
                                        }
                                    }
                                    accessibilityNodeInfo4.setLongClickable(false);
                                    m3Var2 = (m3) qs1.P(ap6Var3, zo6.c);
                                    if (m3Var2 != null) {
                                        accessibilityNodeInfo4.setLongClickable(true);
                                        if (vn4.c0(fp6Var)) {
                                            g4Var3.b(new a4(32, m3Var2.a));
                                        }
                                    }
                                    m3Var3 = (m3) qs1.P(ap6Var3, zo6.q);
                                    if (m3Var3 != null) {
                                        g4Var3.b(new a4(16384, m3Var3.a));
                                    }
                                    if (vn4.c0(fp6Var)) {
                                        m3Var9 = (m3) qs1.P(ap6Var3, zo6.k);
                                        if (m3Var9 != null) {
                                            g4Var3.b(new a4(2097152, m3Var9.a));
                                        }
                                        m3Var10 = (m3) qs1.P(ap6Var3, zo6.p);
                                        if (m3Var10 != null) {
                                            g4Var3.b(new a4(android.R.id.accessibilityActionImeEnter, m3Var10.a));
                                        }
                                        m3Var11 = (m3) qs1.P(ap6Var3, zo6.r);
                                        if (m3Var11 != null) {
                                            g4Var3.b(new a4(65536, m3Var11.a));
                                        }
                                        m3Var12 = (m3) qs1.P(ap6Var3, zo6.s);
                                        if (m3Var12 != null) {
                                            primaryClipDescription = ((cj3) androidComposeView2.getClipboardManager()).F().getPrimaryClipDescription();
                                            if (primaryClipDescription != null) {
                                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                            } else {
                                                zHasMimeType = false;
                                            }
                                            if (zHasMimeType) {
                                                g4Var3.b(new a4(32768, m3Var12.a));
                                            }
                                        }
                                    }
                                    strT = bh.t(fp6Var);
                                    if (strT != null) {
                                        accessibilityNodeInfo5.setTextSelection(bhVar.r(fp6Var), bhVar.q(fp6Var));
                                        m3Var8 = (m3) qs1.P(ap6Var3, zo6.j);
                                        if (m3Var8 != null) {
                                            str4 = m3Var8.a;
                                        } else {
                                            str4 = null;
                                        }
                                        g4Var3.b(new a4(131072, str4));
                                        g4Var3.a(256);
                                        g4Var3.a(512);
                                        accessibilityNodeInfo4.setMovementGranularities(11);
                                        list3 = (List) qs1.P(ap6Var3, kp6.a);
                                        if (list3 != null) {
                                            layoutNodeF = layoutNode2.F();
                                            while (true) {
                                                if (layoutNodeF == null) {
                                                    layoutNodeF = null;
                                                } else {
                                                    ap6VarH2 = layoutNodeF.H();
                                                    if (ap6VarH2 == null) {
                                                    }
                                                    layoutNodeF = layoutNodeF.F();
                                                }
                                            }
                                            if (layoutNodeF == null) {
                                                accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                            } else {
                                                ap6VarH = layoutNodeF.H();
                                                if (ap6VarH != null) {
                                                    objG19 = ap6VarH.m.g(kp6.l);
                                                    if (objG19 == null) {
                                                        objG19 = null;
                                                    }
                                                    zN = im3.n(objG19, Boolean.TRUE);
                                                } else {
                                                    zN = false;
                                                }
                                                if (zN) {
                                                    accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                                }
                                            }
                                        } else {
                                            layoutNodeF = layoutNode2.F();
                                            while (true) {
                                                if (layoutNodeF == null) {
                                                    layoutNodeF = null;
                                                } else {
                                                    ap6VarH2 = layoutNodeF.H();
                                                    if (ap6VarH2 == null) {
                                                    }
                                                    layoutNodeF = layoutNodeF.F();
                                                }
                                            }
                                            if (layoutNodeF == null) {
                                                accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                            } else {
                                                ap6VarH = layoutNodeF.H();
                                                if (ap6VarH != null) {
                                                    objG19 = ap6VarH.m.g(kp6.l);
                                                    if (objG19 == null) {
                                                        objG19 = null;
                                                    }
                                                    zN = im3.n(objG19, Boolean.TRUE);
                                                } else {
                                                    zN = false;
                                                }
                                                if (zN) {
                                                    accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                                }
                                            }
                                        }
                                    }
                                    arrayList = new ArrayList();
                                    arrayList.add("androidx.compose.ui.semantics.id");
                                    charSequenceG = g4Var3.g();
                                    if (charSequenceG != null) {
                                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                    }
                                    if (jx4Var3.c(kp6.A)) {
                                        arrayList.add("androidx.compose.ui.semantics.testTag");
                                    }
                                    if (jx4Var3.c(kp6.S)) {
                                        arrayList.add("androidx.compose.ui.semantics.shapeType");
                                        arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                        arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                        arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                                    }
                                    accessibilityNodeInfo5.setAvailableExtraData(arrayList);
                                    pt5Var = (pt5) qs1.P(ap6Var3, kp6.c);
                                    f = 0.0f;
                                    if (pt5Var != null) {
                                        np6Var4 = zo6.i;
                                        if (jx4Var3.c(np6Var4)) {
                                            g4Var3.i("android.widget.SeekBar");
                                        } else {
                                            g4Var3.i("android.widget.ProgressBar");
                                        }
                                        if (pt5Var != pt5.b) {
                                            accessibilityNodeInfo5.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                                        }
                                        if (jx4Var3.c(np6Var4)) {
                                            vn4.c0(fp6Var);
                                        }
                                    }
                                    if (vn4.c0(fp6Var)) {
                                        g4Var3.b(new a4(android.R.id.accessibilityActionSetProgress, m3Var7.a));
                                    }
                                    ga0.w(g4Var3, fp6Var);
                                    objG11 = fp6Var.k().m.g(kp6.g);
                                    if (objG11 == null) {
                                        objG11 = null;
                                    }
                                    if (objG11 == null) {
                                        fp6VarL3 = fp6Var.l();
                                        if (fp6VarL3 == null) {
                                            f2 = 0.0f;
                                        } else {
                                            objG16 = fp6VarL3.k().m.g(kp6.e);
                                            if (objG16 == null) {
                                                objG16 = null;
                                            }
                                            if (objG16 != null) {
                                                objG17 = fp6VarL3.k().m.g(kp6.f);
                                                if (objG17 == null) {
                                                    objG17 = null;
                                                }
                                                iv0Var = (iv0) objG17;
                                                if (iv0Var == null) {
                                                    if (fp6Var.k().m.c(kp6.K)) {
                                                        f2 = 0.0f;
                                                    } else {
                                                        arrayList3 = new ArrayList();
                                                        listI2 = fp6VarL3.i((4 & 1) != 0 ? !fp6VarL3.b : false, (4 & 2) == 0);
                                                        size3 = listI2.size();
                                                        i13 = 0;
                                                        i14 = 0;
                                                        while (i13 < size3) {
                                                            fp6Var2 = (fp6) listI2.get(i13);
                                                            float f4 = f;
                                                            if (fp6Var2.k().m.c(kp6.K)) {
                                                                arrayList3.add(fp6Var2);
                                                                if (fp6Var2.c.G() < fp6Var.c.G()) {
                                                                    i14++;
                                                                }
                                                            }
                                                            i13++;
                                                            f = f4;
                                                        }
                                                        f2 = f;
                                                        if (!arrayList3.isEmpty()) {
                                                            zI2 = ga0.i(arrayList3);
                                                            if (zI2) {
                                                                i15 = 0;
                                                            } else {
                                                                i15 = i14;
                                                            }
                                                            if (!zI2) {
                                                                i14 = 0;
                                                            }
                                                            objG18 = fp6Var.k().m.g(kp6.K);
                                                            if (objG18 == null) {
                                                                objG18 = Boolean.FALSE;
                                                            }
                                                            g4Var3.j(f4.c(((Boolean) objG18).booleanValue(), i15, 1, i14, 1));
                                                        }
                                                    }
                                                } else if (fp6Var.k().m.c(kp6.K)) {
                                                    f2 = 0.0f;
                                                } else {
                                                    arrayList3 = new ArrayList();
                                                    listI2 = fp6VarL3.i((4 & 1) != 0 ? !fp6VarL3.b : false, (4 & 2) == 0);
                                                    size3 = listI2.size();
                                                    i13 = 0;
                                                    i14 = 0;
                                                    while (i13 < size3) {
                                                        fp6Var2 = (fp6) listI2.get(i13);
                                                        float f5 = f;
                                                        if (fp6Var2.k().m.c(kp6.K)) {
                                                            arrayList3.add(fp6Var2);
                                                            if (fp6Var2.c.G() < fp6Var.c.G()) {
                                                                i14++;
                                                            }
                                                        }
                                                        i13++;
                                                        f = f5;
                                                    }
                                                    f2 = f;
                                                    if (!arrayList3.isEmpty()) {
                                                        zI2 = ga0.i(arrayList3);
                                                        if (zI2) {
                                                            i15 = 0;
                                                        } else {
                                                            i15 = i14;
                                                        }
                                                        if (!zI2) {
                                                            i14 = 0;
                                                        }
                                                        objG18 = fp6Var.k().m.g(kp6.K);
                                                        if (objG18 == null) {
                                                            objG18 = Boolean.FALSE;
                                                        }
                                                        g4Var3.j(f4.c(((Boolean) objG18).booleanValue(), i15, 1, i14, 1));
                                                    }
                                                }
                                            } else {
                                                f2 = 0.0f;
                                            }
                                        }
                                    } else {
                                        f2 = 0.0f;
                                        io.sentry.h2.f();
                                    }
                                    rj6Var = (rj6) qs1.P(ap6Var3, kp6.v);
                                    m3 m3Var14 = (m3) qs1.P(ap6Var3, zo6.d);
                                    if (rj6Var != null) {
                                        objG14 = fp6Var.k().m.g(kp6.f);
                                        if (objG14 == null) {
                                            objG14 = null;
                                        }
                                        if (objG14 == null) {
                                            objG15 = fp6Var.k().m.g(kp6.e);
                                            if (objG15 == null) {
                                                objG15 = null;
                                            }
                                            if (objG15 == null) {
                                                g4Var3.i("android.widget.HorizontalScrollView");
                                            }
                                        }
                                        if (((Number) rj6Var.b.a()).floatValue() > f2) {
                                            accessibilityNodeInfo4.setScrollable(true);
                                        }
                                        if (vn4.c0(fp6Var)) {
                                            z3 = bh.z(rj6Var);
                                            j04Var = j04.n;
                                            if (z3) {
                                                g4Var3.b(a4.h);
                                                layoutNode = layoutNode2;
                                                if (layoutNode.M == j04Var) {
                                                    a4Var2 = a4.f292o;
                                                } else {
                                                    a4Var2 = a4.q;
                                                }
                                                g4Var3.b(a4Var2);
                                            } else {
                                                layoutNode = layoutNode2;
                                            }
                                            if (bh.y(rj6Var)) {
                                                g4Var3.b(a4.i);
                                                if (layoutNode.M == j04Var) {
                                                    a4Var = a4.q;
                                                } else {
                                                    a4Var = a4.f292o;
                                                }
                                                g4Var3.b(a4Var);
                                            }
                                        }
                                    }
                                    rj6Var2 = (rj6) qs1.P(ap6Var3, kp6.w);
                                    if (rj6Var2 != null) {
                                        objG12 = fp6Var.k().m.g(kp6.f);
                                        if (objG12 == null) {
                                            objG12 = null;
                                        }
                                        if (objG12 == null) {
                                            objG13 = fp6Var.k().m.g(kp6.e);
                                            if (objG13 == null) {
                                                objG13 = null;
                                            }
                                            if (objG13 == null) {
                                                g4Var3.i("android.widget.ScrollView");
                                            }
                                        }
                                        if (((Number) rj6Var2.b.a()).floatValue() > f2) {
                                            accessibilityNodeInfo4.setScrollable(true);
                                        }
                                        if (vn4.c0(fp6Var)) {
                                            if (bh.z(rj6Var2)) {
                                                g4Var3.b(a4.h);
                                                g4Var3.b(a4.p);
                                            }
                                            if (bh.y(rj6Var2)) {
                                                g4Var3.b(a4.i);
                                                g4Var3.b(a4.n);
                                            }
                                        }
                                    }
                                    i7 = Build.VERSION.SDK_INT;
                                    if (i7 >= 29) {
                                        im3.m(g4Var3, fp6Var);
                                    }
                                    charSequence = (CharSequence) qs1.P(ap6Var3, kp6.d);
                                    if (i7 >= 28) {
                                        accessibilityNodeInfo4.setPaneTitle(charSequence);
                                    } else {
                                        accessibilityNodeInfo4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                    }
                                    if (vn4.c0(fp6Var)) {
                                        m3Var4 = (m3) qs1.P(ap6Var3, zo6.t);
                                        if (m3Var4 != null) {
                                            g4Var3.b(new a4(262144, m3Var4.a));
                                        }
                                        m3Var5 = (m3) qs1.P(ap6Var3, zo6.u);
                                        if (m3Var5 != null) {
                                            g4Var3.b(new a4(524288, m3Var5.a));
                                        }
                                        m3Var6 = (m3) qs1.P(ap6Var3, zo6.v);
                                        if (m3Var6 != null) {
                                            g4Var3.b(new a4(1048576, m3Var6.a));
                                        }
                                        np6Var3 = zo6.x;
                                        if (jx4Var3.c(np6Var3)) {
                                            list2 = (List) ap6Var3.b(np6Var3);
                                            size2 = list2.size();
                                            jw4Var = bh.Z;
                                            i8 = jw4Var.b;
                                            if (size2 < i8) {
                                                n77 n77Var5 = new n77(0);
                                                vw4 vw4VarA2 = h65.a();
                                                n77Var3 = n77Var2;
                                                if (j51.s(n77Var3.f1550o, i6, n77Var3.m) >= 0) {
                                                    vw4Var = (vw4) ck3.u(n77Var3, i6);
                                                    iArr = jw4Var.a;
                                                    i9 = jw4Var.b;
                                                    iArrCopyOf = new int[16];
                                                    i10 = 0;
                                                    i11 = 0;
                                                    while (i10 < i9) {
                                                        int i44 = iArr[i10];
                                                        int i45 = i9;
                                                        i12 = i11 + 1;
                                                        int i46 = i10;
                                                        if (iArrCopyOf.length < i12) {
                                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i12, (iArrCopyOf.length * 3) / 2));
                                                        }
                                                        iArrCopyOf[i11] = i44;
                                                        i10 = i46 + 1;
                                                        i11 = i12;
                                                        i9 = i45;
                                                    }
                                                    arrayList2 = new ArrayList();
                                                    if (list2.size() <= 0) {
                                                        ua5.u(list2.get(0));
                                                        vw4Var.getClass();
                                                        throw null;
                                                    }
                                                    if (arrayList2.size() > 0) {
                                                        ua5.u(arrayList2.get(0));
                                                        if (i11 <= 0) {
                                                            int i47 = iArrCopyOf[0];
                                                            throw null;
                                                        }
                                                        hk0.r("Index must be between 0 and size");
                                                    }
                                                } else if (list2.size() > 0) {
                                                    ua5.u(list2.get(0));
                                                    jw4Var.c(0);
                                                    throw null;
                                                }
                                                bhVar.D.c(i6, n77Var5);
                                                n77Var3.c(i6, vw4VarA2);
                                            } else {
                                                hk0.l(fx3.f(i8, "Can't have more than ", " custom actions for one widget"));
                                            }
                                            return null;
                                        }
                                    }
                                    zH0 = vn4.h0(fp6Var, resources);
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        accessibilityNodeInfo4.setScreenReaderFocusable(zH0);
                                    } else {
                                        g4Var3.h(1, zH0);
                                    }
                                    iD = bhVar.N.d(i6);
                                    if (iD != -1) {
                                        xlVarN2 = bt1.N(androidComposeView2.getAndroidViewsHandler$ui(), iD);
                                        if (xlVarN2 != null) {
                                            accessibilityNodeInfo4.setTraversalBefore(xlVarN2);
                                            androidComposeView = androidComposeView2;
                                        } else {
                                            androidComposeView = androidComposeView2;
                                            accessibilityNodeInfo4.setTraversalBefore(androidComposeView, iD);
                                        }
                                        bundle = null;
                                        bhVar.j(i6, g4Var3, bhVar.P, null);
                                    } else {
                                        bundle = null;
                                        androidComposeView = androidComposeView2;
                                    }
                                    iD2 = bhVar.O.d(i6);
                                    if (iD2 != -1) {
                                        accessibilityNodeInfo4.setTraversalAfter(xlVarN);
                                        bhVar.j(i6, g4Var3, bhVar.Q, bundle);
                                    }
                                    str3 = (String) qs1.P(ap6Var3, pm8.t);
                                    if (str3 != null) {
                                        g4Var3.i(str3);
                                    }
                                    g4Var4 = g4Var3;
                                }
                            }
                        } else if (Build.VERSION.SDK_INT >= 34 ? q3.i(accessibilityManager2) : true) {
                            accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                            g4Var = new g4(accessibilityNodeInfoObtain);
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 34) {
                                q3.k(accessibilityNodeInfoObtain, zN3);
                            } else {
                                g4Var.h(64, zN3);
                            }
                            if (i == -1) {
                                parentForAccessibility = androidComposeView2.getParentForAccessibility();
                                if (parentForAccessibility instanceof View) {
                                    view = (View) parentForAccessibility;
                                } else {
                                    view = null;
                                }
                                g4Var.b = -1;
                                accessibilityNodeInfoObtain.setParent(view);
                            } else {
                                fp6VarL = fp6Var5.l();
                                if (fp6VarL != null) {
                                    numValueOf = Integer.valueOf(fp6VarL.f);
                                } else {
                                    numValueOf = null;
                                }
                                if (numValueOf != null) {
                                    ki3.d("semanticsNode " + i + " has null parent");
                                    hk0.b();
                                    return null;
                                }
                                iIntValue = numValueOf.intValue();
                                if (iIntValue == androidComposeView2.getSemanticsOwner().a().f) {
                                    iIntValue = -1;
                                }
                                g4Var.b = iIntValue;
                                accessibilityNodeInfoObtain.setParent(androidComposeView2, iIntValue);
                            }
                            g4Var.c = i;
                            accessibilityNodeInfoObtain.setSource(androidComposeView2, i);
                            accessibilityNodeInfoObtain.setBoundsInScreen(bhVar2.k(hp6Var2));
                            iw4Var = bhVar2.V;
                            n77Var = bhVar2.E;
                            resources = androidComposeView2.getContext().getResources();
                            g4Var.i("android.view.View");
                            ap6Var = fp6Var5.d;
                            jx4Var = ap6Var.m;
                            if (jx4Var.c(kp6.G)) {
                                g4Var.i("android.widget.EditText");
                            }
                            if (jx4Var.c(kp6.C)) {
                                g4Var.i("android.widget.TextView");
                            }
                            objG = jx4Var.g(kp6.z);
                            if (objG == null) {
                                objG = null;
                            }
                            pe6Var = (pe6) objG;
                            if (pe6Var != null) {
                                b = pe6Var.a;
                                if (fp6Var5.n()) {
                                    accessibilityManager = accessibilityManager2;
                                    b2 = 4;
                                    n77Var2 = n77Var;
                                } else {
                                    accessibilityManager = accessibilityManager2;
                                    b2 = 4;
                                    n77Var2 = n77Var;
                                    if (fp6Var5.i((4 & 1) != 0 ? !fp6Var5.b : false, (4 & 2) == 0).isEmpty()) {
                                    }
                                }
                                if (b == b2) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                                } else if (b == 2) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                                } else {
                                    strU = bt1.U(b);
                                    if (b == 5) {
                                        g4Var.i(strU);
                                    } else {
                                        g4Var.i(strU);
                                    }
                                }
                            } else {
                                accessibilityManager = accessibilityManager2;
                                n77Var2 = n77Var;
                            }
                            accessibilityNodeInfoObtain.setPackageName(androidComposeView2.getContext().getPackageName());
                            accessibilityNodeInfoObtain.setImportantForAccessibility(db8.R(fp6Var5));
                            if (i2 >= 34) {
                                zI = q3.i(accessibilityManager);
                            } else {
                                zI = true;
                            }
                            listI = fp6Var5.i((4 & 1) != 0 ? !fp6Var5.b : false, (4 & 2) == 0);
                            size = listI.size();
                            z = zI;
                            i3 = 0;
                            i4 = 0;
                            while (true) {
                                accessibilityNodeInfo = g4Var.a;
                                if (i4 < size) {
                                    int i310 = size;
                                    fp6Var3 = (fp6) listI.get(i4);
                                    List list6 = listI;
                                    tk3VarS = bhVar2.s();
                                    int i311 = i4;
                                    i32 = fp6Var3.f;
                                    if (tk3VarS.a(i32)) {
                                        xlVar = androidComposeView2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(fp6Var3.c);
                                        if (i32 != -1) {
                                            if (xlVar != null) {
                                                accessibilityNodeInfoObtain.addChild(xlVar);
                                            } else {
                                                hp6Var = (hp6) bhVar2.s().b(i32);
                                                if (hp6Var != null) {
                                                    zN2 = false;
                                                } else {
                                                    zN2 = false;
                                                }
                                                if (z) {
                                                    accessibilityNodeInfo.addChild(androidComposeView2, i32);
                                                } else {
                                                    accessibilityNodeInfo.addChild(androidComposeView2, i32);
                                                }
                                            }
                                            iw4Var.f(i32, i3);
                                            i3++;
                                        }
                                    }
                                    i4 = i311 + 1;
                                    listI = list6;
                                    size = i310;
                                } else {
                                    if (i == bhVar2.w) {
                                        accessibilityNodeInfo.setAccessibilityFocused(true);
                                        g4Var.b(a4.g);
                                    } else {
                                        accessibilityNodeInfo.setAccessibilityFocused(false);
                                        g4Var.b(a4.f);
                                    }
                                    xoVarF0 = vn4.f0(fp6Var5);
                                    if (xoVarF0 != null) {
                                        androidComposeView2.getFontFamilyResolver();
                                        density = androidComposeView2.getDensity();
                                        y58Var = bhVar2.R;
                                        String str6 = xoVarF0.n;
                                        list4 = xoVarF0.m;
                                        spannableString2 = new SpannableString(str6);
                                        arrayList4 = xoVarF0.f2540o;
                                        if (arrayList4 != null) {
                                            size9 = arrayList4.size();
                                            i26 = 0;
                                            while (i26 < size9) {
                                                int i312 = size9;
                                                wo woVar8 = (wo) arrayList4.get(i26);
                                                int i313 = i26;
                                                c77 c77Var2 = (c77) woVar8.a;
                                                ArrayList arrayList8 = arrayList4;
                                                i27 = woVar8.b;
                                                i28 = woVar8.c;
                                                ap6 ap6Var6 = ap6Var;
                                                pe6 pe6Var5 = pe6Var;
                                                jB = c77Var2.a.b();
                                                AccessibilityNodeInfo accessibilityNodeInfo8 = accessibilityNodeInfo;
                                                jx4 jx4Var5 = jx4Var;
                                                long j3 = c77Var2.b;
                                                ms2Var = c77Var2.c;
                                                ks2Var = c77Var2.d;
                                                cs7Var = c77Var2.j;
                                                kd4 kd4Var2 = c77Var2.k;
                                                AccessibilityNodeInfo accessibilityNodeInfo9 = accessibilityNodeInfoObtain;
                                                g4 g4Var6 = g4Var;
                                                j = c77Var2.l;
                                                vp7Var = c77Var2.m;
                                                bs7Var = c77Var2.a;
                                                fp6 fp6Var7 = fp6Var5;
                                                jB2 = bs7Var.b();
                                                int i314 = rv0.i;
                                                if (z68.a(jB, jB2)) {
                                                    gw0Var = bs7Var;
                                                } else if (jB != 16) {
                                                    gw0Var = new gw0(jB);
                                                } else {
                                                    gw0Var = as7.a;
                                                }
                                                g77.o(spannableString2, gw0Var.b(), i27, i28);
                                                spannableString4 = spannableString2;
                                                g77.p(spannableString4, j3, density, i27, i28);
                                                if (ms2Var == null) {
                                                    if (ms2Var == null) {
                                                        ms2Var2 = ms2.f1503o;
                                                    } else {
                                                        ms2Var2 = ms2Var;
                                                    }
                                                    if (ks2Var != null) {
                                                        i29 = ks2Var.a;
                                                    } else {
                                                        i29 = 0;
                                                    }
                                                    StyleSpan styleSpan2 = new StyleSpan(pm8.t(ms2Var2, i29));
                                                    i30 = 33;
                                                    spannableString4.setSpan(styleSpan2, i27, i28, 33);
                                                } else {
                                                    if (ms2Var == null) {
                                                        ms2Var2 = ms2.f1503o;
                                                    } else {
                                                        ms2Var2 = ms2Var;
                                                    }
                                                    if (ks2Var != null) {
                                                        i29 = ks2Var.a;
                                                    } else {
                                                        i29 = 0;
                                                    }
                                                    StyleSpan styleSpan3 = new StyleSpan(pm8.t(ms2Var2, i29));
                                                    i30 = 33;
                                                    spannableString4.setSpan(styleSpan3, i27, i28, 33);
                                                }
                                                if (vp7Var != null) {
                                                    i31 = vp7Var.a;
                                                    if ((i31 | 1) == i31) {
                                                        spannableString4.setSpan(new UnderlineSpan(), i27, i28, i30);
                                                    }
                                                    if ((i31 | 2) == i31) {
                                                        spannableString4.setSpan(new StrikethroughSpan(), i27, i28, i30);
                                                    }
                                                }
                                                if (cs7Var != null) {
                                                    spannableString4.setSpan(new ScaleXSpan(cs7Var.a), i27, i28, i30);
                                                }
                                                g77.q(spannableString4, kd4Var2, i27, i28);
                                                if (j != 16) {
                                                    spannableString4.setSpan(new BackgroundColorSpan(j51.U(j)), i27, i28, i30);
                                                }
                                                i26 = i313 + 1;
                                                spannableString2 = spannableString4;
                                                fp6Var5 = fp6Var7;
                                                size9 = i312;
                                                arrayList4 = arrayList8;
                                                ap6Var = ap6Var6;
                                                pe6Var = pe6Var5;
                                                accessibilityNodeInfo = accessibilityNodeInfo8;
                                                jx4Var = jx4Var5;
                                                accessibilityNodeInfoObtain = accessibilityNodeInfo9;
                                                g4Var = g4Var6;
                                            }
                                        }
                                        ap6Var2 = ap6Var;
                                        pe6Var2 = pe6Var;
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        jx4Var2 = jx4Var;
                                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                                        g4Var2 = g4Var;
                                        spannableString3 = spannableString2;
                                        fp6Var = fp6Var5;
                                        int length3 = str6.length();
                                        arrayList5 = ea2.m;
                                        if (list4 != null) {
                                            arrayList6 = new ArrayList(list4.size());
                                            size8 = list4.size();
                                            for (i25 = 0; i25 < size8; i25++) {
                                                Object obj4 = list4.get(i25);
                                                woVar3 = (wo) obj4;
                                                if (!(woVar3.a instanceof sc8)) {
                                                }
                                            }
                                        } else {
                                            arrayList6 = arrayList5;
                                        }
                                        size4 = arrayList6.size();
                                        for (i17 = 0; i17 < size4; i17++) {
                                            wo woVar9 = (wo) arrayList6.get(i17);
                                            sc8Var = (sc8) woVar9.a;
                                            i23 = woVar9.b;
                                            i24 = woVar9.c;
                                            if (sc8Var instanceof sc8) {
                                                gk0.s();
                                                return null;
                                            }
                                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(sc8Var.a).build(), i23, i24, 33);
                                        }
                                        int length4 = str6.length();
                                        if (list4 != null) {
                                            arrayList5 = new ArrayList(list4.size());
                                            size7 = list4.size();
                                            for (i22 = 0; i22 < size7; i22++) {
                                                Object obj5 = list4.get(i22);
                                                woVar2 = (wo) obj5;
                                                if (!(woVar2.a instanceof z98)) {
                                                }
                                            }
                                        }
                                        size5 = arrayList5.size();
                                        for (i18 = 0; i18 < size5; i18++) {
                                            wo woVar10 = (wo) arrayList5.get(i18);
                                            z98Var = (z98) woVar10.a;
                                            int i315 = woVar10.b;
                                            int i316 = woVar10.c;
                                            weakHashMap2 = (WeakHashMap) y58Var.n;
                                            uRLSpan = weakHashMap2.get(z98Var);
                                            if (uRLSpan == null) {
                                                uRLSpan = new URLSpan(z98Var.a);
                                                weakHashMap2.put(z98Var, uRLSpan);
                                            }
                                            spannableString3.setSpan((URLSpan) uRLSpan, i315, i316, 33);
                                        }
                                        listA = xoVarF0.a(str6.length());
                                        size6 = listA.size();
                                        for (i19 = 0; i19 < size6; i19++) {
                                            woVar = (wo) listA.get(i19);
                                            i20 = woVar.b;
                                            obj = woVar.a;
                                            i21 = woVar.c;
                                            if (i20 != i21) {
                                                ga4Var = (ga4) obj;
                                                if (ga4Var instanceof fa4) {
                                                    weakHashMap = (WeakHashMap) y58Var.p;
                                                    kz0Var = weakHashMap.get(woVar);
                                                    if (kz0Var == null) {
                                                        kz0Var = new kz0(ga4Var);
                                                        weakHashMap.put(woVar, kz0Var);
                                                    }
                                                    spannableString3.setSpan((ClickableSpan) kz0Var, i20, i21, 33);
                                                } else {
                                                    weakHashMap = (WeakHashMap) y58Var.p;
                                                    kz0Var = weakHashMap.get(woVar);
                                                    if (kz0Var == null) {
                                                        kz0Var = new kz0(ga4Var);
                                                        weakHashMap.put(woVar, kz0Var);
                                                    }
                                                    spannableString3.setSpan((ClickableSpan) kz0Var, i20, i21, 33);
                                                }
                                            }
                                        }
                                        spannableString = (SpannableString) bh.P(spannableString3);
                                    } else {
                                        iw4Var = iw4Var;
                                        ap6Var2 = ap6Var;
                                        pe6Var2 = pe6Var;
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        jx4Var2 = jx4Var;
                                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                                        g4Var2 = g4Var;
                                        fp6Var = fp6Var5;
                                        spannableString = null;
                                    }
                                    g4Var3 = g4Var2;
                                    g4Var3.k(spannableString);
                                    np6Var = kp6.O;
                                    jx4Var3 = jx4Var2;
                                    if (jx4Var3.c(np6Var)) {
                                        accessibilityNodeInfo5 = accessibilityNodeInfo3;
                                        accessibilityNodeInfo5.setContentInvalid(true);
                                        objG20 = jx4Var3.g(np6Var);
                                        if (objG20 == null) {
                                            objG20 = null;
                                        }
                                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                                        accessibilityNodeInfo4.setError((CharSequence) objG20);
                                    } else {
                                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                                        accessibilityNodeInfo5 = accessibilityNodeInfo3;
                                    }
                                    strE0 = vn4.e0(fp6Var, resources);
                                    if (Build.VERSION.SDK_INT >= 30) {
                                        b4.m(accessibilityNodeInfo4, strE0);
                                    } else {
                                        accessibilityNodeInfo4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strE0);
                                    }
                                    accessibilityNodeInfo4.setCheckable(vn4.d0(fp6Var));
                                    objG2 = jx4Var3.g(kp6.L);
                                    if (objG2 == null) {
                                        objG2 = null;
                                    }
                                    xv7Var = (xv7) objG2;
                                    if (xv7Var != null) {
                                        if (xv7Var == xv7.m) {
                                            accessibilityNodeInfo4.setChecked(true);
                                        } else if (xv7Var == xv7.n) {
                                            accessibilityNodeInfo4.setChecked(false);
                                        }
                                    }
                                    objG3 = jx4Var3.g(kp6.K);
                                    if (objG3 == null) {
                                        objG3 = null;
                                    }
                                    bool = (Boolean) objG3;
                                    if (bool != null) {
                                        zBooleanValue2 = bool.booleanValue();
                                        if (pe6Var2 == null) {
                                            pe6Var3 = pe6Var2;
                                            i5 = 4;
                                        } else {
                                            pe6Var3 = pe6Var2;
                                            i5 = 4;
                                            if (pe6Var3.a == 4) {
                                                accessibilityNodeInfo5.setSelected(zBooleanValue2);
                                            }
                                        }
                                        accessibilityNodeInfo4.setChecked(zBooleanValue2);
                                    } else {
                                        pe6Var3 = pe6Var2;
                                        i5 = 4;
                                    }
                                    ap6Var3 = ap6Var2;
                                    if (ap6Var3.f346o) {
                                        objG4 = jx4Var3.g(kp6.a);
                                        if (objG4 == null) {
                                            objG4 = null;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            str = (String) lv0.o0(list);
                                        } else {
                                            str = null;
                                        }
                                        accessibilityNodeInfo4.setContentDescription(str);
                                    } else {
                                        objG4 = jx4Var3.g(kp6.a);
                                        if (objG4 == null) {
                                            objG4 = null;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            str = (String) lv0.o0(list);
                                        } else {
                                            str = null;
                                        }
                                        accessibilityNodeInfo4.setContentDescription(str);
                                    }
                                    objG5 = jx4Var3.g(kp6.A);
                                    if (objG5 == null) {
                                        objG5 = null;
                                    }
                                    str2 = (String) objG5;
                                    if (str2 != null) {
                                        fp6VarL4 = fp6Var;
                                        while (true) {
                                            if (fp6VarL4 != null) {
                                                ap6Var4 = fp6VarL4.d;
                                                np6Var5 = pm8.s;
                                                if (ap6Var4.m.c(np6Var5)) {
                                                    zBooleanValue = ((Boolean) ap6Var4.b(np6Var5)).booleanValue();
                                                } else {
                                                    fp6VarL4 = fp6VarL4.l();
                                                }
                                            } else {
                                                zBooleanValue = false;
                                            }
                                        }
                                        if (zBooleanValue) {
                                            accessibilityNodeInfo5.setViewIdResourceName(str2);
                                        }
                                    }
                                    objG6 = jx4Var3.g(kp6.h);
                                    if (objG6 == null) {
                                        objG6 = null;
                                    }
                                    if (((f88) objG6) != null) {
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            accessibilityNodeInfo4.setHeading(true);
                                        } else {
                                            g4Var3.h(2, true);
                                        }
                                    }
                                    objG7 = jx4Var3.g(kp6.i);
                                    if (objG7 == null) {
                                        objG7 = null;
                                    }
                                    if (((f88) objG7) != null) {
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            accessibilityNodeInfo5.setTextEntryKey(true);
                                        } else {
                                            g4Var3.h(8, true);
                                        }
                                    }
                                    i6 = i;
                                    if (i6 != -1) {
                                        iD3 = iw4Var.d(fp6Var.f);
                                        if (iD3 != -1) {
                                            accessibilityNodeInfo5.setDrawingOrder(iD3);
                                        } else {
                                            io.sentry.android.core.v0.j("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                                        }
                                    }
                                    accessibilityNodeInfo5.setPassword(jx4Var3.c(kp6.N));
                                    objG8 = jx4Var3.g(kp6.Q);
                                    if (objG8 == null) {
                                        objG8 = null;
                                    }
                                    bool2 = Boolean.TRUE;
                                    accessibilityNodeInfo5.setEditable(im3.n(objG8, bool2));
                                    objG9 = jx4Var3.g(kp6.R);
                                    if (objG9 == null) {
                                        objG9 = null;
                                    }
                                    num = (Integer) objG9;
                                    if (num != null) {
                                        iIntValue2 = num.intValue();
                                    } else {
                                        iIntValue2 = -1;
                                    }
                                    accessibilityNodeInfo4.setMaxTextLength(iIntValue2);
                                    accessibilityNodeInfo4.setEnabled(vn4.c0(fp6Var));
                                    np6Var2 = kp6.l;
                                    accessibilityNodeInfo4.setFocusable(jx4Var3.c(np6Var2));
                                    if (accessibilityNodeInfo5.isFocusable()) {
                                        accessibilityNodeInfo4.setFocused(((Boolean) ap6Var3.b(np6Var2)).booleanValue());
                                        if (accessibilityNodeInfo5.isFocused()) {
                                            g4Var3.a(2);
                                            bhVar = bhVar2;
                                            bhVar.x = i6;
                                        } else {
                                            bhVar = bhVar2;
                                            z2 = true;
                                            g4Var3.a(1);
                                        }
                                        accessibilityNodeInfo4.setVisibleToUser(db8.Q(fp6Var) ^ z2);
                                        if (fp6Var.n()) {
                                            fp6VarL2 = fp6Var.l();
                                            fp6VarL2.getClass();
                                        } else {
                                            fp6VarL2 = fp6Var;
                                        }
                                        if (fp6VarL2.m().f()) {
                                            accessibilityNodeInfo4.setVisibleToUser(false);
                                        }
                                        objG10 = jx4Var3.g(kp6.k);
                                        if (objG10 == null) {
                                            objG10 = null;
                                        }
                                        qc4Var = (qc4) objG10;
                                        if (qc4Var != null) {
                                            z6 = qc4Var.a;
                                            if (z6) {
                                                i16 = 2;
                                            } else {
                                                i16 = 1;
                                            }
                                            accessibilityNodeInfo5.setLiveRegion(i16);
                                        }
                                        accessibilityNodeInfo4.setClickable(false);
                                        m3Var = (m3) qs1.P(ap6Var3, zo6.b);
                                        if (m3Var != null) {
                                            boolean zN6 = im3.n(qs1.P(ap6Var3, kp6.K), bool2);
                                            if (pe6Var3 == null) {
                                            }
                                            if (z4) {
                                                z5 = true;
                                            } else {
                                                z5 = true;
                                            }
                                            accessibilityNodeInfo4.setClickable(z5);
                                            if (vn4.c0(fp6Var)) {
                                                g4Var3.b(new a4(16, m3Var.a));
                                            }
                                        }
                                        accessibilityNodeInfo4.setLongClickable(false);
                                        m3Var2 = (m3) qs1.P(ap6Var3, zo6.c);
                                        if (m3Var2 != null) {
                                            accessibilityNodeInfo4.setLongClickable(true);
                                            if (vn4.c0(fp6Var)) {
                                                g4Var3.b(new a4(32, m3Var2.a));
                                            }
                                        }
                                        m3Var3 = (m3) qs1.P(ap6Var3, zo6.q);
                                        if (m3Var3 != null) {
                                            g4Var3.b(new a4(16384, m3Var3.a));
                                        }
                                        if (vn4.c0(fp6Var)) {
                                            m3Var9 = (m3) qs1.P(ap6Var3, zo6.k);
                                            if (m3Var9 != null) {
                                                g4Var3.b(new a4(2097152, m3Var9.a));
                                            }
                                            m3Var10 = (m3) qs1.P(ap6Var3, zo6.p);
                                            if (m3Var10 != null) {
                                                g4Var3.b(new a4(android.R.id.accessibilityActionImeEnter, m3Var10.a));
                                            }
                                            m3Var11 = (m3) qs1.P(ap6Var3, zo6.r);
                                            if (m3Var11 != null) {
                                                g4Var3.b(new a4(65536, m3Var11.a));
                                            }
                                            m3Var12 = (m3) qs1.P(ap6Var3, zo6.s);
                                            if (m3Var12 != null) {
                                                primaryClipDescription = ((cj3) androidComposeView2.getClipboardManager()).F().getPrimaryClipDescription();
                                                if (primaryClipDescription != null) {
                                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                } else {
                                                    zHasMimeType = false;
                                                }
                                                if (zHasMimeType) {
                                                    g4Var3.b(new a4(32768, m3Var12.a));
                                                }
                                            }
                                        }
                                        strT = bh.t(fp6Var);
                                        if (strT != null) {
                                            accessibilityNodeInfo5.setTextSelection(bhVar.r(fp6Var), bhVar.q(fp6Var));
                                            m3Var8 = (m3) qs1.P(ap6Var3, zo6.j);
                                            if (m3Var8 != null) {
                                                str4 = m3Var8.a;
                                            } else {
                                                str4 = null;
                                            }
                                            g4Var3.b(new a4(131072, str4));
                                            g4Var3.a(256);
                                            g4Var3.a(512);
                                            accessibilityNodeInfo4.setMovementGranularities(11);
                                            list3 = (List) qs1.P(ap6Var3, kp6.a);
                                            if (list3 != null) {
                                                layoutNodeF = layoutNode2.F();
                                                while (true) {
                                                    if (layoutNodeF == null) {
                                                        layoutNodeF = null;
                                                    } else {
                                                        ap6VarH2 = layoutNodeF.H();
                                                        if (ap6VarH2 == null) {
                                                        }
                                                        layoutNodeF = layoutNodeF.F();
                                                    }
                                                }
                                                if (layoutNodeF == null) {
                                                    accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                                } else {
                                                    ap6VarH = layoutNodeF.H();
                                                    if (ap6VarH != null) {
                                                        objG19 = ap6VarH.m.g(kp6.l);
                                                        if (objG19 == null) {
                                                            objG19 = null;
                                                        }
                                                        zN = im3.n(objG19, Boolean.TRUE);
                                                    } else {
                                                        zN = false;
                                                    }
                                                    if (zN) {
                                                        accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                                    }
                                                }
                                            } else {
                                                layoutNodeF = layoutNode2.F();
                                                while (true) {
                                                    if (layoutNodeF == null) {
                                                        layoutNodeF = null;
                                                    } else {
                                                        ap6VarH2 = layoutNodeF.H();
                                                        if (ap6VarH2 == null) {
                                                        }
                                                        layoutNodeF = layoutNodeF.F();
                                                    }
                                                }
                                                if (layoutNodeF == null) {
                                                    accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                                } else {
                                                    ap6VarH = layoutNodeF.H();
                                                    if (ap6VarH != null) {
                                                        objG19 = ap6VarH.m.g(kp6.l);
                                                        if (objG19 == null) {
                                                            objG19 = null;
                                                        }
                                                        zN = im3.n(objG19, Boolean.TRUE);
                                                    } else {
                                                        zN = false;
                                                    }
                                                    if (zN) {
                                                        accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                                    }
                                                }
                                            }
                                        }
                                        arrayList = new ArrayList();
                                        arrayList.add("androidx.compose.ui.semantics.id");
                                        charSequenceG = g4Var3.g();
                                        if (charSequenceG != null) {
                                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                        }
                                        if (jx4Var3.c(kp6.A)) {
                                            arrayList.add("androidx.compose.ui.semantics.testTag");
                                        }
                                        if (jx4Var3.c(kp6.S)) {
                                            arrayList.add("androidx.compose.ui.semantics.shapeType");
                                            arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                                        }
                                        accessibilityNodeInfo5.setAvailableExtraData(arrayList);
                                        pt5Var = (pt5) qs1.P(ap6Var3, kp6.c);
                                        f = 0.0f;
                                        if (pt5Var != null) {
                                            np6Var4 = zo6.i;
                                            if (jx4Var3.c(np6Var4)) {
                                                g4Var3.i("android.widget.SeekBar");
                                            } else {
                                                g4Var3.i("android.widget.ProgressBar");
                                            }
                                            if (pt5Var != pt5.b) {
                                                accessibilityNodeInfo5.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                                            }
                                            if (jx4Var3.c(np6Var4)) {
                                                vn4.c0(fp6Var);
                                            }
                                        }
                                        if (vn4.c0(fp6Var)) {
                                            g4Var3.b(new a4(android.R.id.accessibilityActionSetProgress, m3Var7.a));
                                        }
                                        ga0.w(g4Var3, fp6Var);
                                        objG11 = fp6Var.k().m.g(kp6.g);
                                        if (objG11 == null) {
                                            objG11 = null;
                                        }
                                        if (objG11 == null) {
                                            fp6VarL3 = fp6Var.l();
                                            if (fp6VarL3 == null) {
                                                f2 = 0.0f;
                                            } else {
                                                objG16 = fp6VarL3.k().m.g(kp6.e);
                                                if (objG16 == null) {
                                                    objG16 = null;
                                                }
                                                if (objG16 != null) {
                                                    objG17 = fp6VarL3.k().m.g(kp6.f);
                                                    if (objG17 == null) {
                                                        objG17 = null;
                                                    }
                                                    iv0Var = (iv0) objG17;
                                                    if (iv0Var == null) {
                                                        if (fp6Var.k().m.c(kp6.K)) {
                                                            arrayList3 = new ArrayList();
                                                            listI2 = fp6VarL3.i((4 & 1) != 0 ? !fp6VarL3.b : false, (4 & 2) == 0);
                                                            size3 = listI2.size();
                                                            i13 = 0;
                                                            i14 = 0;
                                                            while (i13 < size3) {
                                                                fp6Var2 = (fp6) listI2.get(i13);
                                                                float f6 = f;
                                                                if (fp6Var2.k().m.c(kp6.K)) {
                                                                    arrayList3.add(fp6Var2);
                                                                    if (fp6Var2.c.G() < fp6Var.c.G()) {
                                                                        i14++;
                                                                    }
                                                                }
                                                                i13++;
                                                                f = f6;
                                                            }
                                                            f2 = f;
                                                            if (!arrayList3.isEmpty()) {
                                                                zI2 = ga0.i(arrayList3);
                                                                if (zI2) {
                                                                    i15 = 0;
                                                                } else {
                                                                    i15 = i14;
                                                                }
                                                                if (!zI2) {
                                                                    i14 = 0;
                                                                }
                                                                objG18 = fp6Var.k().m.g(kp6.K);
                                                                if (objG18 == null) {
                                                                    objG18 = Boolean.FALSE;
                                                                }
                                                                g4Var3.j(f4.c(((Boolean) objG18).booleanValue(), i15, 1, i14, 1));
                                                            }
                                                        } else {
                                                            f2 = 0.0f;
                                                        }
                                                    } else if (fp6Var.k().m.c(kp6.K)) {
                                                        f2 = 0.0f;
                                                    } else {
                                                        arrayList3 = new ArrayList();
                                                        listI2 = fp6VarL3.i((4 & 1) != 0 ? !fp6VarL3.b : false, (4 & 2) == 0);
                                                        size3 = listI2.size();
                                                        i13 = 0;
                                                        i14 = 0;
                                                        while (i13 < size3) {
                                                            fp6Var2 = (fp6) listI2.get(i13);
                                                            float f7 = f;
                                                            if (fp6Var2.k().m.c(kp6.K)) {
                                                                arrayList3.add(fp6Var2);
                                                                if (fp6Var2.c.G() < fp6Var.c.G()) {
                                                                    i14++;
                                                                }
                                                            }
                                                            i13++;
                                                            f = f7;
                                                        }
                                                        f2 = f;
                                                        if (!arrayList3.isEmpty()) {
                                                            zI2 = ga0.i(arrayList3);
                                                            if (zI2) {
                                                                i15 = 0;
                                                            } else {
                                                                i15 = i14;
                                                            }
                                                            if (!zI2) {
                                                                i14 = 0;
                                                            }
                                                            objG18 = fp6Var.k().m.g(kp6.K);
                                                            if (objG18 == null) {
                                                                objG18 = Boolean.FALSE;
                                                            }
                                                            g4Var3.j(f4.c(((Boolean) objG18).booleanValue(), i15, 1, i14, 1));
                                                        }
                                                    }
                                                } else {
                                                    f2 = 0.0f;
                                                }
                                            }
                                        } else {
                                            f2 = 0.0f;
                                            io.sentry.h2.f();
                                        }
                                        rj6Var = (rj6) qs1.P(ap6Var3, kp6.v);
                                        m3 m3Var15 = (m3) qs1.P(ap6Var3, zo6.d);
                                        if (rj6Var != null) {
                                            objG14 = fp6Var.k().m.g(kp6.f);
                                            if (objG14 == null) {
                                                objG14 = null;
                                            }
                                            if (objG14 == null) {
                                                objG15 = fp6Var.k().m.g(kp6.e);
                                                if (objG15 == null) {
                                                    objG15 = null;
                                                }
                                                if (objG15 == null) {
                                                    g4Var3.i("android.widget.HorizontalScrollView");
                                                }
                                            }
                                            if (((Number) rj6Var.b.a()).floatValue() > f2) {
                                                accessibilityNodeInfo4.setScrollable(true);
                                            }
                                            if (vn4.c0(fp6Var)) {
                                                z3 = bh.z(rj6Var);
                                                j04Var = j04.n;
                                                if (z3) {
                                                    g4Var3.b(a4.h);
                                                    layoutNode = layoutNode2;
                                                    if (layoutNode.M == j04Var) {
                                                        a4Var2 = a4.f292o;
                                                    } else {
                                                        a4Var2 = a4.q;
                                                    }
                                                    g4Var3.b(a4Var2);
                                                } else {
                                                    layoutNode = layoutNode2;
                                                }
                                                if (bh.y(rj6Var)) {
                                                    g4Var3.b(a4.i);
                                                    if (layoutNode.M == j04Var) {
                                                        a4Var = a4.q;
                                                    } else {
                                                        a4Var = a4.f292o;
                                                    }
                                                    g4Var3.b(a4Var);
                                                }
                                            }
                                        }
                                        rj6Var2 = (rj6) qs1.P(ap6Var3, kp6.w);
                                        if (rj6Var2 != null) {
                                            objG12 = fp6Var.k().m.g(kp6.f);
                                            if (objG12 == null) {
                                                objG12 = null;
                                            }
                                            if (objG12 == null) {
                                                objG13 = fp6Var.k().m.g(kp6.e);
                                                if (objG13 == null) {
                                                    objG13 = null;
                                                }
                                                if (objG13 == null) {
                                                    g4Var3.i("android.widget.ScrollView");
                                                }
                                            }
                                            if (((Number) rj6Var2.b.a()).floatValue() > f2) {
                                                accessibilityNodeInfo4.setScrollable(true);
                                            }
                                            if (vn4.c0(fp6Var)) {
                                                if (bh.z(rj6Var2)) {
                                                    g4Var3.b(a4.h);
                                                    g4Var3.b(a4.p);
                                                }
                                                if (bh.y(rj6Var2)) {
                                                    g4Var3.b(a4.i);
                                                    g4Var3.b(a4.n);
                                                }
                                            }
                                        }
                                        i7 = Build.VERSION.SDK_INT;
                                        if (i7 >= 29) {
                                            im3.m(g4Var3, fp6Var);
                                        }
                                        charSequence = (CharSequence) qs1.P(ap6Var3, kp6.d);
                                        if (i7 >= 28) {
                                            accessibilityNodeInfo4.setPaneTitle(charSequence);
                                        } else {
                                            accessibilityNodeInfo4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                        }
                                        if (vn4.c0(fp6Var)) {
                                            m3Var4 = (m3) qs1.P(ap6Var3, zo6.t);
                                            if (m3Var4 != null) {
                                                g4Var3.b(new a4(262144, m3Var4.a));
                                            }
                                            m3Var5 = (m3) qs1.P(ap6Var3, zo6.u);
                                            if (m3Var5 != null) {
                                                g4Var3.b(new a4(524288, m3Var5.a));
                                            }
                                            m3Var6 = (m3) qs1.P(ap6Var3, zo6.v);
                                            if (m3Var6 != null) {
                                                g4Var3.b(new a4(1048576, m3Var6.a));
                                            }
                                            np6Var3 = zo6.x;
                                            if (jx4Var3.c(np6Var3)) {
                                                list2 = (List) ap6Var3.b(np6Var3);
                                                size2 = list2.size();
                                                jw4Var = bh.Z;
                                                i8 = jw4Var.b;
                                                if (size2 < i8) {
                                                    n77 n77Var6 = new n77(0);
                                                    vw4 vw4VarA3 = h65.a();
                                                    n77Var3 = n77Var2;
                                                    if (j51.s(n77Var3.f1550o, i6, n77Var3.m) >= 0) {
                                                        vw4Var = (vw4) ck3.u(n77Var3, i6);
                                                        iArr = jw4Var.a;
                                                        i9 = jw4Var.b;
                                                        iArrCopyOf = new int[16];
                                                        i10 = 0;
                                                        i11 = 0;
                                                        while (i10 < i9) {
                                                            int i48 = iArr[i10];
                                                            int i49 = i9;
                                                            i12 = i11 + 1;
                                                            int i410 = i10;
                                                            if (iArrCopyOf.length < i12) {
                                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i12, (iArrCopyOf.length * 3) / 2));
                                                            }
                                                            iArrCopyOf[i11] = i48;
                                                            i10 = i410 + 1;
                                                            i11 = i12;
                                                            i9 = i49;
                                                        }
                                                        arrayList2 = new ArrayList();
                                                        if (list2.size() <= 0) {
                                                            ua5.u(list2.get(0));
                                                            vw4Var.getClass();
                                                            throw null;
                                                        }
                                                        if (arrayList2.size() > 0) {
                                                            ua5.u(arrayList2.get(0));
                                                            if (i11 <= 0) {
                                                                int i411 = iArrCopyOf[0];
                                                                throw null;
                                                            }
                                                            hk0.r("Index must be between 0 and size");
                                                        }
                                                    } else if (list2.size() > 0) {
                                                        ua5.u(list2.get(0));
                                                        jw4Var.c(0);
                                                        throw null;
                                                    }
                                                    bhVar.D.c(i6, n77Var6);
                                                    n77Var3.c(i6, vw4VarA3);
                                                } else {
                                                    hk0.l(fx3.f(i8, "Can't have more than ", " custom actions for one widget"));
                                                }
                                                return null;
                                            }
                                        }
                                        zH0 = vn4.h0(fp6Var, resources);
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            accessibilityNodeInfo4.setScreenReaderFocusable(zH0);
                                        } else {
                                            g4Var3.h(1, zH0);
                                        }
                                        iD = bhVar.N.d(i6);
                                        if (iD != -1) {
                                            xlVarN2 = bt1.N(androidComposeView2.getAndroidViewsHandler$ui(), iD);
                                            if (xlVarN2 != null) {
                                                accessibilityNodeInfo4.setTraversalBefore(xlVarN2);
                                                androidComposeView = androidComposeView2;
                                            } else {
                                                androidComposeView = androidComposeView2;
                                                accessibilityNodeInfo4.setTraversalBefore(androidComposeView, iD);
                                            }
                                            bundle = null;
                                            bhVar.j(i6, g4Var3, bhVar.P, null);
                                        } else {
                                            bundle = null;
                                            androidComposeView = androidComposeView2;
                                        }
                                        iD2 = bhVar.O.d(i6);
                                        if (iD2 != -1) {
                                            accessibilityNodeInfo4.setTraversalAfter(xlVarN);
                                            bhVar.j(i6, g4Var3, bhVar.Q, bundle);
                                        }
                                        str3 = (String) qs1.P(ap6Var3, pm8.t);
                                        if (str3 != null) {
                                            g4Var3.i(str3);
                                        }
                                        g4Var4 = g4Var3;
                                    } else {
                                        bhVar = bhVar2;
                                    }
                                    z2 = true;
                                    accessibilityNodeInfo4.setVisibleToUser(db8.Q(fp6Var) ^ z2);
                                    if (fp6Var.n()) {
                                        fp6VarL2 = fp6Var.l();
                                        fp6VarL2.getClass();
                                    } else {
                                        fp6VarL2 = fp6Var;
                                    }
                                    if (fp6VarL2.m().f()) {
                                        accessibilityNodeInfo4.setVisibleToUser(false);
                                    }
                                    objG10 = jx4Var3.g(kp6.k);
                                    if (objG10 == null) {
                                        objG10 = null;
                                    }
                                    qc4Var = (qc4) objG10;
                                    if (qc4Var != null) {
                                        z6 = qc4Var.a;
                                        if (z6) {
                                            i16 = 1;
                                        } else {
                                            i16 = 2;
                                        }
                                        accessibilityNodeInfo5.setLiveRegion(i16);
                                    }
                                    accessibilityNodeInfo4.setClickable(false);
                                    m3Var = (m3) qs1.P(ap6Var3, zo6.b);
                                    if (m3Var != null) {
                                        boolean zN7 = im3.n(qs1.P(ap6Var3, kp6.K), bool2);
                                        if (pe6Var3 == null) {
                                        }
                                        if (z4) {
                                            z5 = true;
                                        } else {
                                            z5 = true;
                                        }
                                        accessibilityNodeInfo4.setClickable(z5);
                                        if (vn4.c0(fp6Var)) {
                                            g4Var3.b(new a4(16, m3Var.a));
                                        }
                                    }
                                    accessibilityNodeInfo4.setLongClickable(false);
                                    m3Var2 = (m3) qs1.P(ap6Var3, zo6.c);
                                    if (m3Var2 != null) {
                                        accessibilityNodeInfo4.setLongClickable(true);
                                        if (vn4.c0(fp6Var)) {
                                            g4Var3.b(new a4(32, m3Var2.a));
                                        }
                                    }
                                    m3Var3 = (m3) qs1.P(ap6Var3, zo6.q);
                                    if (m3Var3 != null) {
                                        g4Var3.b(new a4(16384, m3Var3.a));
                                    }
                                    if (vn4.c0(fp6Var)) {
                                        m3Var9 = (m3) qs1.P(ap6Var3, zo6.k);
                                        if (m3Var9 != null) {
                                            g4Var3.b(new a4(2097152, m3Var9.a));
                                        }
                                        m3Var10 = (m3) qs1.P(ap6Var3, zo6.p);
                                        if (m3Var10 != null) {
                                            g4Var3.b(new a4(android.R.id.accessibilityActionImeEnter, m3Var10.a));
                                        }
                                        m3Var11 = (m3) qs1.P(ap6Var3, zo6.r);
                                        if (m3Var11 != null) {
                                            g4Var3.b(new a4(65536, m3Var11.a));
                                        }
                                        m3Var12 = (m3) qs1.P(ap6Var3, zo6.s);
                                        if (m3Var12 != null) {
                                            primaryClipDescription = ((cj3) androidComposeView2.getClipboardManager()).F().getPrimaryClipDescription();
                                            if (primaryClipDescription != null) {
                                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                            } else {
                                                zHasMimeType = false;
                                            }
                                            if (zHasMimeType) {
                                                g4Var3.b(new a4(32768, m3Var12.a));
                                            }
                                        }
                                    }
                                    strT = bh.t(fp6Var);
                                    if (strT != null) {
                                        accessibilityNodeInfo5.setTextSelection(bhVar.r(fp6Var), bhVar.q(fp6Var));
                                        m3Var8 = (m3) qs1.P(ap6Var3, zo6.j);
                                        if (m3Var8 != null) {
                                            str4 = m3Var8.a;
                                        } else {
                                            str4 = null;
                                        }
                                        g4Var3.b(new a4(131072, str4));
                                        g4Var3.a(256);
                                        g4Var3.a(512);
                                        accessibilityNodeInfo4.setMovementGranularities(11);
                                        list3 = (List) qs1.P(ap6Var3, kp6.a);
                                        if (list3 != null) {
                                            layoutNodeF = layoutNode2.F();
                                            while (true) {
                                                if (layoutNodeF == null) {
                                                    layoutNodeF = null;
                                                } else {
                                                    ap6VarH2 = layoutNodeF.H();
                                                    if (ap6VarH2 == null) {
                                                    }
                                                    layoutNodeF = layoutNodeF.F();
                                                }
                                            }
                                            if (layoutNodeF == null) {
                                                accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                            } else {
                                                ap6VarH = layoutNodeF.H();
                                                if (ap6VarH != null) {
                                                    objG19 = ap6VarH.m.g(kp6.l);
                                                    if (objG19 == null) {
                                                        objG19 = null;
                                                    }
                                                    zN = im3.n(objG19, Boolean.TRUE);
                                                } else {
                                                    zN = false;
                                                }
                                                if (zN) {
                                                    accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                                }
                                            }
                                        } else {
                                            layoutNodeF = layoutNode2.F();
                                            while (true) {
                                                if (layoutNodeF == null) {
                                                    layoutNodeF = null;
                                                } else {
                                                    ap6VarH2 = layoutNodeF.H();
                                                    if (ap6VarH2 == null) {
                                                    }
                                                    layoutNodeF = layoutNodeF.F();
                                                }
                                            }
                                            if (layoutNodeF == null) {
                                                accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                            } else {
                                                ap6VarH = layoutNodeF.H();
                                                if (ap6VarH != null) {
                                                    objG19 = ap6VarH.m.g(kp6.l);
                                                    if (objG19 == null) {
                                                        objG19 = null;
                                                    }
                                                    zN = im3.n(objG19, Boolean.TRUE);
                                                } else {
                                                    zN = false;
                                                }
                                                if (zN) {
                                                    accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                                }
                                            }
                                        }
                                    }
                                    arrayList = new ArrayList();
                                    arrayList.add("androidx.compose.ui.semantics.id");
                                    charSequenceG = g4Var3.g();
                                    if (charSequenceG != null) {
                                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                    }
                                    if (jx4Var3.c(kp6.A)) {
                                        arrayList.add("androidx.compose.ui.semantics.testTag");
                                    }
                                    if (jx4Var3.c(kp6.S)) {
                                        arrayList.add("androidx.compose.ui.semantics.shapeType");
                                        arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                        arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                        arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                                    }
                                    accessibilityNodeInfo5.setAvailableExtraData(arrayList);
                                    pt5Var = (pt5) qs1.P(ap6Var3, kp6.c);
                                    f = 0.0f;
                                    if (pt5Var != null) {
                                        np6Var4 = zo6.i;
                                        if (jx4Var3.c(np6Var4)) {
                                            g4Var3.i("android.widget.SeekBar");
                                        } else {
                                            g4Var3.i("android.widget.ProgressBar");
                                        }
                                        if (pt5Var != pt5.b) {
                                            accessibilityNodeInfo5.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                                        }
                                        if (jx4Var3.c(np6Var4)) {
                                            vn4.c0(fp6Var);
                                        }
                                    }
                                    if (vn4.c0(fp6Var)) {
                                        g4Var3.b(new a4(android.R.id.accessibilityActionSetProgress, m3Var7.a));
                                    }
                                    ga0.w(g4Var3, fp6Var);
                                    objG11 = fp6Var.k().m.g(kp6.g);
                                    if (objG11 == null) {
                                        objG11 = null;
                                    }
                                    if (objG11 == null) {
                                        fp6VarL3 = fp6Var.l();
                                        if (fp6VarL3 == null) {
                                            f2 = 0.0f;
                                        } else {
                                            objG16 = fp6VarL3.k().m.g(kp6.e);
                                            if (objG16 == null) {
                                                objG16 = null;
                                            }
                                            if (objG16 != null) {
                                                objG17 = fp6VarL3.k().m.g(kp6.f);
                                                if (objG17 == null) {
                                                    objG17 = null;
                                                }
                                                iv0Var = (iv0) objG17;
                                                if (iv0Var == null) {
                                                    if (fp6Var.k().m.c(kp6.K)) {
                                                        f2 = 0.0f;
                                                    } else {
                                                        arrayList3 = new ArrayList();
                                                        listI2 = fp6VarL3.i((4 & 1) != 0 ? !fp6VarL3.b : false, (4 & 2) == 0);
                                                        size3 = listI2.size();
                                                        i13 = 0;
                                                        i14 = 0;
                                                        while (i13 < size3) {
                                                            fp6Var2 = (fp6) listI2.get(i13);
                                                            float f8 = f;
                                                            if (fp6Var2.k().m.c(kp6.K)) {
                                                                arrayList3.add(fp6Var2);
                                                                if (fp6Var2.c.G() < fp6Var.c.G()) {
                                                                    i14++;
                                                                }
                                                            }
                                                            i13++;
                                                            f = f8;
                                                        }
                                                        f2 = f;
                                                        if (!arrayList3.isEmpty()) {
                                                            zI2 = ga0.i(arrayList3);
                                                            if (zI2) {
                                                                i15 = 0;
                                                            } else {
                                                                i15 = i14;
                                                            }
                                                            if (!zI2) {
                                                                i14 = 0;
                                                            }
                                                            objG18 = fp6Var.k().m.g(kp6.K);
                                                            if (objG18 == null) {
                                                                objG18 = Boolean.FALSE;
                                                            }
                                                            g4Var3.j(f4.c(((Boolean) objG18).booleanValue(), i15, 1, i14, 1));
                                                        }
                                                    }
                                                } else if (fp6Var.k().m.c(kp6.K)) {
                                                    f2 = 0.0f;
                                                } else {
                                                    arrayList3 = new ArrayList();
                                                    listI2 = fp6VarL3.i((4 & 1) != 0 ? !fp6VarL3.b : false, (4 & 2) == 0);
                                                    size3 = listI2.size();
                                                    i13 = 0;
                                                    i14 = 0;
                                                    while (i13 < size3) {
                                                        fp6Var2 = (fp6) listI2.get(i13);
                                                        float f9 = f;
                                                        if (fp6Var2.k().m.c(kp6.K)) {
                                                            arrayList3.add(fp6Var2);
                                                            if (fp6Var2.c.G() < fp6Var.c.G()) {
                                                                i14++;
                                                            }
                                                        }
                                                        i13++;
                                                        f = f9;
                                                    }
                                                    f2 = f;
                                                    if (!arrayList3.isEmpty()) {
                                                        zI2 = ga0.i(arrayList3);
                                                        if (zI2) {
                                                            i15 = 0;
                                                        } else {
                                                            i15 = i14;
                                                        }
                                                        if (!zI2) {
                                                            i14 = 0;
                                                        }
                                                        objG18 = fp6Var.k().m.g(kp6.K);
                                                        if (objG18 == null) {
                                                            objG18 = Boolean.FALSE;
                                                        }
                                                        g4Var3.j(f4.c(((Boolean) objG18).booleanValue(), i15, 1, i14, 1));
                                                    }
                                                }
                                            } else {
                                                f2 = 0.0f;
                                            }
                                        }
                                    } else {
                                        f2 = 0.0f;
                                        io.sentry.h2.f();
                                    }
                                    rj6Var = (rj6) qs1.P(ap6Var3, kp6.v);
                                    m3 m3Var16 = (m3) qs1.P(ap6Var3, zo6.d);
                                    if (rj6Var != null) {
                                        objG14 = fp6Var.k().m.g(kp6.f);
                                        if (objG14 == null) {
                                            objG14 = null;
                                        }
                                        if (objG14 == null) {
                                            objG15 = fp6Var.k().m.g(kp6.e);
                                            if (objG15 == null) {
                                                objG15 = null;
                                            }
                                            if (objG15 == null) {
                                                g4Var3.i("android.widget.HorizontalScrollView");
                                            }
                                        }
                                        if (((Number) rj6Var.b.a()).floatValue() > f2) {
                                            accessibilityNodeInfo4.setScrollable(true);
                                        }
                                        if (vn4.c0(fp6Var)) {
                                            z3 = bh.z(rj6Var);
                                            j04Var = j04.n;
                                            if (z3) {
                                                g4Var3.b(a4.h);
                                                layoutNode = layoutNode2;
                                                if (layoutNode.M == j04Var) {
                                                    a4Var2 = a4.f292o;
                                                } else {
                                                    a4Var2 = a4.q;
                                                }
                                                g4Var3.b(a4Var2);
                                            } else {
                                                layoutNode = layoutNode2;
                                            }
                                            if (bh.y(rj6Var)) {
                                                g4Var3.b(a4.i);
                                                if (layoutNode.M == j04Var) {
                                                    a4Var = a4.q;
                                                } else {
                                                    a4Var = a4.f292o;
                                                }
                                                g4Var3.b(a4Var);
                                            }
                                        }
                                    }
                                    rj6Var2 = (rj6) qs1.P(ap6Var3, kp6.w);
                                    if (rj6Var2 != null) {
                                        objG12 = fp6Var.k().m.g(kp6.f);
                                        if (objG12 == null) {
                                            objG12 = null;
                                        }
                                        if (objG12 == null) {
                                            objG13 = fp6Var.k().m.g(kp6.e);
                                            if (objG13 == null) {
                                                objG13 = null;
                                            }
                                            if (objG13 == null) {
                                                g4Var3.i("android.widget.ScrollView");
                                            }
                                        }
                                        if (((Number) rj6Var2.b.a()).floatValue() > f2) {
                                            accessibilityNodeInfo4.setScrollable(true);
                                        }
                                        if (vn4.c0(fp6Var)) {
                                            if (bh.z(rj6Var2)) {
                                                g4Var3.b(a4.h);
                                                g4Var3.b(a4.p);
                                            }
                                            if (bh.y(rj6Var2)) {
                                                g4Var3.b(a4.i);
                                                g4Var3.b(a4.n);
                                            }
                                        }
                                    }
                                    i7 = Build.VERSION.SDK_INT;
                                    if (i7 >= 29) {
                                        im3.m(g4Var3, fp6Var);
                                    }
                                    charSequence = (CharSequence) qs1.P(ap6Var3, kp6.d);
                                    if (i7 >= 28) {
                                        accessibilityNodeInfo4.setPaneTitle(charSequence);
                                    } else {
                                        accessibilityNodeInfo4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                    }
                                    if (vn4.c0(fp6Var)) {
                                        m3Var4 = (m3) qs1.P(ap6Var3, zo6.t);
                                        if (m3Var4 != null) {
                                            g4Var3.b(new a4(262144, m3Var4.a));
                                        }
                                        m3Var5 = (m3) qs1.P(ap6Var3, zo6.u);
                                        if (m3Var5 != null) {
                                            g4Var3.b(new a4(524288, m3Var5.a));
                                        }
                                        m3Var6 = (m3) qs1.P(ap6Var3, zo6.v);
                                        if (m3Var6 != null) {
                                            g4Var3.b(new a4(1048576, m3Var6.a));
                                        }
                                        np6Var3 = zo6.x;
                                        if (jx4Var3.c(np6Var3)) {
                                            list2 = (List) ap6Var3.b(np6Var3);
                                            size2 = list2.size();
                                            jw4Var = bh.Z;
                                            i8 = jw4Var.b;
                                            if (size2 < i8) {
                                                n77 n77Var7 = new n77(0);
                                                vw4 vw4VarA4 = h65.a();
                                                n77Var3 = n77Var2;
                                                if (j51.s(n77Var3.f1550o, i6, n77Var3.m) >= 0) {
                                                    vw4Var = (vw4) ck3.u(n77Var3, i6);
                                                    iArr = jw4Var.a;
                                                    i9 = jw4Var.b;
                                                    iArrCopyOf = new int[16];
                                                    i10 = 0;
                                                    i11 = 0;
                                                    while (i10 < i9) {
                                                        int i412 = iArr[i10];
                                                        int i413 = i9;
                                                        i12 = i11 + 1;
                                                        int i414 = i10;
                                                        if (iArrCopyOf.length < i12) {
                                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i12, (iArrCopyOf.length * 3) / 2));
                                                        }
                                                        iArrCopyOf[i11] = i412;
                                                        i10 = i414 + 1;
                                                        i11 = i12;
                                                        i9 = i413;
                                                    }
                                                    arrayList2 = new ArrayList();
                                                    if (list2.size() <= 0) {
                                                        ua5.u(list2.get(0));
                                                        vw4Var.getClass();
                                                        throw null;
                                                    }
                                                    if (arrayList2.size() > 0) {
                                                        ua5.u(arrayList2.get(0));
                                                        if (i11 <= 0) {
                                                            int i415 = iArrCopyOf[0];
                                                            throw null;
                                                        }
                                                        hk0.r("Index must be between 0 and size");
                                                    }
                                                } else if (list2.size() > 0) {
                                                    ua5.u(list2.get(0));
                                                    jw4Var.c(0);
                                                    throw null;
                                                }
                                                bhVar.D.c(i6, n77Var7);
                                                n77Var3.c(i6, vw4VarA4);
                                            } else {
                                                hk0.l(fx3.f(i8, "Can't have more than ", " custom actions for one widget"));
                                            }
                                            return null;
                                        }
                                    }
                                    zH0 = vn4.h0(fp6Var, resources);
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        accessibilityNodeInfo4.setScreenReaderFocusable(zH0);
                                    } else {
                                        g4Var3.h(1, zH0);
                                    }
                                    iD = bhVar.N.d(i6);
                                    if (iD != -1) {
                                        xlVarN2 = bt1.N(androidComposeView2.getAndroidViewsHandler$ui(), iD);
                                        if (xlVarN2 != null) {
                                            accessibilityNodeInfo4.setTraversalBefore(xlVarN2);
                                            androidComposeView = androidComposeView2;
                                        } else {
                                            androidComposeView = androidComposeView2;
                                            accessibilityNodeInfo4.setTraversalBefore(androidComposeView, iD);
                                        }
                                        bundle = null;
                                        bhVar.j(i6, g4Var3, bhVar.P, null);
                                    } else {
                                        bundle = null;
                                        androidComposeView = androidComposeView2;
                                    }
                                    iD2 = bhVar.O.d(i6);
                                    if (iD2 != -1) {
                                        accessibilityNodeInfo4.setTraversalAfter(xlVarN);
                                        bhVar.j(i6, g4Var3, bhVar.Q, bundle);
                                    }
                                    str3 = (String) qs1.P(ap6Var3, pm8.t);
                                    if (str3 != null) {
                                        g4Var3.i(str3);
                                    }
                                    g4Var4 = g4Var3;
                                }
                            }
                        } else {
                            bhVar = bhVar2;
                            i6 = i;
                            g4Var4 = null;
                        }
                    }
                }
                if (!bhVar.A) {
                    return g4Var4;
                }
                if (i6 == bhVar.w) {
                    bhVar.y = g4Var4;
                }
                if (i6 != bhVar.x) {
                    return g4Var4;
                }
                bhVar.z = g4Var4;
                return g4Var4;
            default:
                return new g4(AccessibilityNodeInfo.obtain(((rf2) p3Var).o(i).a));
        }
    }

    @Override // o.df6
    public final g4 o(int i) {
        byte b = this.t;
        p3 p3Var = this.u;
        switch (b) {
            case 0:
                bh bhVar = (bh) p3Var;
                if (i != 1) {
                    if (i == 2) {
                        return k(bhVar.w);
                    }
                    hk0.g(fx3.e(i, "Unknown focus type: "));
                    return null;
                }
                int i2 = bhVar.x;
                if (i2 == Integer.MIN_VALUE) {
                    return null;
                }
                return k(i2);
            default:
                rf2 rf2Var = (rf2) p3Var;
                int i3 = i == 2 ? rf2Var.w : rf2Var.x;
                if (i3 == Integer.MIN_VALUE) {
                    return null;
                }
                return k(i3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:127:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:187:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:293:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:294:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:297:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:298:0x04db  */
    /* JADX WARN: Code duplicated, block: B:301:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:302:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:305:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:306:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:309:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:310:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:313:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:314:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:321:0x0507  */
    /* JADX WARN: Code duplicated, block: B:328:0x0513  */
    /* JADX WARN: Code duplicated, block: B:331:0x0518  */
    /* JADX WARN: Code duplicated, block: B:333:0x0520  */
    /* JADX WARN: Code duplicated, block: B:336:0x052b  */
    /* JADX WARN: Code duplicated, block: B:339:0x0530 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:346:0x0551  */
    /* JADX WARN: Code duplicated, block: B:348:0x056c  */
    /* JADX WARN: Code duplicated, block: B:351:0x0571  */
    /* JADX WARN: Code duplicated, block: B:356:0x058b  */
    /* JADX WARN: Code duplicated, block: B:359:0x0594  */
    /* JADX WARN: Code duplicated, block: B:363:0x059b  */
    /* JADX WARN: Code duplicated, block: B:365:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:368:0x05aa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:406:0x062c  */
    /* JADX WARN: Code duplicated, block: B:409:0x0638  */
    /* JADX WARN: Code duplicated, block: B:412:0x063d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:414:0x0641  */
    /* JADX WARN: Code duplicated, block: B:415:0x0646  */
    /* JADX WARN: Code duplicated, block: B:417:0x064f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:418:0x0651  */
    /* JADX WARN: Code duplicated, block: B:421:0x0658  */
    /* JADX WARN: Code duplicated, block: B:423:0x0660  */
    /* JADX WARN: Code duplicated, block: B:429:0x067d  */
    /* JADX WARN: Code duplicated, block: B:431:0x0681  */
    /* JADX WARN: Code duplicated, block: B:433:0x0689  */
    /* JADX WARN: Code duplicated, block: B:434:0x068b  */
    /* JADX WARN: Code duplicated, block: B:436:0x068f  */
    /* JADX WARN: Code duplicated, block: B:438:0x0695  */
    /* JADX WARN: Code duplicated, block: B:439:0x0697  */
    /* JADX WARN: Code duplicated, block: B:442:0x069c  */
    /* JADX WARN: Code duplicated, block: B:504:0x078d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:505:0x078f  */
    /* JADX WARN: Code duplicated, block: B:507:0x079d  */
    /* JADX WARN: Code duplicated, block: B:508:0x079f  */
    /* JADX WARN: Code duplicated, block: B:511:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:512:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:518:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:523:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:535:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00de  */
    /* JADX WARN: Code duplicated, block: B:540:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:547:0x0805  */
    /* JADX WARN: Code duplicated, block: B:549:0x0809  */
    /* JADX WARN: Code duplicated, block: B:551:0x0817  */
    /* JADX WARN: Code duplicated, block: B:553:0x081b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:565:0x087c  */
    /* JADX WARN: Code duplicated, block: B:567:0x0883 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:568:0x0885  */
    /* JADX WARN: Code duplicated, block: B:569:0x0887  */
    /* JADX WARN: Code duplicated, block: B:571:0x088d  */
    /* JADX WARN: Code duplicated, block: B:572:0x0892  */
    /* JADX WARN: Code duplicated, block: B:575:0x089a  */
    /* JADX WARN: Code duplicated, block: B:577:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:589:0x08ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:590:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:591:0x08cf  */
    /* JADX WARN: Code duplicated, block: B:594:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:595:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:598:0x08f2  */
    /* JADX WARN: Code duplicated, block: B:600:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:602:0x090c  */
    /* JADX WARN: Code duplicated, block: B:611:0x0927  */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x0245, code lost:
    
        r1 = null;
     */
    @Override // o.df6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(int r28, int r29, android.os.Bundle r30) {
        /*
            Method dump skipped, instruction units count: 2444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.xg.v(int, int, android.os.Bundle):boolean");
    }
}
