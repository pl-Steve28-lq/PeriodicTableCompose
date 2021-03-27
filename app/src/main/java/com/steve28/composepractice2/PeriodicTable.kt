package com.steve28.composepractice2

object PeriodicTable {
    private val _items = listOf(
        Element(1, "수소", "H"),
        Element(2, "헬륨", "He"),
        Element(3, "리튬", "Li"),
        Element(4, "베릴륨", "Be"),
        Element(5, "붕소", "B"),
        Element(6, "탄소", "C"),
        Element(7, "질소", "N"),
        Element(8, "산소", "O"),
        Element(9, "플루오린", "F"),
        Element(10, "네온", "Ne"),
        Element(11, "나트륨", "Na"),
        Element(12, "마그네슘", "Mg"),
        Element(13, "알루미늄", "Al"),
        Element(14, "규소", "Si"),
        Element(15, "인", "P"),
        Element(16, "황", "S"),
        Element(17, "염소", "Cl"),
        Element(18, "아르곤", "Ar"),
        Element(19, "칼륨", "K"),
        Element(20, "칼슘", "Ca"),
        Element(21, "스칸듐", "Sc"),
        Element(22, "티타늄", "Ti"),
        Element(23, "바나듐", "V"),
        Element(24, "크롬", "Cr"),
        Element(25, "망가니즈", "Mn"),
        Element(26, "철", "Fe"),
        Element(27, "코발트", "Co"),
        Element(28, "니켈", "Ni"),
        Element(29, "구리", "Cu"),
        Element(30, "아연", "Zn"),
        Element(31, "갈륨", "Ga"),
        Element(32, "게르마늄", "Ge"),
        Element(33, "비소", "As"),
        Element(34, "셀레늄", "Se"),
        Element(35, "브로민", "Br"),
        Element(36, "크립톤", "Kr"),
        Element(37, "루비듐", "Rb"),
        Element(38, "스트론튬", "Sr"),
        Element(39, "이트륨", "Y"),
        Element(40, "지르코늄", "Zr"),
        Element(41, "나이오븀", "Nb"),
        Element(42, "몰리브데넘", "Mo"),
        Element(43, "테크네튬", "Tc"),
        Element(44, "루테늄", "Ru"),
        Element(45, "로듐", "Rh"),
        Element(46, "팔라듐", "Pd"),
        Element(47, "은", "Ag"),
        Element(48, "카드뮴", "Cd"),
        Element(49, "인듐", "In"),
        Element(50, "주석", "Sn"),
        Element(51, "안티모니", "Sb"),
        Element(52, "텔루륨", "Te"),
        Element(53, "아이오딘", "I"),
        Element(54, "제논", "Xe"),
        Element(55, "세슘", "Cs"),
        Element(56, "바륨", "Ba"),
        Element(72, "하프늄", "Hf"),
        Element(73, "탄탈럼", "Ta"),
        Element(74, "텅스텐", "W"),
        Element(75, "레늄", "Re"),
        Element(76, "오스뮴", "Os"),
        Element(77, "이리듐", "Ir"),
        Element(78, "백금", "Pt"),
        Element(79, "금", "Au"),
        Element(80, "수은", "Hg"),
        Element(81, "탈륨", "Tl"),
        Element(82, "납", "Pb"),
        Element(83, "비스무트", "Bi"),
        Element(84, "폴로늄", "Po"),
        Element(85, "아스타틴", "At"),
        Element(86, "라돈", "Rn"),
        Element(87, "프랑슘", "Fr"),
        Element(88, "라듐", "Ra"),
        Element(104, "러더포듐", "Rf"),
        Element(105, "더브늄", "Db"),
        Element(106, "시보귬", "Sg"),
        Element(107, "보륨", "Bh"),
        Element(108, "하슘", "Hs"),
        Element(109, "마이트너륨", "Mt"),
        Element(110, "다름슈타튬", "Ds"),
        Element(111, "뢴트게늄", "Rg"),
        Element(112, "코페르니슘", "Cn"),
        Element(113, "니호늄", "Nh"),
        Element(114, "플레로븀", "Fl"),
        Element(115, "모스코븀", "Mc"),
        Element(116, "리버모륨", "Lv"),
        Element(117, "테네신", "Ts"),
        Element(118, "오가네손", "Og"),
        Element(57, "란타넘", "La"),
        Element(58, "세륨", "Ce"),
        Element(59, "프라세오디뮴", "Pr"),
        Element(60, "네오디뮴", "Nd"),
        Element(61, "프로메튬", "Pm"),
        Element(62, "사마륨", "Sm"),
        Element(63, "유로퓸", "Eu"),
        Element(64, "가돌리늄", "Gd"),
        Element(65, "터븀", "Tb"),
        Element(66, "디스프로슘", "Dy"),
        Element(67, "홀뮴", "Ho"),
        Element(68, "어븀", "Er"),
        Element(69, "툴륨", "Tm"),
        Element(70, "이터븀", "Yb"),
        Element(71, "루테튬", "Lu"),
        Element(89, "악티늄", "Ac"),
        Element(90, "토륨", "Th"),
        Element(91, "프로트악티늄", "Pa"),
        Element(92, "우라늄", "U"),
        Element(93, "넵투늄", "Np"),
        Element(94, "플루토늄", "Pu"),
        Element(95, "아메리슘", "Am"),
        Element(96, "퀴륨", "Cm"),
        Element(97, "버클륨", "Bk"),
        Element(98, "캘리포늄", "Cf"),
        Element(99, "아인슈타이늄", "Es"),
        Element(100, "페르뮴", "Fm"),
        Element(101, "멘델레븀", "Md"),
        Element(102, "노벨륨", "No"),
        Element(103, "로렌슘", "Lr"),
    )

    private operator fun <T> List<T>.times(other: Int): List<T> {
        if (other == 1) return this
        return this + this*(other-1)
    }

    private val E = listOf(TableType.Element)
    private val N = listOf(TableType.None)
    private val L = listOf(TableType.Lanthanum)
    private val A = listOf(TableType.Actinium)

    val type =
        (E + N*16 + E) +
        (E*2 + N*10 + E*6)*2 +
        (E*18)*2 +
        (E*2 + L + E*15) +
        (E*2 + A + E*15) +
        (N*3 + E*15)*2

    val items: List<Element>
        get() {
            /* To Avoid Index Error, Fill Empty space with None Element */
            val res = arrayListOf<Element>()
            var index = -1
            type.forEach {
                res.add(
                    when (it) {
                        E[0] -> {
                            index += 1
                            _items[index]
                        }
                        else -> Element.None
                    }
                )
            }
            return res
        }
}