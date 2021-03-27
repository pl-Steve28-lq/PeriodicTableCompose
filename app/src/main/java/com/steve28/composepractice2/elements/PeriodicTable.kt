package com.steve28.composepractice2.elements

object PeriodicTable {
    val elems = listOf(
        Element(1, "수소", "H", ElementKind.NonMetal),
        Element(2, "헬륨", "He", ElementKind.NobleGas),
        Element(3, "리튬", "Li", ElementKind.Alkali),
        Element(4, "베릴륨", "Be", ElementKind.Alkaline),
        Element(5, "붕소", "B", ElementKind.Metalloid),
        Element(6, "탄소", "C", ElementKind.NonMetal),
        Element(7, "질소", "N", ElementKind.NonMetal),
        Element(8, "산소", "O", ElementKind.NonMetal),
        Element(9, "플루오린", "F", ElementKind.Halogen),
        Element(10, "네온", "Ne", ElementKind.NobleGas),
        Element(11, "나트륨", "Na", ElementKind.Alkali),
        Element(12, "마그네슘", "Mg", ElementKind.Alkaline),
        Element(13, "알루미늄", "Al", ElementKind.PostTransition),
        Element(14, "규소", "Si", ElementKind.Metalloid),
        Element(15, "인", "P", ElementKind.NonMetal),
        Element(16, "황", "S", ElementKind.NonMetal),
        Element(17, "염소", "Cl", ElementKind.Halogen),
        Element(18, "아르곤", "Ar", ElementKind.NobleGas),
        Element(19, "칼륨", "K", ElementKind.Alkali),
        Element(20, "칼슘", "Ca", ElementKind.Alkaline),
        Element(21, "스칸듐", "Sc", ElementKind.Transition),
        Element(22, "티타늄", "Ti", ElementKind.Transition),
        Element(23, "바나듐", "V", ElementKind.Transition),
        Element(24, "크롬", "Cr", ElementKind.Transition),
        Element(25, "망가니즈", "Mn", ElementKind.Transition),
        Element(26, "철", "Fe", ElementKind.Transition),
        Element(27, "코발트", "Co", ElementKind.Transition),
        Element(28, "니켈", "Ni", ElementKind.Transition),
        Element(29, "구리", "Cu", ElementKind.Transition),
        Element(30, "아연", "Zn", ElementKind.Transition),
        Element(31, "갈륨", "Ga", ElementKind.PostTransition),
        Element(32, "게르마늄", "Ge", ElementKind.Metalloid),
        Element(33, "비소", "As", ElementKind.Metalloid),
        Element(34, "셀레늄", "Se", ElementKind.NonMetal),
        Element(35, "브로민", "Br", ElementKind.Halogen),
        Element(36, "크립톤", "Kr", ElementKind.NobleGas),
        Element(37, "루비듐", "Rb", ElementKind.Alkali),
        Element(38, "스트론튬", "Sr", ElementKind.Alkaline),
        Element(39, "이트륨", "Y", ElementKind.Transition),
        Element(40, "지르코늄", "Zr", ElementKind.Transition),
        Element(41, "나이오븀", "Nb", ElementKind.Transition),
        Element(42, "몰리브데넘", "Mo", ElementKind.Transition),
        Element(43, "테크네튬", "Tc", ElementKind.Transition),
        Element(44, "루테늄", "Ru", ElementKind.Transition),
        Element(45, "로듐", "Rh", ElementKind.Transition),
        Element(46, "팔라듐", "Pd", ElementKind.Transition),
        Element(47, "은", "Ag", ElementKind.Transition),
        Element(48, "카드뮴", "Cd", ElementKind.Transition),
        Element(49, "인듐", "In", ElementKind.PostTransition),
        Element(50, "주석", "Sn", ElementKind.PostTransition),
        Element(51, "안티모니", "Sb", ElementKind.Metalloid),
        Element(52, "텔루륨", "Te", ElementKind.Metalloid),
        Element(53, "아이오딘", "I", ElementKind.Halogen),
        Element(54, "제논", "Xe", ElementKind.NobleGas),
        Element(55, "세슘", "Cs", ElementKind.Alkali),
        Element(56, "바륨", "Ba", ElementKind.Alkaline),
        Element(72, "하프늄", "Hf", ElementKind.Transition),
        Element(73, "탄탈럼", "Ta", ElementKind.Transition),
        Element(74, "텅스텐", "W", ElementKind.Transition),
        Element(75, "레늄", "Re", ElementKind.Transition),
        Element(76, "오스뮴", "Os", ElementKind.Transition),
        Element(77, "이리듐", "Ir", ElementKind.Transition),
        Element(78, "백금", "Pt", ElementKind.Transition),
        Element(79, "금", "Au", ElementKind.Transition),
        Element(80, "수은", "Hg", ElementKind.Transition),
        Element(81, "탈륨", "Tl", ElementKind.PostTransition),
        Element(82, "납", "Pb", ElementKind.PostTransition),
        Element(83, "비스무트", "Bi", ElementKind.PostTransition),
        Element(84, "폴로늄", "Po", ElementKind.Metalloid),
        Element(85, "아스타틴", "At", ElementKind.Halogen),
        Element(86, "라돈", "Rn", ElementKind.NobleGas),
        Element(87, "프랑슘", "Fr", ElementKind.Alkali),
        Element(88, "라듐", "Ra", ElementKind.Alkaline),
        Element(104, "러더포듐", "Rf", ElementKind.Transition),
        Element(105, "더브늄", "Db", ElementKind.Transition),
        Element(106, "시보귬", "Sg", ElementKind.Transition),
        Element(107, "보륨", "Bh", ElementKind.Transition),
        Element(108, "하슘", "Hs", ElementKind.Transition),
        Element(109, "마이트너륨", "Mt", ElementKind.Transition),
        Element(110, "다름슈타튬", "Ds", ElementKind.Transition),
        Element(111, "뢴트게늄", "Rg", ElementKind.Transition),
        Element(112, "코페르니슘", "Cn", ElementKind.Transition),
        Element(113, "니호늄", "Nh", ElementKind.PostTransition),
        Element(114, "플레로븀", "Fl", ElementKind.PostTransition),
        Element(115, "모스코븀", "Mc", ElementKind.PostTransition),
        Element(116, "리버모륨", "Lv", ElementKind.PostTransition),
        Element(117, "테네신", "Ts", ElementKind.Halogen),
        Element(118, "오가네손", "Og", ElementKind.NobleGas),
        Element(57, "란타넘", "La", ElementKind.Lanthanides),
        Element(58, "세륨", "Ce", ElementKind.Lanthanides),
        Element(59, "프라세오디뮴", "Pr", ElementKind.Lanthanides),
        Element(60, "네오디뮴", "Nd", ElementKind.Lanthanides),
        Element(61, "프로메튬", "Pm", ElementKind.Lanthanides),
        Element(62, "사마륨", "Sm", ElementKind.Lanthanides),
        Element(63, "유로퓸", "Eu", ElementKind.Lanthanides),
        Element(64, "가돌리늄", "Gd", ElementKind.Lanthanides),
        Element(65, "터븀", "Tb", ElementKind.Lanthanides),
        Element(66, "디스프로슘", "Dy", ElementKind.Lanthanides),
        Element(67, "홀뮴", "Ho", ElementKind.Lanthanides),
        Element(68, "어븀", "Er", ElementKind.Lanthanides),
        Element(69, "툴륨", "Tm", ElementKind.Lanthanides),
        Element(70, "이터븀", "Yb", ElementKind.Lanthanides),
        Element(71, "루테튬", "Lu", ElementKind.Lanthanides),
        Element(89, "악티늄", "Ac", ElementKind.Actinides),
        Element(90, "토륨", "Th", ElementKind.Actinides),
        Element(91, "프로트악티늄", "Pa", ElementKind.Actinides),
        Element(92, "우라늄", "U", ElementKind.Actinides),
        Element(93, "넵투늄", "Np", ElementKind.Actinides),
        Element(94, "플루토늄", "Pu", ElementKind.Actinides),
        Element(95, "아메리슘", "Am", ElementKind.Actinides),
        Element(96, "퀴륨", "Cm", ElementKind.Actinides),
        Element(97, "버클륨", "Bk", ElementKind.Actinides),
        Element(98, "캘리포늄", "Cf", ElementKind.Actinides),
        Element(99, "아인슈타이늄", "Es", ElementKind.Actinides),
        Element(100, "페르뮴", "Fm", ElementKind.Actinides),
        Element(101, "멘델레븀", "Md", ElementKind.Actinides),
        Element(102, "노벨륨", "No", ElementKind.Actinides),
        Element(103, "로렌슘", "Lr", ElementKind.Actinides),
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
        (E + N *16 + E) +
        (E *2 + N *10 + E *6)*2 +
        (E *18)*2 +
        (E *2 + L + E *15) +
        (E *2 + A + E *15) +
        (N *3 + E *15)*2

    val items: List<Element>
        get() {
            /*
               To Avoid Index Error by fast screen moving,
               Fill Empty space with None Element
            */
            val res = arrayListOf<Element>()
            var index = -1
            type.forEach {
                res.add(
                    when (it) {
                        E[0] -> {
                            index += 1
                            elems[index]
                        }
                        else -> Element.None
                    }
                )
            }
            return res
        }
}