package br.com.pedro.mefit.Dao

import br.com.pedro.mefit.model.Exercicio

class ExercicioDao {


    fun adiciona(exercicio: Exercicio) {
        exercicios.add(exercicio)
    }

    fun buscaTodos(): List<Exercicio> {
        return exercicios.toList()
    }

    companion object {
        private val exercicios = mutableListOf<Exercicio>(
            Exercicio(
                "PushUp",
                "https://treinomestre.com.br/wp-content/uploads/2017/08/musculos-trabalhados-flexao-de-bra%C3%A7o.jpg.webp",
                "Para começar, fique na posição inicial de prancha alta com os braços totalmente estendidos e com os ombros, quadris e calcanhares em linha reta.\n" +
                        "\n" +
                        "Em um movimento controlado, abaixe o corpo até que o peito toque o chão, mantendo os joelhos e os quadris fora do chão o tempo todo.\n" +
                        "\n" +
                        "Os cotovelos devem estar próximos ao corpo, voltados para trás e para fora durante todo o movimento.\n" +
                        "\n" +
                        "Em seguida, levante todo o corpo “empurrando para longe do chão” até que os braços estejam completamente estendidos para completar uma repetição.\n" +
                        "\n" +
                        "Lembre-se de que você sempre pode conferir os vídeos tutoriais no aplicativo Freeletics para ver as flexões demonstradas em velocidade máxima, meia velocidade e de vários ângulos."

            ),
            Exercicio(
                "PullUp",
                "https://hips.hearstapps.com/hmg-prod/images/u05-bottomhalfwaytop-ism-mh310118-1558552383.jpg?crop=1.00xw:0.812xh;0,0.0812xh&resize=980:*",
                "Comece se pendurando em uma barra, suspenso pelos seus braços. Depois, mantendo todo o corpo sob tensão, eleve o corpo até que o seu queixo esteja acima da barra. Por fim, desça o corpo até que seus braços estejam quase retos novamente. Durante todo o movimento, apenas a parte superior do corpo está se exercitando; suas pernas ficam penduradas livremente. É assim que se faz!"

            ),
            Exercicio(
                "Squat",
                "https://blog.fitbit.com/wp-content/uploads/2016/10/ArmStanding.jpg",
                "Um agachamento - ou Squat - é o movimento de se abaixar até uma posição \"sentada\" com seus quadríceps paralelos ao chão.\n" +
                        "\n" +
                        "Para fazer um Squat, comece em pé com os joelhos soltos. Leve o quadril para trás, flexione os joelhos e abaixe-se até seu quadril chegar no nível dos joelhos ou mais baixo. Seu peso deve ficar distribuído uniformemente pelos pés; resista à tentação de tirar os calcanhares do chão. Certifique-se de que seus joelhos fiquem alinhados com os dedos dos pés e que eles não se movam para dentro nem para fora; isso coloca uma pressão desnecessária nas articulações.\n" +
                        "\n"

            )

        )
    }
}