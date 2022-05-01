package com.example.java_0302_day.Rep1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 程世玉
 * @create 2022/3/3 15:40
 * @PROJECT_NAME JavaSE
 * @Description 限定符
 */
public class rep4 {
    public static void main(String[] args) {
        String centent = "a / an  art.一(个)；每一(个)；(同类事物中)任一个\n" +
                "abandon  vt. 离弃，丢弃；遗弃，抛弃；放弃\n" +
                "abdomen  n. 腹，腹部(胸与骨盆间的身体部分)\n" +
                "abide  vi. (abode, abided) (by)遵守；坚持\n" +
                "ability  n. 能力；本领；才能，才干；专门技能，天资\n" +
                "able  a. 有(能力、时间、知识等)做某事，有本事的，有才华的\n" +
                "abnormal  a. 反常的，不正常的，不规则的\n" +
                "aboard  ad.&prep. 在船(飞机、车)上；ad. 上船(飞机)\n" +
                "abolish  vt. 废除(法律、习惯等)；取消\n" +
                "abound  vi. 大量存在；(in, with)充满，富于\n" +
                "about  ad. 在周围；大约 prep. 关于；在周围 a. 准备\n" +
                "above  a. 上述的 ad. 在上面  prep. 在…之上，高于\n" +
                "abroad  ad. 到国外，在国外；在传播，在流传\n" +
                "abrupt  a. 突然的，出其不意的；(行为等)粗鲁无礼的\n" +
                "absence  n. 缺乏，不存在；缺席，不在；缺席的时间\n" +
                "absent  a. 缺席的；缺乏的，不存在的；心不在焉的\n" +
                "absolute  a. 绝对的，完全的；确实的，肯定的\n" +
                "absorb  vt. 吸收(水、光、蒸汽等）；使全神贯注\n" +
                "abstract  a. 抽象的 n. 摘要，梗概 vt. 提取；摘录要点\n" +
                "absurd  a. 荒谬的，荒诞的，荒唐可笑的；不合理的\n" +
                "abundance  n. 丰富，充裕，大量\n" +
                "abundant  a. 大量(充足)的；(in)丰富(富裕)的\n" +
                "abuse  vt. 滥用；辱骂；诋毁 n. 滥用；恶习；弊端\n" +
                "academic  a. 学院的，大学的；学术性的；理论的\n" +
                "academy  n. (高等)专科院校；学术社团，协会，研究院\n" +
                "accelerate  v. 使加速，使增速，促进 vi. 加快，增加\n" +
                "accent  n. 口音，腔调；重音(符号) vt. 重读\n" +
                "accept  vt. 接受，领受；认可，同意 vi. 同意，认可\n" +
                "acceptance  n. 接受，接收，验收，接纳；承认，alleviate  v. 减轻，缓和，缓解(痛苦等)\n" +
                "alliance  n. 同盟，同盟国；结盟，联姻\n" +
                "allocate  v. 分配，分派；拨给；划归\n" +
                "Allow  vt. 允许，准许；承认；给予；(for)考虑到\n" +
                "allowance  n. 补贴，津贴；零用钱；减价，折扣；允许\n" +
                "Alloy  n. 合金vt. 将…铸成合金\n" +
                "Ally  n. 同盟者，同盟国，vt. 使结盟；与…有关联\n" +
                "almost  adv. 几乎，差不多\n" +
                "alone  a. 单独的，孤独的 ad. 单独地，独自地；仅仅\n" +
                "along  ad. 向前；和…一起，一同 prep. 沿着，顺着\n" +
                "alongside  ad. 在旁边 prep. 和…在一起；在…旁边\n" +
                "aloud  adv. 出声地，大声地\n" +
                "alphabet  n. 字母表；初步，入门\n" +
                "already  ad. 已，已经，早已\n" +
                "Also  ad. 而且(也)，此外(还)；同样地\n" +
                "Alter  vt. 改变，更改；改做(衣服) vi. 改变，变化\n" +
                "alternate  a. 交替的，轮流的 v. (使)交替，(使)轮流\n" +
                "alternative  n. 二选一；供选择的东西；取舍 a. 二选一的\n" +
                "although  conj.尽管，虽然…但是\n" +
                "altitude  n. 高度，海拔；[pl.]高处，高地\n" +
                "altogether  ad. 完全，总之，全部地；总共；总而言之\n" +
                "aluminum  n. (aluminium)铝\n" +
                "always  ad. 总是，无例外地；永远，始终\n" +
                "amateur  a.&n. 业余(水平)的(运动员、艺术家等)\n" +
                "amaze  vt. 使惊奇，使惊愕；使困惑 vi. 表现出惊奇\n" +
                "ambassador  n. 大使；特使，(派驻国际组织的)代表\n" +
                "ambiguous  a. 引起歧义的，模棱两可的，含糊不清的\n" +
                "ambition  n. 对(成功、权力等)的强烈欲望，野心；雄心\n" +
                "ambitious  a. 有抱负的，雄心勃勃的；有野心的\n" +
                "ambulance  n. 救护车，救护船，救护飞机\n" +
                "amend  vt. 修改，修订，改进\n" +
                "amiable  a. 和蔼可亲的，友善的，亲切的\n" +
                "Amid  prep. 在…中间，在…之中，被…围绕\n" +
                "among  prep. 在…之中；在一群(组)之中；于…之间\n" +
                "amount  n. 总数，数量；数额 v. 共计；等同，接近(to)\n" +
                "ample  a. 充分的，富裕的；宽敞的，宽大的\n" +
                "amplifier  n. 放大器，扩大器\n" +
                "amplify  vt. 放大，增强；详述，详加解说\n" +
                "amuse  vt. 向…提供娱乐，使…消遣；引人发笑\n" +
                "analogue  n. 类似物；相似体；模拟\n" +
                "analogy  n. 类似，相似，类比，类推\n" +
                "analyse  vt. （analyze）分析，分解\n" +
                "analysis  n. (pl.analyses)分析；分解\n" +
                "analytic  a. (analytical)分析的；分解的\n" +
                "ancestor  n. 祖宗，祖先；原型，先驱\n" +
                "anchor  n. /v. 锚；危难时可依靠的人或物；用锚泊船\n" +
                "ancient  a. 古代的，古老的，古式的\n" +
                "and  conj.和，与，而且；那么；接连，又\n" +
                "anecdote  n. 轶事，趣闻，短故事\n" +
                "angel  n. 天使，安琪儿\n" +
                "anger  n. 愤怒，气愤 vt. 使发怒，激怒 vi. 发怒\n" +
                "angle  n. 角，角度 v. 钓鱼；(采用各种方法）取得\n" +
                "angry  a. 生气的，愤怒的；(天气)风雨交加的\n" +
                "anguish  n. (尤指心灵上的)极度痛苦，烦恼\n" +
                "animal  n. 动物，野兽，牲畜 a. 动物的，野兽的\n" +
                "ankle  n. 足踝，踝关节\n" +
                "anniversary  n. 周年，周年纪念日\n" +
                "announce  v. 正式宣布；发表；通告；广播（电台节目）\n" +
                "annoy  vt. 使恼怒，使生气；打扰 vi. 招人讨厌\n" +
                "annual  a. 每年的，一年生的 n. 年刊；一年生植物\n" +
                "anonymous  a. 匿名的，无名的，姓氏不明的\n" +
                "another  a. 另一个，又，再 pron. 另一个，类似的一个\n" +
                "answer  vt. 回答beam  n. (横)梁，桁条；(光线的)束，柱 v. 微笑\n" +
                "bean  n. 豆；菜豆，蚕豆\n" +
                "bear  n. 熊 v. 忍受，容忍；负担；结果实，生子女\n" +
                "beard  n. 胡须\n" +
                "bearing  n. 轴承；忍受；关系，影响；举止；方向\n" +
                "beast  n. 兽，牲畜；凶残的人，举止粗鲁的人\n" +
                "beat  n. 敲打；(心脏等)跳动 v. 打败；(心脏等)跳动\n" +
                "beautiful  a. 美的，美丽的；出色的，完美的\n" +
                "beauty  n. 美，美丽；美人，美丽的事物\n" +
                "because  conj.因为，由于\n" +
                "become  vi. 变成，开始变得vt. 适合，同…相称\n" +
                "bed  n. 床，床位；(苗)床，坛；河床，(湖、海的)底\n" +
                "bee  n. 蜂，蜜蜂；忙碌的人\n" +
                "beef  n. 牛肉\n" +
                "beer  n. 啤酒\n" +
                "before  prep. (指时间)在…以前，在..前面，在..之前\n" +
                "beforehand  ad. 预先，事先\n" +
                "beg  vt. 请求，乞求 vi. 恳请，行乞\n" +
                "begin  v. (began, begun)开始，着手\n" +
                "beginning  n. 开始，开端；起源，早期阶段\n" +
                "behalf  n. 利益\n" +
                "behave  v. 举止，举动，表现；运转，开动\n" +
                "behavior  n. (behaviour)行为，举止；(机器等)运转情况\n" +
                "behind  prep. 在…的背后，(遗留)在..后面；落后于\n" +
                "being  n. 生物，生命，存在\n" +
                "belief  n. 信任，相信，信念；信仰，信条\n" +
                "believe  vt. 相信，认为 vi. 相信，信任，信奉\n" +
                "bell  n. 钟，铃\n" +
                "belly  n. 肚子，腹部；(像肚子一样)鼓起的部分，膛\n" +
                "belong  v. (to)属于，附属，隶属；应归入(类别，范畴等)\n" +
                "beloved  a. /n. 受爱戴的，敬爱的；爱人，被心爱的人\n" +
                "below  prep. 在…下面，在…以下 ad. 在下面，向下\n" +
                "belt  n. (皮)带，腰带；地带\n" +
                "bench  n. 长凳，条凳；(工作)台，座\n" +
                "bend  v. (使)弯曲；屈从，屈服 n. 弯曲(处)，曲折处\n" +
                "beneath  prep. 在…下边，在…之下 ad. 在下方\n" +
                "beneficial  a. (to)有利的，有益的\n" +
                "benefit  n. 利益，好处，恩惠 v. 有益于；(from, by)受益\n" +
                "benign  a. (病)良性的，(气候)良好的，仁慈的，和蔼的\n" +
                "beside  prep. 在…旁边，在…附近；和…相比\n" +
                "besides  ad. 此外；并且 prep. 于…之外；除…以外\n" +
                "best  a. 最好的(good和well最高级) ad. 最好地；最\n" +
                "bet  v. 赌，打赌 n. 打赌，赌注\n" +
                "betray  v. 背叛，出卖；暴露，流露，泄露\n" +
                "better  a. 较好的 ad. 更好(地) v. 改良 n. 较佳者\n" +
                "between  prep. 在…之间，在(两者)之间 ad. 在中间\n" +
                "beverage  n. (水，酒等之外的)饮料\n" +
                "beware  v. 当";


        /**
         *   "*"
         *   "+"
         *   "?"
         */
//        String regex = "\\d+";

//        String regex = "ab+?";

        /*会把所有的ab abbbbb  a a a 查询出来，因为默认是贪心算法*/
//        String regex = "ab*?"

        /*会把所有的ab查询出来，其余不多查*/
//        String regex = "abc*?";


        /*把单词中所有以a开头， 以c或者d的单词查询出来*/
        String regex = "^(?i)a(cd)$";


        Pattern compile = Pattern.compile(regex);


        Matcher matcher = compile.matcher(centent);

        int i = 1;

        while (matcher.find()) {

            System.out.println("找到："+matcher.group() + ",第"+(i++)+"次！！！");
        }
    }
}
