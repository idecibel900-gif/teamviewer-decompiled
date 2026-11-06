package o;

/* JADX INFO: loaded from: classes.dex */
public final class fm implements go2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ go2 n;

    public /* synthetic */ fm(go2 go2Var, byte b) {
        this.m = b;
        this.n = go2Var;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0188  */
    /* JADX WARN: Code duplicated, block: B:121:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:137:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:153:0x0239  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x0112  */
    /* JADX WARN: Code duplicated, block: B:89:0x014d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // o.go2
    public final Object b(ho2 ho2Var, hc1 hc1Var) {
        u91 u91Var;
        az1 az1Var;
        dz1 dz1Var;
        fz1 fz1Var;
        c33 c33Var;
        d64 d64Var;
        ul4 ul4Var;
        un5 un5Var;
        b56 b56Var;
        bg7 bg7Var;
        byte b = this.m;
        f88 f88Var = f88.a;
        go2 go2Var = this.n;
        ne1 ne1Var = ne1.m;
        byte b2 = 1;
        switch (b) {
            case 0:
                Object objB = go2Var.b(new em(ho2Var, (byte) 0), hc1Var);
                return objB == ne1Var ? objB : f88Var;
            case 1:
                if (hc1Var instanceof u91) {
                    u91Var = (u91) hc1Var;
                    int i = u91Var.n;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        u91Var.n = i - Integer.MIN_VALUE;
                    } else {
                        u91Var = new u91(this, hc1Var);
                    }
                } else {
                    u91Var = new u91(this, hc1Var);
                }
                Object obj = u91Var.m;
                int i2 = u91Var.n;
                if (i2 == 0) {
                    ct1.a0(obj);
                    em emVar = new em(ho2Var, b2);
                    u91Var.n = 1;
                    if (go2Var.b(emVar, u91Var) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (i2 != 1) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
            case 2:
                if (hc1Var instanceof az1) {
                    az1Var = (az1) hc1Var;
                    int i3 = az1Var.n;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        az1Var.n = i3 - Integer.MIN_VALUE;
                    } else {
                        az1Var = new az1(this, hc1Var);
                    }
                } else {
                    az1Var = new az1(this, hc1Var);
                }
                Object obj2 = az1Var.m;
                int i4 = az1Var.n;
                if (i4 == 0) {
                    ct1.a0(obj2);
                    em emVar2 = new em(ho2Var, (byte) 3);
                    az1Var.n = 1;
                    if (go2Var.b(emVar2, az1Var) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (i4 != 1) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj2);
                }
                return f88Var;
            case 3:
                if (hc1Var instanceof dz1) {
                    dz1Var = (dz1) hc1Var;
                    int i5 = dz1Var.n;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        dz1Var.n = i5 - Integer.MIN_VALUE;
                    } else {
                        dz1Var = new dz1(this, hc1Var);
                    }
                } else {
                    dz1Var = new dz1(this, hc1Var);
                }
                Object obj3 = dz1Var.m;
                int i6 = dz1Var.n;
                if (i6 == 0) {
                    ct1.a0(obj3);
                    em emVar3 = new em(ho2Var, (byte) 4);
                    dz1Var.n = 1;
                    if (go2Var.b(emVar3, dz1Var) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (i6 != 1) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj3);
                }
                return f88Var;
            case 4:
                if (hc1Var instanceof fz1) {
                    fz1Var = (fz1) hc1Var;
                    int i7 = fz1Var.n;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        fz1Var.n = i7 - Integer.MIN_VALUE;
                    } else {
                        fz1Var = new fz1(this, hc1Var);
                    }
                } else {
                    fz1Var = new fz1(this, hc1Var);
                }
                Object obj4 = fz1Var.m;
                int i8 = fz1Var.n;
                if (i8 == 0) {
                    ct1.a0(obj4);
                    em emVar4 = new em(ho2Var, (byte) 5);
                    fz1Var.n = 1;
                    if (go2Var.b(emVar4, fz1Var) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (i8 != 1) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj4);
                }
                return f88Var;
            case 5:
                if (hc1Var instanceof c33) {
                    c33Var = (c33) hc1Var;
                    int i9 = c33Var.n;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        c33Var.n = i9 - Integer.MIN_VALUE;
                    } else {
                        c33Var = new c33(this, hc1Var);
                    }
                } else {
                    c33Var = new c33(this, hc1Var);
                }
                Object obj5 = c33Var.m;
                int i10 = c33Var.n;
                if (i10 == 0) {
                    ct1.a0(obj5);
                    em emVar5 = new em(ho2Var, (byte) 6);
                    c33Var.n = 1;
                    if (go2Var.b(emVar5, c33Var) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (i10 != 1) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj5);
                }
                return f88Var;
            case 6:
                if (hc1Var instanceof d64) {
                    d64Var = (d64) hc1Var;
                    int i11 = d64Var.n;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        d64Var.n = i11 - Integer.MIN_VALUE;
                    } else {
                        d64Var = new d64(this, hc1Var);
                    }
                } else {
                    d64Var = new d64(this, hc1Var);
                }
                Object obj6 = d64Var.m;
                int i12 = d64Var.n;
                if (i12 == 0) {
                    ct1.a0(obj6);
                    em emVar6 = new em(ho2Var, (byte) 7);
                    d64Var.n = 1;
                    if (go2Var.b(emVar6, d64Var) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (i12 != 1) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj6);
                }
                return f88Var;
            case 7:
                if (hc1Var instanceof ul4) {
                    ul4Var = (ul4) hc1Var;
                    int i13 = ul4Var.n;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        ul4Var.n = i13 - Integer.MIN_VALUE;
                    } else {
                        ul4Var = new ul4(this, hc1Var);
                    }
                } else {
                    ul4Var = new ul4(this, hc1Var);
                }
                Object obj7 = ul4Var.m;
                int i14 = ul4Var.n;
                if (i14 == 0) {
                    ct1.a0(obj7);
                    em emVar7 = new em(ho2Var, (byte) 8);
                    ul4Var.n = 1;
                    if (go2Var.b(emVar7, ul4Var) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (i14 != 1) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj7);
                }
                return f88Var;
            case 8:
                if (hc1Var instanceof un5) {
                    un5Var = (un5) hc1Var;
                    int i15 = un5Var.n;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        un5Var.n = i15 - Integer.MIN_VALUE;
                    } else {
                        un5Var = new un5(this, hc1Var);
                    }
                } else {
                    un5Var = new un5(this, hc1Var);
                }
                Object obj8 = un5Var.m;
                int i16 = un5Var.n;
                if (i16 == 0) {
                    ct1.a0(obj8);
                    em emVar8 = new em(ho2Var, (byte) 9);
                    un5Var.n = 1;
                    if (go2Var.b(emVar8, un5Var) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (i16 != 1) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj8);
                }
                return f88Var;
            case ep1.b /* 9 */:
                if (hc1Var instanceof b56) {
                    b56Var = (b56) hc1Var;
                    int i17 = b56Var.n;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        b56Var.n = i17 - Integer.MIN_VALUE;
                    } else {
                        b56Var = new b56(this, hc1Var);
                    }
                } else {
                    b56Var = new b56(this, hc1Var);
                }
                Object obj9 = b56Var.m;
                int i18 = b56Var.n;
                if (i18 == 0) {
                    ct1.a0(obj9);
                    em emVar9 = new em(ho2Var, (byte) 10);
                    b56Var.n = 1;
                    if (go2Var.b(emVar9, b56Var) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (i18 != 1) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj9);
                }
                return f88Var;
            default:
                if (hc1Var instanceof bg7) {
                    bg7Var = (bg7) hc1Var;
                    int i19 = bg7Var.n;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        bg7Var.n = i19 - Integer.MIN_VALUE;
                    } else {
                        bg7Var = new bg7(this, hc1Var);
                    }
                } else {
                    bg7Var = new bg7(this, hc1Var);
                }
                Object obj10 = bg7Var.m;
                int i20 = bg7Var.n;
                if (i20 == 0) {
                    ct1.a0(obj10);
                    em emVar10 = new em(ho2Var, (byte) 11);
                    bg7Var.n = 1;
                    if (go2Var.b(emVar10, bg7Var) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (i20 != 1) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj10);
                }
                return f88Var;
        }
    }
}
