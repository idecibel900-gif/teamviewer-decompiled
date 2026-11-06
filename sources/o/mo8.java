package o;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import javax.microedition.khronos.egl.EGL10;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class mo8 {
    public static final aw0 A;
    public static final float B;
    public static final aw0 C;
    public static final float D;
    public static final aw0 E;
    public static final float F;
    public static final aw0 G;
    public static final aw0 H;
    public static final ax6 I;
    public static final float J;
    public static final aw0 K;
    public static final float L;
    public static final aw0 M;
    public static final aw0 N;
    public static final float O;
    public static final float P;
    public static final float Q;
    public static final ax6 R;
    public static final float S;
    public static final aw0 T;
    public static final aw0 U;
    public static final float V;
    public static final aw0 W;
    public static final aw0 X;
    public static final yb8 Y;
    public static final yb8 Z;
    public static final aw a;
    public static final cr b;
    public static final yy0 c;
    public static final yy0 e;
    public static final yy0 h;
    public static final wj5 v;
    public static final aw0 y;
    public static final float z;
    public static final yy0 d = new yy0(-1454290325, false, new az0(5));
    public static final yy0 f = new yy0(-864298224, false, new gz0(9));
    public static final yy0 g = new yy0(-774237934, false, new gz0(10));
    public static final yy0 i = new yy0(-1429684928, false, new iz0(14));
    public static final sp1 j = new sp1();
    public static final float[] k = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] l = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final f4 m = new f4(Boolean.FALSE);
    public static final boolean[] n = new boolean[3];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f1494o = {48, 49, 53, 0};
    public static final byte[] p = {48, 49, 48, 0};
    public static final byte[] q = {48, 48, 57, 0};
    public static final byte[] r = {48, 48, 53, 0};
    public static final byte[] s = {48, 48, 49, 0};
    public static final byte[] t = {48, 48, 49, 0};
    public static final byte[] u = {48, 48, 50, 0};
    public static final aw0 w = aw0.D;
    public static final float x = 1.0f;

    static {
        byte b2 = 0;
        a = new aw(b2);
        byte b3 = 1;
        b = new cr(b3);
        c = new yy0(-1131826196, false, new zy0(b2));
        byte b4 = 8;
        e = new yy0(-1556302199, false, new fz0(b4));
        h = new yy0(1888388247, false, new hz0(b3));
        v = new wj5(b4);
        aw0 aw0Var = aw0.t;
        y = aw0Var;
        z = 0.38f;
        A = aw0Var;
        B = 0.12f;
        C = aw0Var;
        D = 0.38f;
        aw0 aw0Var2 = aw0.G;
        E = aw0Var2;
        F = 0.38f;
        G = aw0Var2;
        H = aw0Var;
        ax6 ax6Var = ax6.q;
        I = ax6Var;
        J = 28.0f;
        K = aw0.q;
        L = 24.0f;
        M = aw0.r;
        N = aw0.y;
        O = 40.0f;
        P = 32.0f;
        Q = 2.0f;
        R = ax6Var;
        S = 52.0f;
        aw0 aw0Var3 = aw0.w;
        T = aw0Var3;
        U = aw0Var3;
        V = 16.0f;
        W = aw0Var2;
        X = aw0Var2;
        Y = new yb8((byte) 6);
        Z = new yb8((byte) 7);
    }

    public static final fs4 A(fs4 fs4Var, Function1 function1) {
        return fs4Var.f(new uh7(function1));
    }

    public static final void a(final String str, final Function1 function1, final boolean z2, final boolean z3, final boolean z4, final Function0 function0, final Function1 function2, ux2 ux2Var, final int i2) {
        str.getClass();
        function1.getClass();
        function0.getClass();
        function2.getClass();
        ux2Var.Y(1252263800);
        int i3 = i2 | (ux2Var.f(str) ? 4 : 2) | (ux2Var.h(function1) ? 32 : 16) | (ux2Var.g(z2) ? 256 : 128) | (ux2Var.g(z3) ? 2048 : 1024) | (ux2Var.g(z4) ? 16384 : 8192) | (ux2Var.h(function0) ? 131072 : 65536) | (ux2Var.h(function2) ? 1048576 : 524288);
        byte b2 = 0;
        if (ux2Var.N(i3 & 1, (599187 & i3) != 599186)) {
            String strValueOf = String.valueOf(str.length());
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = new sq2();
                ux2Var.g0(objK);
            }
            sq2 sq2Var = (sq2) objK;
            q57 q57Var = (q57) ux2Var.j(b11.q);
            Object objK2 = ux2Var.K();
            if (objK2 == awVar) {
                objK2 = new z9(sq2Var, null, b2);
                ux2Var.g0(objK2);
            }
            ck3.i(f88.a, (hw2) objK2, ux2Var);
            Object objK3 = ux2Var.K();
            if (objK3 == awVar) {
                objK3 = new t2((byte) 4);
                ux2Var.g0(objK3);
            }
            uf0.b(function0, au8.O(1305529280, new q9(z3, z4, function2, str), ux2Var), cp6.a(cs4.b, false, (Function1) objK3), au8.O(-2086517438, new r9(z4, function0), ux2Var), e8.d, au8.O(1415347077, new s9(str, z4, z2, strValueOf, z3, function2, q57Var, sq2Var, function1), ux2Var), null, 0L, 0L, 0L, 0L, new a12(5), ux2Var, ((i3 >> 15) & 14) | 1772592, 3072, 8080);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2(str, function1, z2, z3, z4, function0, function2, i2) { // from class: o.t9
                public final /* synthetic */ String m;
                public final /* synthetic */ Function1 n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ boolean f2092o;
                public final /* synthetic */ boolean p;
                public final /* synthetic */ boolean q;
                public final /* synthetic */ Function0 r;
                public final /* synthetic */ Function1 s;

                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(1);
                    mo8.a(this.m, this.n, this.f2092o, this.p, this.q, this.r, this.s, (ux2) obj, iY);
                    return f88.a;
                }
            };
        }
    }

    public static ln1 b() {
        return new ln1(1.0f, 1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int c(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.mo8.c(int, int, int, boolean):int");
    }

    /* JADX WARN: Code duplicated, block: B:109:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00cf A[Catch: gn3 -> 0x0193, TRY_ENTER, TRY_LEAVE, TryCatch #4 {gn3 -> 0x0193, blocks: (B:35:0x00bf, B:39:0x00cf, B:53:0x00f4, B:55:0x0108, B:59:0x011d, B:63:0x0125), top: B:107:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:57:0x011a  */
    /* JADX WARN: Code duplicated, block: B:58:0x011c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0120  */
    /* JADX WARN: Code duplicated, block: B:62:0x0123  */
    /* JADX WARN: Code duplicated, block: B:72:0x016e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x016e -> B:73:0x0177). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object d(o.df r27, int r28, int r29, o.in1 r30, o.jc1 r31) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.mo8.d(o.df, int, int, o.in1, o.jc1):java.lang.Object");
    }

    public static final boolean e(boolean z2, df dfVar, int i2) {
        w44 w44Var = (w44) dfVar.c;
        if (z2) {
            if (w44Var.h() > i2) {
                return true;
            }
            return w44Var.h() == i2 && w44Var.i() > 0;
        }
        if (w44Var.h() < i2) {
            return true;
        }
        return w44Var.h() == i2 && w44Var.i() < 0;
    }

    public static final Bitmap f(vi viVar) {
        if (viVar instanceof vi) {
            return viVar.a;
        }
        yq4.r("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public static final Bundle g(vd5... vd5VarArr) {
        Bundle bundle = new Bundle(vd5VarArr.length);
        for (vd5 vd5Var : vd5VarArr) {
            String str = (String) vd5Var.m;
            Object obj = vd5Var.n;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        hk0.g(fx3.h("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, "\""));
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    hk0.g(fx3.h("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, "\""));
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static void h(String str, EGL10 egl10) {
        while (true) {
            int iEglGetError = egl10.eglGetError();
            if (iEglGetError == 12288) {
                return;
            }
            bu7.MAIN.a(new pc0((Object) String.format("%s: EGL error: 0x%x", Arrays.copyOf(new Object[]{str, Integer.valueOf(iEglGetError)}, 2)), (byte) 4));
        }
    }

    public static void i(o61 o61Var, ba4 ba4Var, n61 n61Var) {
        n61Var.f1543o = -1;
        w51 w51Var = n61Var.L;
        int[] iArr = n61Var.o0;
        w51 w51Var2 = n61Var.K;
        w51 w51Var3 = n61Var.I;
        w51 w51Var4 = n61Var.J;
        w51 w51Var5 = n61Var.H;
        n61Var.p = -1;
        int[] iArr2 = o61Var.o0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i2 = w51Var5.g;
            int iO = o61Var.o() - w51Var4.g;
            w51Var5.i = ba4Var.k(w51Var5);
            w51Var4.i = ba4Var.k(w51Var4);
            ba4Var.d(w51Var5.i, i2);
            ba4Var.d(w51Var4.i, iO);
            n61Var.f1543o = 2;
            n61Var.X = i2;
            int i3 = iO - i2;
            n61Var.T = i3;
            int i4 = n61Var.a0;
            if (i3 < i4) {
                n61Var.T = i4;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i5 = w51Var3.g;
        int i6 = o61Var.i() - w51Var2.g;
        w51Var3.i = ba4Var.k(w51Var3);
        w51Var2.i = ba4Var.k(w51Var2);
        ba4Var.d(w51Var3.i, i5);
        ba4Var.d(w51Var2.i, i6);
        if (n61Var.Z > 0 || n61Var.f0 == 8) {
            k67 k67VarK = ba4Var.k(w51Var);
            w51Var.i = k67VarK;
            ba4Var.d(k67VarK, n61Var.Z + i5);
        }
        n61Var.p = 2;
        n61Var.Y = i5;
        int i7 = i6 - i5;
        n61Var.U = i7;
        int i8 = n61Var.b0;
        if (i7 < i8) {
            n61Var.U = i8;
        }
    }

    public static final qo j(qo qoVar) {
        qo qoVarC = qoVar.c();
        int iB = qoVarC.b();
        for (int i2 = 0; i2 < iB; i2++) {
            qoVarC.e(i2, qoVar.a(i2));
        }
        return qoVarC;
    }

    public static h41 k(byte[] bArr) {
        String message;
        String str;
        e51 e51VarT;
        fu6 fu6VarH;
        try {
            try {
                Object object = new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
                object.getClass();
                Map map = (Map) object;
                Long l2 = (Long) map.get("m_DynGateID");
                DyngateID dyngateIDFromLong = DyngateID.FromLong(l2 != null ? l2.longValue() : 0L);
                String str2 = (String) map.get("m_TargetIP");
                Integer num = (Integer) map.get("m_ConnectionType");
                if (num != null) {
                    ju juVar = e51.n;
                    int iIntValue = num.intValue();
                    juVar.getClass();
                    e51VarT = ju.t(iIntValue);
                } else {
                    e51VarT = null;
                }
                String str3 = (String) map.get("m_Password");
                dyngateIDFromLong.getClass();
                h41 h41Var = new h41(dyngateIDFromLong, str3, e51VarT, str2);
                h41Var.g = (Date) map.get("m_EndTime");
                Object obj = map.get("m_PartnerListBuddyID");
                Integer num2 = obj instanceof Integer ? (Integer) obj : null;
                h41Var.j = num2 != null ? num2.intValue() : 0;
                Object obj2 = map.get("m_PartnerListBuddyIDString");
                String str4 = obj2 instanceof String ? (String) obj2 : null;
                if (str4 == null) {
                    str4 = "";
                }
                h41Var.k = str4;
                Object obj3 = map.get("m_PartnerListSession");
                Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
                h41Var.i = bool != null ? bool.booleanValue() : false;
                Integer num3 = (Integer) map.get("m_SessionResult");
                if (num3 != null) {
                    yi5 yi5Var = fu6.n;
                    int iIntValue2 = num3.intValue();
                    yi5Var.getClass();
                    fu6VarH = yi5.h(iIntValue2);
                } else {
                    fu6VarH = null;
                }
                if (fu6VarH == null) {
                    fu6VarH = fu6.Unknown;
                }
                h41Var.h = fu6VarH;
                h41Var.f = (Date) map.get("m_StartTime");
                return h41Var;
            } catch (NegativeArraySizeException e2) {
                ye4.c("ConnectionEntryWithIPs", "error in deserialization: " + e2.getMessage());
                return null;
            }
        } catch (StreamCorruptedException e3) {
            message = e3.getMessage();
            str = "ConnectionEntryWithIPs( byte[] ): could not deserialize object - StreamCorruptedExc: ";
            e41.s(str, message, "ConnectionEntryWithIPs");
            return null;
        } catch (IOException e4) {
            message = e4.getMessage();
            str = "ConnectionEntryWithIPs( byte[] ): could not deserialize object - IOException: ";
            e41.s(str, message, "ConnectionEntryWithIPs");
            return null;
        } catch (ClassNotFoundException e5) {
            message = e5.getMessage();
            str = "ConnectionEntryWithIPs( byte[] ): could not deserialize object - ClassNotFoundExc: ";
            e41.s(str, message, "ConnectionEntryWithIPs");
            return null;
        } catch (IllegalArgumentException e6) {
            e41.s("error in deserialization: ", e6.getMessage(), "ConnectionEntryWithIPs");
            return null;
        }
    }

    public static final boolean l(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static int[] m(String str, Properties properties) {
        String strN = n(str, properties);
        if (strN != null) {
            return strN.length() == 0 ? new int[0] : lv0.O0(bq6.l0(bq6.k0(new fx(ub7.n0(strN, new String[]{";"}, 6), (byte) 1), new at4((byte) 10))));
        }
        return null;
    }

    public static String n(String str, Properties properties) {
        String property = properties.getProperty(str);
        if (property != null) {
            return ub7.x0(property).toString();
        }
        return null;
    }

    public static boolean o(int i2) {
        return (i2 & 32768) != 0;
    }

    public static final boolean p(df dfVar, int i2) {
        return i2 <= dfVar.c() && ((w44) dfVar.c).h() <= i2;
    }

    public static boolean q(int i2) {
        if (i2 != 15 && i2 != 255) {
            if (i2 == 32768) {
                return Build.VERSION.SDK_INT >= 30;
            }
            if (i2 != 32783) {
                return i2 == 33023 || i2 == 0;
            }
            int i3 = Build.VERSION.SDK_INT;
            return i3 < 28 || i3 > 29;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x020a  */
    public static final long r(int i2, int i3, String str) {
        char cCharAt;
        int i4;
        long j2;
        char c2;
        char c3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long j3;
        char c4;
        int i10;
        int i11;
        int i12;
        long j4 = 4294967295L;
        if (i2 == i3) {
            return (((long) i2) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
        }
        char cCharAt2 = str.charAt(i2);
        boolean z2 = cCharAt2 == '-';
        if (z2) {
            i4 = i2 + 1;
            if (i4 == i3) {
                return (((long) i4) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
            }
            cCharAt = str.charAt(i4);
            if (((char) (cCharAt - '0')) >= '\n' && cCharAt != '.') {
                return (((long) i4) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
            }
        } else {
            cCharAt = cCharAt2;
            i4 = i2;
        }
        int length = str.length();
        int i13 = i4;
        long j5 = 0;
        while (true) {
            if (i13 == i3) {
                j2 = j4;
                break;
            }
            j2 = j4;
            int i14 = cCharAt - '0';
            if (((char) i14) >= '\n') {
                break;
            }
            j5 = (j5 * 10) + ((long) i14);
            i13++;
            cCharAt = i13 < length ? str.charAt(i13) : (char) 0;
            j4 = j2;
        }
        int i15 = i13 - i4;
        char c5 = '0';
        if (i13 == i3 || cCharAt != '.') {
            c2 = ' ';
            c3 = 1;
            i5 = i13;
            i6 = i5;
            i7 = 0;
        } else {
            int i16 = i13 + 1;
            c2 = ' ';
            i5 = i16;
            while (true) {
                c3 = 1;
                if (i3 - i5 < 4) {
                    i12 = i16;
                    break;
                }
                i12 = i16;
                long jCharAt = ((long) str.charAt(i5)) | (((long) str.charAt(i5 + 1)) << 16) | (((long) str.charAt(i5 + 2)) << 32) | (((long) str.charAt(i5 + 3)) << 48);
                long j6 = jCharAt - 13511005043687472L;
                int i17 = (((jCharAt + 19703549022044230L) | j6) & (-35747867511423104L)) != 0 ? -1 : (int) ((j6 * 281475406208040961L) >>> 48);
                if (i17 < 0) {
                    break;
                }
                j5 = (j5 * 10000) + ((long) i17);
                i5 += 4;
                i16 = i12;
            }
            char cCharAt3 = i5 < length ? str.charAt(i5) : (char) 0;
            loop2: while (true) {
                cCharAt = cCharAt3;
                while (true) {
                    if (i5 == i3) {
                        break loop2;
                    }
                    int i18 = cCharAt - '0';
                    if (((char) i18) >= '\n') {
                        break loop2;
                    }
                    j5 = (j5 * 10) + ((long) i18);
                    i5++;
                    if (i5 < length) {
                        break;
                    }
                    cCharAt = 0;
                }
                cCharAt3 = str.charAt(i5);
            }
            i7 = i12 - i5;
            i15 -= i7;
            i6 = i12;
        }
        if (i15 == 0) {
            return (((long) i5) << c2) | (((long) Float.floatToRawIntBits(Float.NaN)) & j2);
        }
        if ((cCharAt | ' ') == 101) {
            i8 = i5 + 1;
            char cCharAt4 = i8 < length ? str.charAt(i8) : (char) 0;
            char c6 = cCharAt4 == '-' ? c3 : (char) 0;
            if (c6 != 0 || cCharAt4 == '+') {
                i8 = i5 + 2;
            }
            char cCharAt5 = str.charAt(i8);
            i9 = 0;
            while (true) {
                if (i8 == i3) {
                    i11 = i7;
                    break;
                }
                int i19 = cCharAt5 - c5;
                i11 = i7;
                if (((char) i19) >= '\n') {
                    break;
                }
                if (i9 < 1024) {
                    i9 = (i9 * 10) + i19;
                }
                i8++;
                cCharAt5 = i8 < length ? str.charAt(i8) : (char) 0;
                i7 = i11;
                c5 = '0';
            }
            if (c6 != 0) {
                i9 = -i9;
            }
            i7 = i11 + i9;
        } else {
            i8 = i5;
            i9 = 0;
        }
        int i20 = 19;
        if (i15 > 19) {
            char cCharAt6 = str.charAt(i4);
            int i21 = i4;
            while (true) {
                if (i8 == i3) {
                    i10 = i20;
                    break;
                }
                if (cCharAt6 != '0' && cCharAt6 != '.') {
                    i10 = 19;
                    break;
                }
                if (cCharAt6 == '0') {
                    i15--;
                }
                i21++;
                cCharAt6 = i21 < length ? str.charAt(i21) : (char) 0;
                i20 = 19;
            }
            if (i15 > i10) {
                char cCharAt7 = str.charAt(i4);
                j3 = 0;
                while (i4 != i13 && Long.compareUnsigned(j3, 1000000000000000000L) < 0) {
                    j3 = (j3 * 10) + ((long) (cCharAt7 - '0'));
                    i4++;
                    cCharAt7 = i4 < length ? str.charAt(i4) : (char) 0;
                }
                if (Long.compareUnsigned(j3, 1000000000000000000L) >= 0) {
                    i7 = (i13 - i4) + i9;
                } else {
                    char cCharAt8 = str.charAt(i6);
                    int i22 = i6;
                    while (i22 != i5 && Long.compareUnsigned(j3, 1000000000000000000L) < 0) {
                        j3 = (j3 * 10) + ((long) (cCharAt8 - '0'));
                        i22++;
                        cCharAt8 = i22 < length ? str.charAt(i22) : (char) 0;
                    }
                    i7 = (i6 - i22) + i9;
                }
                c4 = c3;
            } else {
                j3 = j5;
                c4 = 0;
            }
        } else {
            j3 = j5;
            c4 = 0;
        }
        if (-10 <= i7 && i7 < 11 && c4 == 0 && Long.compareUnsigned(j3, 16777216L) <= 0) {
            float f2 = j3;
            float[] fArr = k;
            float f3 = i7 < 0 ? f2 / fArr[-i7] : f2 * fArr[i7];
            if (z2) {
                f3 = -f3;
            }
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(f3)) & j2);
        }
        if (j3 == 0) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(z2 != 0 ? -0.0f : 0.0f)) & j2);
        }
        if (-126 > i7 || i7 >= 128) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8)))) & j2);
        }
        long j7 = l[i7 + 325];
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j3);
        long j8 = j3 << iNumberOfLeadingZeros;
        long j9 = j8 & j2;
        long j10 = j8 >>> c2;
        long j11 = j7 & j2;
        long j12 = j7 >>> c2;
        long j13 = j10 * j12;
        long j14 = j12 * j9;
        long j15 = j13 + ((((j10 * j11) + ((j9 * j11) >>> c2)) + (j14 & j2)) >>> c2) + (j14 >>> c2);
        int i23 = (int) (j15 >>> 63);
        long j16 = j15 >>> (i23 + 9);
        int i24 = iNumberOfLeadingZeros + (i23 ^ 1);
        long j17 = j15 & 511;
        if (j17 == 511 || (j17 == 0 && (3 & j16) == 1)) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8)))) & j2);
        }
        long j18 = (j16 + 1) >>> c3;
        if (j18 >= 9007199254740992L) {
            i24--;
            j18 = 4503599627370496L;
        }
        long j19 = j18 & (-4503599627370497L);
        long j20 = (((((long) i7) * 217706) >> 16) + 1087) - ((long) i24);
        if (j20 < 1 || j20 > 2046) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8)))) & j2);
        }
        return (((long) i8) << c2) | (((long) Float.floatToRawIntBits((float) Double.longBitsToDouble((j20 << 52) | j19 | (z2 != 0 ? Long.MIN_VALUE : 0L)))) & j2);
    }

    public static final Object s(Object obj) {
        return obj instanceof xx0 ? ct1.A(((xx0) obj).a) : obj;
    }

    public static void t(wk0 wk0Var, float f2) {
        mf6 mf6Var = (mf6) wk0Var.n;
        cm0 cm0Var = (cm0) wk0Var.f2420o;
        boolean useCompatPadding = cm0Var.getUseCompatPadding();
        boolean preventCornerOverlap = cm0Var.getPreventCornerOverlap();
        if (f2 != mf6Var.e || mf6Var.f != useCompatPadding || mf6Var.g != preventCornerOverlap) {
            mf6Var.e = f2;
            mf6Var.f = useCompatPadding;
            mf6Var.g = preventCornerOverlap;
            mf6Var.b(null);
            mf6Var.invalidateSelf();
        }
        if (!cm0Var.getUseCompatPadding()) {
            wk0Var.E(0, 0, 0, 0);
            return;
        }
        mf6 mf6Var2 = (mf6) wk0Var.n;
        float f3 = mf6Var2.e;
        float f4 = mf6Var2.a;
        int iCeil = (int) Math.ceil(nf6.a(f3, f4, cm0Var.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(nf6.b(f3, f4, cm0Var.getPreventCornerOverlap()));
        wk0Var.E(iCeil, iCeil2, iCeil, iCeil2);
    }

    public static boolean u(xs0 xs0Var, i07 i07Var, i07 i07Var2) {
        if (xs0Var.o0(i07Var) == xs0Var.o0(i07Var2) && xs0Var.r0(i07Var) == xs0Var.r0(i07Var2)) {
            if ((xs0Var.h(i07Var) == null) == (xs0Var.h(i07Var2) == null) && xs0Var.X(xs0Var.b0(i07Var), xs0Var.b0(i07Var2))) {
                if (!xs0Var.O(i07Var, i07Var2)) {
                    int iO0 = xs0Var.o0(i07Var);
                    for (int i2 = 0; i2 < iO0; i2++) {
                        h58 h58VarM = xs0Var.m(i07Var, i2);
                        h58 h58VarM2 = xs0Var.m(i07Var2, i2);
                        if (xs0Var.o(h58VarM) == xs0Var.o(h58VarM2) && (xs0Var.o(h58VarM) || (xs0Var.c0(h58VarM) == xs0Var.c0(h58VarM2) && v(xs0Var, xs0Var.p0(h58VarM), xs0Var.p0(h58VarM2))))) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean v(xs0 xs0Var, sz3 sz3Var, sz3 sz3Var2) {
        if (sz3Var == sz3Var2) {
            return true;
        }
        g07 g07VarL0 = xs0Var.l0(sz3Var);
        g07 g07VarL1 = xs0Var.l0(sz3Var2);
        if (g07VarL0 != null && g07VarL1 != null) {
            return u(xs0Var, g07VarL0, g07VarL1);
        }
        um2 um2VarS0 = xs0Var.s0(sz3Var);
        um2 um2VarS1 = xs0Var.s0(sz3Var2);
        return um2VarS0 != null && um2VarS1 != null && u(xs0Var, xs0Var.f0(um2VarS0), xs0Var.f0(um2VarS1)) && u(xs0Var, xs0Var.x(um2VarS0), xs0Var.x(um2VarS1));
    }

    public static final Bitmap.Config w(int i2) {
        if (i2 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i2 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i2 == 2) {
            return Bitmap.Config.RGB_565;
        }
        if (i2 == 3) {
            return Bitmap.Config.RGBA_F16;
        }
        return i2 == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final byte[] x(BitSet bitSet) {
        int length = ((bitSet.length() - 1) / 8) + 1;
        byte[] bArr = new byte[length];
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            BitSet bitSet2 = bitSet.get(i2 * 8, i3 * 8);
            bitSet2.getClass();
            bArr[i2] = (byte) (y(bitSet2) & 255);
            i2 = i3;
        }
        return bArr;
    }

    public static final int y(BitSet bitSet) {
        int iMin = (int) Math.min(32.0d, bitSet.length());
        int i2 = 0;
        if (iMin < 0) {
            return 0;
        }
        int i3 = 1;
        int i4 = 0;
        while (true) {
            if (bitSet.get(i2)) {
                i4 |= i3;
            }
            i3 <<= 1;
            if (i2 == iMin) {
                return i4;
            }
            i2++;
        }
    }

    public static final BitSet z(byte[] bArr) {
        bArr.getClass();
        BitSet bitSet = new BitSet();
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 8;
            byte b2 = bArr[i2];
            for (int i4 = 0; i4 < 8; i4++) {
                boolean z2 = true;
                if (((1 << i4) & b2) == 0) {
                    z2 = false;
                }
                bitSet.set(i3 + i4, z2);
            }
        }
        return bitSet;
    }
}
