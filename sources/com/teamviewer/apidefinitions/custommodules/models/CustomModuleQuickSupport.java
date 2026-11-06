package com.teamviewer.apidefinitions.custommodules.models;

import java.time.OffsetDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.im3;
import o.sp3;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bn\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010%\u001a\u0004\u0018\u00010&\u0012\u0010\b\u0003\u0010'\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010(\u0012\n\b\u0003\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u00100\u001a\u0004\u0018\u000101\u0012\n\b\u0003\u00102\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u00103\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u00104\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0003\u00105\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010(\u0012\u0010\b\u0003\u00106\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010(\u0012\n\b\u0003\u00107\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b8\u00109J\t\u0010r\u001a\u00020\u0003HÆ\u0003J\t\u0010s\u001a\u00020\u0005HÆ\u0003J\t\u0010t\u001a\u00020\u0007HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010x\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010EJ\u000b\u0010y\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010|\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010EJ\u000b\u0010}\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010XJ\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010\u008c\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010EJ\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010&HÆ\u0003J\u0012\u0010\u008e\u0001\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010(HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010*HÆ\u0003J\u0011\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010XJ\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\u0092\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010EJ\u0011\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010XJ\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u000101HÆ\u0003J\u0011\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010XJ\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u0099\u0001\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010(HÆ\u0003J\u0012\u0010\u009a\u0001\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010(HÆ\u0003J\u0011\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010XJ\u0094\u0004\u0010\u009c\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010%\u001a\u0004\u0018\u00010&2\u0010\b\u0003\u0010'\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010(2\n\b\u0003\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\t2\n\b\u0003\u00100\u001a\u0004\u0018\u0001012\n\b\u0003\u00102\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u00103\u001a\u0004\u0018\u00010\t2\n\b\u0003\u00104\u001a\u0004\u0018\u00010\t2\u0010\b\u0003\u00105\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010(2\u0010\b\u0003\u00106\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010(2\n\b\u0003\u00107\u001a\u0004\u0018\u00010\u001fHÆ\u0001¢\u0006\u0003\u0010\u009d\u0001J\u0016\u0010\u009e\u0001\u001a\u00020\u001f2\n\u0010\u009f\u0001\u001a\u0005\u0018\u00010 \u0001HÖ\u0003J\n\u0010¡\u0001\u001a\u00020\rHÖ\u0001J\n\u0010¢\u0001\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0016\u0010\n\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010AR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010AR\u0018\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\n\n\u0002\u0010F\u001a\u0004\bD\u0010ER\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010AR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010AR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\n\n\u0002\u0010F\u001a\u0004\bK\u0010ER\u0016\u0010\u0013\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010AR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010AR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010AR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010AR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010AR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010AR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010AR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010AR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010AR\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010Y\u001a\u0004\bW\u0010XR\u0015\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010Y\u001a\u0004\bZ\u0010XR\u0015\u0010!\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010Y\u001a\u0004\b[\u0010XR\u0013\u0010\"\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010AR\u0015\u0010#\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010Y\u001a\u0004\b]\u0010XR\u0015\u0010$\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010F\u001a\u0004\b^\u0010ER\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0019\u0010'\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0013\u0010)\u001a\u0004\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0015\u0010+\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010Y\u001a\u0004\be\u0010XR\u0013\u0010,\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bf\u0010AR\u0015\u0010-\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010F\u001a\u0004\bg\u0010ER\u0015\u0010.\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010Y\u001a\u0004\bh\u0010XR\u0013\u0010/\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bi\u0010AR\u0013\u00100\u001a\u0004\u0018\u000101¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0015\u00102\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010Y\u001a\u0004\bl\u0010XR\u0013\u00103\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bm\u0010AR\u0013\u00104\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bn\u0010AR\u0019\u00105\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\bo\u0010bR\u0019\u00106\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\bp\u0010bR\u0015\u00107\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010Y\u001a\u0004\bq\u0010X¨\u0006£\u0001"}, d2 = {"Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleQuickSupport;", "Lcom/teamviewer/apidefinitions/custommodules/models/CustomModule;", "moduleType", "Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleType;", "editorVersion", "Lcom/teamviewer/apidefinitions/custommodules/models/EditorVersion;", "status", "Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleStatus;", "moduleId", "", "name", "owner", "ownerId", "", "lastUpdated", "Ljava/time/OffsetDateTime;", "lastUpdatedBy", "alias", "intendedTeamViewerVersion", "title", "text", "backgroundColor", "textColor", "logoFileName", "logoUrl", "downloadUrlType", "Lcom/teamviewer/apidefinitions/custommodules/models/DownloadUrlType;", "downloadConfigurationUrl", "downloadModuleViaConfigIdUrl", "downloadModuleViaAliasUrl", "enableProblemDescriptionField", "", "enableFeedbackForm", "allowUserToStartChat", "disclaimer", "createDesktopShortcut", "companyWhitelist", "primaryButton", "Lcom/teamviewer/apidefinitions/custommodules/models/CustomButton;", "routerDnsNames", "", "serviceDeskOptions", "Lcom/teamviewer/apidefinitions/custommodules/models/ServiceDeskOptions;", "enableTicketCreationOnServiceCamp", "groupToAddTo", "defaultAssigneeAccountId", "interpretGroupAsServiceQueue", "predefinedPassword", "randomPasswordStrength", "Lcom/teamviewer/apidefinitions/custommodules/models/RandomPasswordStrength;", "useRandomPassword", "serviceCampInboxId", "serviceCampInstanceId", "companyIdWhitelist", "accountIdWhitelist", "enableSessionInsights", "<init>", "(Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleType;Lcom/teamviewer/apidefinitions/custommodules/models/EditorVersion;Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/teamviewer/apidefinitions/custommodules/models/DownloadUrlType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/teamviewer/apidefinitions/custommodules/models/CustomButton;Ljava/util/List;Lcom/teamviewer/apidefinitions/custommodules/models/ServiceDeskOptions;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Lcom/teamviewer/apidefinitions/custommodules/models/RandomPasswordStrength;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)V", "getModuleType", "()Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleType;", "getEditorVersion", "()Lcom/teamviewer/apidefinitions/custommodules/models/EditorVersion;", "getStatus", "()Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleStatus;", "getModuleId", "()Ljava/lang/String;", "getName", "getOwner", "getOwnerId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLastUpdated", "()Ljava/time/OffsetDateTime;", "getLastUpdatedBy", "getAlias", "getIntendedTeamViewerVersion", "getTitle", "getText", "getBackgroundColor", "getTextColor", "getLogoFileName", "getLogoUrl", "getDownloadUrlType", "()Lcom/teamviewer/apidefinitions/custommodules/models/DownloadUrlType;", "getDownloadConfigurationUrl", "getDownloadModuleViaConfigIdUrl", "getDownloadModuleViaAliasUrl", "getEnableProblemDescriptionField", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEnableFeedbackForm", "getAllowUserToStartChat", "getDisclaimer", "getCreateDesktopShortcut", "getCompanyWhitelist", "getPrimaryButton", "()Lcom/teamviewer/apidefinitions/custommodules/models/CustomButton;", "getRouterDnsNames", "()Ljava/util/List;", "getServiceDeskOptions", "()Lcom/teamviewer/apidefinitions/custommodules/models/ServiceDeskOptions;", "getEnableTicketCreationOnServiceCamp", "getGroupToAddTo", "getDefaultAssigneeAccountId", "getInterpretGroupAsServiceQueue", "getPredefinedPassword", "getRandomPasswordStrength", "()Lcom/teamviewer/apidefinitions/custommodules/models/RandomPasswordStrength;", "getUseRandomPassword", "getServiceCampInboxId", "getServiceCampInstanceId", "getCompanyIdWhitelist", "getAccountIdWhitelist", "getEnableSessionInsights", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "copy", "(Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleType;Lcom/teamviewer/apidefinitions/custommodules/models/EditorVersion;Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/teamviewer/apidefinitions/custommodules/models/DownloadUrlType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/teamviewer/apidefinitions/custommodules/models/CustomButton;Ljava/util/List;Lcom/teamviewer/apidefinitions/custommodules/models/ServiceDeskOptions;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Lcom/teamviewer/apidefinitions/custommodules/models/RandomPasswordStrength;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleQuickSupport;", "equals", "other", "", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CustomModuleQuickSupport implements CustomModule {
    private final List<Integer> accountIdWhitelist;
    private final String alias;
    private final Boolean allowUserToStartChat;
    private final String backgroundColor;
    private final List<Integer> companyIdWhitelist;
    private final Integer companyWhitelist;
    private final Boolean createDesktopShortcut;
    private final Integer defaultAssigneeAccountId;
    private final String disclaimer;
    private final String downloadConfigurationUrl;
    private final String downloadModuleViaAliasUrl;
    private final String downloadModuleViaConfigIdUrl;
    private final DownloadUrlType downloadUrlType;
    private final EditorVersion editorVersion;
    private final Boolean enableFeedbackForm;
    private final Boolean enableProblemDescriptionField;
    private final Boolean enableSessionInsights;
    private final Boolean enableTicketCreationOnServiceCamp;
    private final String groupToAddTo;
    private final Integer intendedTeamViewerVersion;
    private final Boolean interpretGroupAsServiceQueue;
    private final OffsetDateTime lastUpdated;
    private final String lastUpdatedBy;
    private final String logoFileName;
    private final String logoUrl;
    private final String moduleId;
    private final CustomModuleType moduleType;
    private final String name;
    private final String owner;
    private final Integer ownerId;
    private final String predefinedPassword;
    private final CustomButton primaryButton;
    private final RandomPasswordStrength randomPasswordStrength;
    private final List<String> routerDnsNames;
    private final String serviceCampInboxId;
    private final String serviceCampInstanceId;
    private final ServiceDeskOptions serviceDeskOptions;
    private final CustomModuleStatus status;
    private final String text;
    private final String textColor;
    private final String title;
    private final Boolean useRandomPassword;

    public /* synthetic */ CustomModuleQuickSupport(CustomModuleType customModuleType, EditorVersion editorVersion, CustomModuleStatus customModuleStatus, String str, String str2, String str3, Integer num, OffsetDateTime offsetDateTime, String str4, String str5, Integer num2, String str6, String str7, String str8, String str9, String str10, String str11, DownloadUrlType downloadUrlType, String str12, String str13, String str14, Boolean bool, Boolean bool2, Boolean bool3, String str15, Boolean bool4, Integer num3, CustomButton customButton, List list, ServiceDeskOptions serviceDeskOptions, Boolean bool5, String str16, Integer num4, Boolean bool6, String str17, RandomPasswordStrength randomPasswordStrength, Boolean bool7, String str18, String str19, List list2, List list3, Boolean bool8, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(customModuleType, editorVersion, customModuleStatus, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : offsetDateTime, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : num2, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? null : str9, (32768 & i) != 0 ? null : str10, (65536 & i) != 0 ? null : str11, (131072 & i) != 0 ? null : downloadUrlType, (262144 & i) != 0 ? null : str12, (524288 & i) != 0 ? null : str13, (1048576 & i) != 0 ? null : str14, (2097152 & i) != 0 ? null : bool, (4194304 & i) != 0 ? null : bool2, (8388608 & i) != 0 ? null : bool3, (16777216 & i) != 0 ? null : str15, (33554432 & i) != 0 ? null : bool4, (67108864 & i) != 0 ? null : num3, (134217728 & i) != 0 ? null : customButton, (268435456 & i) != 0 ? null : list, (536870912 & i) != 0 ? null : serviceDeskOptions, (1073741824 & i) != 0 ? null : bool5, (i & Integer.MIN_VALUE) != 0 ? null : str16, (i2 & 1) != 0 ? null : num4, (i2 & 2) != 0 ? null : bool6, (i2 & 4) != 0 ? null : str17, (i2 & 8) != 0 ? null : randomPasswordStrength, (i2 & 16) != 0 ? null : bool7, (i2 & 32) != 0 ? null : str18, (i2 & 64) != 0 ? null : str19, (i2 & 128) != 0 ? null : list2, (i2 & 256) != 0 ? null : list3, (i2 & 512) != 0 ? null : bool8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CustomModuleType getModuleType() {
        return this.moduleType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getIntendedTeamViewerVersion() {
        return this.intendedTeamViewerVersion;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getLogoFileName() {
        return this.logoFileName;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final DownloadUrlType getDownloadUrlType() {
        return this.downloadUrlType;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getDownloadConfigurationUrl() {
        return this.downloadConfigurationUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EditorVersion getEditorVersion() {
        return this.editorVersion;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getDownloadModuleViaConfigIdUrl() {
        return this.downloadModuleViaConfigIdUrl;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getDownloadModuleViaAliasUrl() {
        return this.downloadModuleViaAliasUrl;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Boolean getEnableProblemDescriptionField() {
        return this.enableProblemDescriptionField;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Boolean getEnableFeedbackForm() {
        return this.enableFeedbackForm;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Boolean getAllowUserToStartChat() {
        return this.allowUserToStartChat;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Boolean getCreateDesktopShortcut() {
        return this.createDesktopShortcut;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Integer getCompanyWhitelist() {
        return this.companyWhitelist;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final CustomButton getPrimaryButton() {
        return this.primaryButton;
    }

    public final List<String> component29() {
        return this.routerDnsNames;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CustomModuleStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final ServiceDeskOptions getServiceDeskOptions() {
        return this.serviceDeskOptions;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Boolean getEnableTicketCreationOnServiceCamp() {
        return this.enableTicketCreationOnServiceCamp;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getGroupToAddTo() {
        return this.groupToAddTo;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Integer getDefaultAssigneeAccountId() {
        return this.defaultAssigneeAccountId;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final Boolean getInterpretGroupAsServiceQueue() {
        return this.interpretGroupAsServiceQueue;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getPredefinedPassword() {
        return this.predefinedPassword;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final RandomPasswordStrength getRandomPasswordStrength() {
        return this.randomPasswordStrength;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final Boolean getUseRandomPassword() {
        return this.useRandomPassword;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getServiceCampInboxId() {
        return this.serviceCampInboxId;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getServiceCampInstanceId() {
        return this.serviceCampInstanceId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getModuleId() {
        return this.moduleId;
    }

    public final List<Integer> component40() {
        return this.companyIdWhitelist;
    }

    public final List<Integer> component41() {
        return this.accountIdWhitelist;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final Boolean getEnableSessionInsights() {
        return this.enableSessionInsights;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOwner() {
        return this.owner;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getOwnerId() {
        return this.ownerId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final OffsetDateTime getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public final CustomModuleQuickSupport copy(@sp3(name = "moduleType") CustomModuleType moduleType, @sp3(name = "editorVersion") EditorVersion editorVersion, @sp3(name = "status") CustomModuleStatus status, @sp3(name = "moduleId") String moduleId, @sp3(name = "name") String name, @sp3(name = "owner") String owner, @sp3(name = "ownerId") Integer ownerId, @sp3(name = "lastUpdated") OffsetDateTime lastUpdated, @sp3(name = "lastUpdatedBy") String lastUpdatedBy, @sp3(name = "alias") String alias, @sp3(name = "intendedTeamViewerVersion") Integer intendedTeamViewerVersion, @sp3(name = "title") String title, @sp3(name = "text") String text, @sp3(name = "backgroundColor") String backgroundColor, @sp3(name = "textColor") String textColor, @sp3(name = "logoFileName") String logoFileName, @sp3(name = "logoUrl") String logoUrl, @sp3(name = "downloadUrlType") DownloadUrlType downloadUrlType, @sp3(name = "downloadConfigurationUrl") String downloadConfigurationUrl, @sp3(name = "downloadModuleViaConfigIdUrl") String downloadModuleViaConfigIdUrl, @sp3(name = "downloadModuleViaAliasUrl") String downloadModuleViaAliasUrl, @sp3(name = "enableProblemDescriptionField") Boolean enableProblemDescriptionField, @sp3(name = "enableFeedbackForm") Boolean enableFeedbackForm, @sp3(name = "allowUserToStartChat") Boolean allowUserToStartChat, @sp3(name = "disclaimer") String disclaimer, @sp3(name = "createDesktopShortcut") Boolean createDesktopShortcut, @sp3(name = "companyWhitelist") Integer companyWhitelist, @sp3(name = "primaryButton") CustomButton primaryButton, @sp3(name = "routerDnsNames") List<String> routerDnsNames, @sp3(name = "serviceDeskOptions") ServiceDeskOptions serviceDeskOptions, @sp3(name = "enableTicketCreationOnServiceCamp") Boolean enableTicketCreationOnServiceCamp, @sp3(name = "groupToAddTo") String groupToAddTo, @sp3(name = "defaultAssigneeAccountId") Integer defaultAssigneeAccountId, @sp3(name = "interpretGroupAsServiceQueue") Boolean interpretGroupAsServiceQueue, @sp3(name = "predefinedPassword") String predefinedPassword, @sp3(name = "randomPasswordStrength") RandomPasswordStrength randomPasswordStrength, @sp3(name = "useRandomPassword") Boolean useRandomPassword, @sp3(name = "serviceCampInboxId") String serviceCampInboxId, @sp3(name = "serviceCampInstanceId") String serviceCampInstanceId, @sp3(name = "companyIdWhitelist") List<Integer> companyIdWhitelist, @sp3(name = "accountIdWhitelist") List<Integer> accountIdWhitelist, @sp3(name = "enableSessionInsights") Boolean enableSessionInsights) {
        moduleType.getClass();
        editorVersion.getClass();
        status.getClass();
        return new CustomModuleQuickSupport(moduleType, editorVersion, status, moduleId, name, owner, ownerId, lastUpdated, lastUpdatedBy, alias, intendedTeamViewerVersion, title, text, backgroundColor, textColor, logoFileName, logoUrl, downloadUrlType, downloadConfigurationUrl, downloadModuleViaConfigIdUrl, downloadModuleViaAliasUrl, enableProblemDescriptionField, enableFeedbackForm, allowUserToStartChat, disclaimer, createDesktopShortcut, companyWhitelist, primaryButton, routerDnsNames, serviceDeskOptions, enableTicketCreationOnServiceCamp, groupToAddTo, defaultAssigneeAccountId, interpretGroupAsServiceQueue, predefinedPassword, randomPasswordStrength, useRandomPassword, serviceCampInboxId, serviceCampInstanceId, companyIdWhitelist, accountIdWhitelist, enableSessionInsights);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomModuleQuickSupport)) {
            return false;
        }
        CustomModuleQuickSupport customModuleQuickSupport = (CustomModuleQuickSupport) other;
        return this.moduleType == customModuleQuickSupport.moduleType && this.editorVersion == customModuleQuickSupport.editorVersion && this.status == customModuleQuickSupport.status && im3.n(this.moduleId, customModuleQuickSupport.moduleId) && im3.n(this.name, customModuleQuickSupport.name) && im3.n(this.owner, customModuleQuickSupport.owner) && im3.n(this.ownerId, customModuleQuickSupport.ownerId) && im3.n(this.lastUpdated, customModuleQuickSupport.lastUpdated) && im3.n(this.lastUpdatedBy, customModuleQuickSupport.lastUpdatedBy) && im3.n(this.alias, customModuleQuickSupport.alias) && im3.n(this.intendedTeamViewerVersion, customModuleQuickSupport.intendedTeamViewerVersion) && im3.n(this.title, customModuleQuickSupport.title) && im3.n(this.text, customModuleQuickSupport.text) && im3.n(this.backgroundColor, customModuleQuickSupport.backgroundColor) && im3.n(this.textColor, customModuleQuickSupport.textColor) && im3.n(this.logoFileName, customModuleQuickSupport.logoFileName) && im3.n(this.logoUrl, customModuleQuickSupport.logoUrl) && this.downloadUrlType == customModuleQuickSupport.downloadUrlType && im3.n(this.downloadConfigurationUrl, customModuleQuickSupport.downloadConfigurationUrl) && im3.n(this.downloadModuleViaConfigIdUrl, customModuleQuickSupport.downloadModuleViaConfigIdUrl) && im3.n(this.downloadModuleViaAliasUrl, customModuleQuickSupport.downloadModuleViaAliasUrl) && im3.n(this.enableProblemDescriptionField, customModuleQuickSupport.enableProblemDescriptionField) && im3.n(this.enableFeedbackForm, customModuleQuickSupport.enableFeedbackForm) && im3.n(this.allowUserToStartChat, customModuleQuickSupport.allowUserToStartChat) && im3.n(this.disclaimer, customModuleQuickSupport.disclaimer) && im3.n(this.createDesktopShortcut, customModuleQuickSupport.createDesktopShortcut) && im3.n(this.companyWhitelist, customModuleQuickSupport.companyWhitelist) && im3.n(this.primaryButton, customModuleQuickSupport.primaryButton) && im3.n(this.routerDnsNames, customModuleQuickSupport.routerDnsNames) && im3.n(this.serviceDeskOptions, customModuleQuickSupport.serviceDeskOptions) && im3.n(this.enableTicketCreationOnServiceCamp, customModuleQuickSupport.enableTicketCreationOnServiceCamp) && im3.n(this.groupToAddTo, customModuleQuickSupport.groupToAddTo) && im3.n(this.defaultAssigneeAccountId, customModuleQuickSupport.defaultAssigneeAccountId) && im3.n(this.interpretGroupAsServiceQueue, customModuleQuickSupport.interpretGroupAsServiceQueue) && im3.n(this.predefinedPassword, customModuleQuickSupport.predefinedPassword) && this.randomPasswordStrength == customModuleQuickSupport.randomPasswordStrength && im3.n(this.useRandomPassword, customModuleQuickSupport.useRandomPassword) && im3.n(this.serviceCampInboxId, customModuleQuickSupport.serviceCampInboxId) && im3.n(this.serviceCampInstanceId, customModuleQuickSupport.serviceCampInstanceId) && im3.n(this.companyIdWhitelist, customModuleQuickSupport.companyIdWhitelist) && im3.n(this.accountIdWhitelist, customModuleQuickSupport.accountIdWhitelist) && im3.n(this.enableSessionInsights, customModuleQuickSupport.enableSessionInsights);
    }

    public final List<Integer> getAccountIdWhitelist() {
        return this.accountIdWhitelist;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getAlias() {
        return this.alias;
    }

    public final Boolean getAllowUserToStartChat() {
        return this.allowUserToStartChat;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<Integer> getCompanyIdWhitelist() {
        return this.companyIdWhitelist;
    }

    public final Integer getCompanyWhitelist() {
        return this.companyWhitelist;
    }

    public final Boolean getCreateDesktopShortcut() {
        return this.createDesktopShortcut;
    }

    public final Integer getDefaultAssigneeAccountId() {
        return this.defaultAssigneeAccountId;
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getDownloadConfigurationUrl() {
        return this.downloadConfigurationUrl;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getDownloadModuleViaAliasUrl() {
        return this.downloadModuleViaAliasUrl;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getDownloadModuleViaConfigIdUrl() {
        return this.downloadModuleViaConfigIdUrl;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public DownloadUrlType getDownloadUrlType() {
        return this.downloadUrlType;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public EditorVersion getEditorVersion() {
        return this.editorVersion;
    }

    public final Boolean getEnableFeedbackForm() {
        return this.enableFeedbackForm;
    }

    public final Boolean getEnableProblemDescriptionField() {
        return this.enableProblemDescriptionField;
    }

    public final Boolean getEnableSessionInsights() {
        return this.enableSessionInsights;
    }

    public final Boolean getEnableTicketCreationOnServiceCamp() {
        return this.enableTicketCreationOnServiceCamp;
    }

    public final String getGroupToAddTo() {
        return this.groupToAddTo;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public Integer getIntendedTeamViewerVersion() {
        return this.intendedTeamViewerVersion;
    }

    public final Boolean getInterpretGroupAsServiceQueue() {
        return this.interpretGroupAsServiceQueue;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public OffsetDateTime getLastUpdated() {
        return this.lastUpdated;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getLogoFileName() {
        return this.logoFileName;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getLogoUrl() {
        return this.logoUrl;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getModuleId() {
        return this.moduleId;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public CustomModuleType getModuleType() {
        return this.moduleType;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getName() {
        return this.name;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getOwner() {
        return this.owner;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public Integer getOwnerId() {
        return this.ownerId;
    }

    public final String getPredefinedPassword() {
        return this.predefinedPassword;
    }

    public final CustomButton getPrimaryButton() {
        return this.primaryButton;
    }

    public final RandomPasswordStrength getRandomPasswordStrength() {
        return this.randomPasswordStrength;
    }

    public final List<String> getRouterDnsNames() {
        return this.routerDnsNames;
    }

    public final String getServiceCampInboxId() {
        return this.serviceCampInboxId;
    }

    public final String getServiceCampInstanceId() {
        return this.serviceCampInstanceId;
    }

    public final ServiceDeskOptions getServiceDeskOptions() {
        return this.serviceDeskOptions;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public CustomModuleStatus getStatus() {
        return this.status;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getText() {
        return this.text;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getTextColor() {
        return this.textColor;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getTitle() {
        return this.title;
    }

    public final Boolean getUseRandomPassword() {
        return this.useRandomPassword;
    }

    public int hashCode() {
        int iHashCode = (this.status.hashCode() + ((this.editorVersion.hashCode() + (this.moduleType.hashCode() * 31)) * 31)) * 31;
        String str = this.moduleId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.owner;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.ownerId;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.lastUpdated;
        int iHashCode6 = (iHashCode5 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        String str4 = this.lastUpdatedBy;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.alias;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.intendedTeamViewerVersion;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.title;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.text;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.backgroundColor;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.textColor;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.logoFileName;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.logoUrl;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        DownloadUrlType downloadUrlType = this.downloadUrlType;
        int iHashCode16 = (iHashCode15 + (downloadUrlType == null ? 0 : downloadUrlType.hashCode())) * 31;
        String str12 = this.downloadConfigurationUrl;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.downloadModuleViaConfigIdUrl;
        int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.downloadModuleViaAliasUrl;
        int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool = this.enableProblemDescriptionField;
        int iHashCode20 = (iHashCode19 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.enableFeedbackForm;
        int iHashCode21 = (iHashCode20 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.allowUserToStartChat;
        int iHashCode22 = (iHashCode21 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str15 = this.disclaimer;
        int iHashCode23 = (iHashCode22 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Boolean bool4 = this.createDesktopShortcut;
        int iHashCode24 = (iHashCode23 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num3 = this.companyWhitelist;
        int iHashCode25 = (iHashCode24 + (num3 == null ? 0 : num3.hashCode())) * 31;
        CustomButton customButton = this.primaryButton;
        int iHashCode26 = (iHashCode25 + (customButton == null ? 0 : customButton.hashCode())) * 31;
        List<String> list = this.routerDnsNames;
        int iHashCode27 = (iHashCode26 + (list == null ? 0 : list.hashCode())) * 31;
        ServiceDeskOptions serviceDeskOptions = this.serviceDeskOptions;
        int iHashCode28 = (iHashCode27 + (serviceDeskOptions == null ? 0 : serviceDeskOptions.hashCode())) * 31;
        Boolean bool5 = this.enableTicketCreationOnServiceCamp;
        int iHashCode29 = (iHashCode28 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str16 = this.groupToAddTo;
        int iHashCode30 = (iHashCode29 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Integer num4 = this.defaultAssigneeAccountId;
        int iHashCode31 = (iHashCode30 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool6 = this.interpretGroupAsServiceQueue;
        int iHashCode32 = (iHashCode31 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str17 = this.predefinedPassword;
        int iHashCode33 = (iHashCode32 + (str17 == null ? 0 : str17.hashCode())) * 31;
        RandomPasswordStrength randomPasswordStrength = this.randomPasswordStrength;
        int iHashCode34 = (iHashCode33 + (randomPasswordStrength == null ? 0 : randomPasswordStrength.hashCode())) * 31;
        Boolean bool7 = this.useRandomPassword;
        int iHashCode35 = (iHashCode34 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str18 = this.serviceCampInboxId;
        int iHashCode36 = (iHashCode35 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.serviceCampInstanceId;
        int iHashCode37 = (iHashCode36 + (str19 == null ? 0 : str19.hashCode())) * 31;
        List<Integer> list2 = this.companyIdWhitelist;
        int iHashCode38 = (iHashCode37 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Integer> list3 = this.accountIdWhitelist;
        int iHashCode39 = (iHashCode38 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool8 = this.enableSessionInsights;
        return iHashCode39 + (bool8 != null ? bool8.hashCode() : 0);
    }

    public String toString() {
        CustomModuleType customModuleType = this.moduleType;
        EditorVersion editorVersion = this.editorVersion;
        CustomModuleStatus customModuleStatus = this.status;
        String str = this.moduleId;
        String str2 = this.name;
        String str3 = this.owner;
        Integer num = this.ownerId;
        OffsetDateTime offsetDateTime = this.lastUpdated;
        String str4 = this.lastUpdatedBy;
        String str5 = this.alias;
        Integer num2 = this.intendedTeamViewerVersion;
        String str6 = this.title;
        String str7 = this.text;
        String str8 = this.backgroundColor;
        String str9 = this.textColor;
        String str10 = this.logoFileName;
        String str11 = this.logoUrl;
        DownloadUrlType downloadUrlType = this.downloadUrlType;
        String str12 = this.downloadConfigurationUrl;
        String str13 = this.downloadModuleViaConfigIdUrl;
        String str14 = this.downloadModuleViaAliasUrl;
        Boolean bool = this.enableProblemDescriptionField;
        Boolean bool2 = this.enableFeedbackForm;
        Boolean bool3 = this.allowUserToStartChat;
        String str15 = this.disclaimer;
        Boolean bool4 = this.createDesktopShortcut;
        Integer num3 = this.companyWhitelist;
        CustomButton customButton = this.primaryButton;
        List<String> list = this.routerDnsNames;
        ServiceDeskOptions serviceDeskOptions = this.serviceDeskOptions;
        Boolean bool5 = this.enableTicketCreationOnServiceCamp;
        String str16 = this.groupToAddTo;
        Integer num4 = this.defaultAssigneeAccountId;
        Boolean bool6 = this.interpretGroupAsServiceQueue;
        String str17 = this.predefinedPassword;
        RandomPasswordStrength randomPasswordStrength = this.randomPasswordStrength;
        Boolean bool7 = this.useRandomPassword;
        String str18 = this.serviceCampInboxId;
        String str19 = this.serviceCampInstanceId;
        List<Integer> list2 = this.companyIdWhitelist;
        List<Integer> list3 = this.accountIdWhitelist;
        Boolean bool8 = this.enableSessionInsights;
        StringBuilder sb = new StringBuilder("CustomModuleQuickSupport(moduleType=");
        sb.append(customModuleType);
        sb.append(", editorVersion=");
        sb.append(editorVersion);
        sb.append(", status=");
        sb.append(customModuleStatus);
        sb.append(", moduleId=");
        sb.append(str);
        sb.append(", name=");
        e41.t(sb, str2, ", owner=", str3, ", ownerId=");
        sb.append(num);
        sb.append(", lastUpdated=");
        sb.append(offsetDateTime);
        sb.append(", lastUpdatedBy=");
        e41.t(sb, str4, ", alias=", str5, ", intendedTeamViewerVersion=");
        sb.append(num2);
        sb.append(", title=");
        sb.append(str6);
        sb.append(", text=");
        e41.t(sb, str7, ", backgroundColor=", str8, ", textColor=");
        e41.t(sb, str9, ", logoFileName=", str10, ", logoUrl=");
        sb.append(str11);
        sb.append(", downloadUrlType=");
        sb.append(downloadUrlType);
        sb.append(", downloadConfigurationUrl=");
        e41.t(sb, str12, ", downloadModuleViaConfigIdUrl=", str13, ", downloadModuleViaAliasUrl=");
        sb.append(str14);
        sb.append(", enableProblemDescriptionField=");
        sb.append(bool);
        sb.append(", enableFeedbackForm=");
        ua5.w(sb, bool2, ", allowUserToStartChat=", bool3, ", disclaimer=");
        sb.append(str15);
        sb.append(", createDesktopShortcut=");
        sb.append(bool4);
        sb.append(", companyWhitelist=");
        sb.append(num3);
        sb.append(", primaryButton=");
        sb.append(customButton);
        sb.append(", routerDnsNames=");
        sb.append(list);
        sb.append(", serviceDeskOptions=");
        sb.append(serviceDeskOptions);
        sb.append(", enableTicketCreationOnServiceCamp=");
        sb.append(bool5);
        sb.append(", groupToAddTo=");
        sb.append(str16);
        sb.append(", defaultAssigneeAccountId=");
        sb.append(num4);
        sb.append(", interpretGroupAsServiceQueue=");
        sb.append(bool6);
        sb.append(", predefinedPassword=");
        sb.append(str17);
        sb.append(", randomPasswordStrength=");
        sb.append(randomPasswordStrength);
        sb.append(", useRandomPassword=");
        sb.append(bool7);
        sb.append(", serviceCampInboxId=");
        sb.append(str18);
        sb.append(", serviceCampInstanceId=");
        sb.append(str19);
        sb.append(", companyIdWhitelist=");
        sb.append(list2);
        sb.append(", accountIdWhitelist=");
        sb.append(list3);
        sb.append(", enableSessionInsights=");
        sb.append(bool8);
        sb.append(")");
        return sb.toString();
    }

    public CustomModuleQuickSupport(@sp3(name = "moduleType") CustomModuleType customModuleType, @sp3(name = "editorVersion") EditorVersion editorVersion, @sp3(name = "status") CustomModuleStatus customModuleStatus, @sp3(name = "moduleId") String str, @sp3(name = "name") String str2, @sp3(name = "owner") String str3, @sp3(name = "ownerId") Integer num, @sp3(name = "lastUpdated") OffsetDateTime offsetDateTime, @sp3(name = "lastUpdatedBy") String str4, @sp3(name = "alias") String str5, @sp3(name = "intendedTeamViewerVersion") Integer num2, @sp3(name = "title") String str6, @sp3(name = "text") String str7, @sp3(name = "backgroundColor") String str8, @sp3(name = "textColor") String str9, @sp3(name = "logoFileName") String str10, @sp3(name = "logoUrl") String str11, @sp3(name = "downloadUrlType") DownloadUrlType downloadUrlType, @sp3(name = "downloadConfigurationUrl") String str12, @sp3(name = "downloadModuleViaConfigIdUrl") String str13, @sp3(name = "downloadModuleViaAliasUrl") String str14, @sp3(name = "enableProblemDescriptionField") Boolean bool, @sp3(name = "enableFeedbackForm") Boolean bool2, @sp3(name = "allowUserToStartChat") Boolean bool3, @sp3(name = "disclaimer") String str15, @sp3(name = "createDesktopShortcut") Boolean bool4, @sp3(name = "companyWhitelist") Integer num3, @sp3(name = "primaryButton") CustomButton customButton, @sp3(name = "routerDnsNames") List<String> list, @sp3(name = "serviceDeskOptions") ServiceDeskOptions serviceDeskOptions, @sp3(name = "enableTicketCreationOnServiceCamp") Boolean bool5, @sp3(name = "groupToAddTo") String str16, @sp3(name = "defaultAssigneeAccountId") Integer num4, @sp3(name = "interpretGroupAsServiceQueue") Boolean bool6, @sp3(name = "predefinedPassword") String str17, @sp3(name = "randomPasswordStrength") RandomPasswordStrength randomPasswordStrength, @sp3(name = "useRandomPassword") Boolean bool7, @sp3(name = "serviceCampInboxId") String str18, @sp3(name = "serviceCampInstanceId") String str19, @sp3(name = "companyIdWhitelist") List<Integer> list2, @sp3(name = "accountIdWhitelist") List<Integer> list3, @sp3(name = "enableSessionInsights") Boolean bool8) {
        customModuleType.getClass();
        editorVersion.getClass();
        customModuleStatus.getClass();
        this.moduleType = customModuleType;
        this.editorVersion = editorVersion;
        this.status = customModuleStatus;
        this.moduleId = str;
        this.name = str2;
        this.owner = str3;
        this.ownerId = num;
        this.lastUpdated = offsetDateTime;
        this.lastUpdatedBy = str4;
        this.alias = str5;
        this.intendedTeamViewerVersion = num2;
        this.title = str6;
        this.text = str7;
        this.backgroundColor = str8;
        this.textColor = str9;
        this.logoFileName = str10;
        this.logoUrl = str11;
        this.downloadUrlType = downloadUrlType;
        this.downloadConfigurationUrl = str12;
        this.downloadModuleViaConfigIdUrl = str13;
        this.downloadModuleViaAliasUrl = str14;
        this.enableProblemDescriptionField = bool;
        this.enableFeedbackForm = bool2;
        this.allowUserToStartChat = bool3;
        this.disclaimer = str15;
        this.createDesktopShortcut = bool4;
        this.companyWhitelist = num3;
        this.primaryButton = customButton;
        this.routerDnsNames = list;
        this.serviceDeskOptions = serviceDeskOptions;
        this.enableTicketCreationOnServiceCamp = bool5;
        this.groupToAddTo = str16;
        this.defaultAssigneeAccountId = num4;
        this.interpretGroupAsServiceQueue = bool6;
        this.predefinedPassword = str17;
        this.randomPasswordStrength = randomPasswordStrength;
        this.useRandomPassword = bool7;
        this.serviceCampInboxId = str18;
        this.serviceCampInstanceId = str19;
        this.companyIdWhitelist = list2;
        this.accountIdWhitelist = list3;
        this.enableSessionInsights = bool8;
    }
}
