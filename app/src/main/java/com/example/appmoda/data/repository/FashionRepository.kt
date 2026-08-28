package com.example.appmoda.data.repository

import com.example.appmoda.data.model.FashionCategory
import com.example.appmoda.data.model.FashionItem

object FashionRepository {

    fun getAllItems(): List<FashionItem> = listOf(
        // === DECADA DE 1900-1910 ===
        FashionItem(
            id = "1",
            nome = "Tailleur Victoriano",
            decada = "1900",
            anoInicio = 1900,
            anoFim = 1910,
            categoria = FashionCategory.ROUPAS,
            descricao = "Conjunto elegante com corpete apertado e saia longa, simbolo da elegancia feminina no inicio do seculo XX.",
            detalhes = "O tailleur victoriano era composto por uma blusa de corpete bem estruturado com botoes frontais e uma saia comprida ate os tornozelos. Feito em tecidos pesados como la e seda, era o traje padrao para mulheres da alta sociedade.",
            imageUrl = "https://images.unsplash.com/photo-1594751439417-df7a5d330ce3?q=80&w=800",
            paisOrigem = "Inglaterra"
        ),
        FashionItem(
            id = "2",
            nome = "Smoking para Homens",
            decada = "1900",
            anoInicio = 1900,
            anoFim = 1910,
            categoria = FashionCategory.ROUPAS,
            descricao = "O smoking tornou-se o traje formal padrao para homens, substituindo o fraque em ocasioes noturnas.",
            detalhes = "Desenvolvido originalmente como traje casual para homens nobres em seus clubs, o smoking rapidamente se popularizou. Possuia casaco preto com gola de cetim, calca com listra lateral e colete.",
            imageUrl = "https://images.unsplash.com/photo-1507679799987-c73779587ccf?q=80&w=800",
            paisOrigem = "Inglaterra"
        ),
        FashionItem(
            id = "3",
            nome = "Capacete Brodie",
            decada = "1900",
            anoInicio = 1915,
            anoFim = 1918,
            categoria = FashionCategory.ACESSORIOS_MILITARES,
            descricao = "Capacete de aco britanico utilizado na Primeira Guerra Mundial, projetado para proteger contra estilhacos.",
            detalhes = "O Capacete Brodie era feito de aco manganes. Tinha uma forma de tigela rasa que oferecia protecao contra estilhacos vindos de cima. Foi padronizado em 1915 e usado por todas as forcas da Commonwealth.",
            imageUrl = "https://images.unsplash.com/photo-1584128662283-a4449a04460a?q=80&w=800",
            paisOrigem = "Inglaterra"
        ),
        FashionItem(
            id = "4",
            nome = "Espada Cerimonial Naval",
            decada = "1900",
            anoInicio = 1900,
            anoFim = 1910,
            categoria = FashionCategory.ACESSORIOS_MILITARES,
            descricao = "Espada de cerimonia usada por oficiais navais, com guarda ornamentada e lamina de aco polido.",
            detalhes = "A espada cerimonial naval britanica possuia guarda em latao dourado com emblemas navais. A lamina media 85cm e era feita de aco carbono. Era usada exclusivamente em ocasioes formais e desfiles.",
            imageUrl = "https://images.unsplash.com/photo-1599813389377-f0a993bf56f7?q=80&w=800",
            paisOrigem = "Inglaterra"
        ),

        // === DECADA DE 1920 ===
        FashionItem(
            id = "5",
            nome = "Flapper Dress",
            decada = "1920",
            anoInicio = 1920,
            anoFim = 1929,
            categoria = FashionCategory.ROUPAS,
            descricao = "Vestido solto e franzido que simbolizou a liberdade feminina nos anos 20, com babados e purpurina.",
            detalhes = "O Flapper Dress representou uma revolucao na moda feminina. Com comprimento ate os joelhos, caiu reto sem realizar a cintura, e era decorado com franjas, lantejoulas e purpurina. Tecidos leves como seda e chifon permitiam movimento livre.",
            imageUrl = "https://images.unsplash.com/photo-1615214072949-ab48c4a30e8c?q=80&w=800",
            paisOrigem = "Estados Unidos"
        ),
        FashionItem(
            id = "6",
            nome = "Terno com Suspensorios",
            decada = "1920",
            anoInicio = 1920,
            anoFim = 1929,
            categoria = FashionCategory.ROUPAS,
            descricao = "Terno masculino com suspensorios e chapéu, simbolo dos Garotos dos Anos 20.",
            detalhes = "O terno dos anos 20 apresentava calca de cintura alta com suspensorios, jaqueta com cortes retos e gola estreita. Chapéus como o fedora e o homburg eram essenciais.",
            imageUrl = "https://images.unsplash.com/photo-1593032465175-481ac7f401a0?q=80&w=800",
            paisOrigem = "Estados Unidos"
        ),
        FashionItem(
            id = "7",
            nome = "Bolsa Chain Purse",
            decada = "1920",
            anoInicio = 1920,
            anoFim = 1929,
            categoria = FashionCategory.ACESSORIOS_CIVIS,
            descricao = "Bolsa pequena com corrente dourada, acessorio indispensavel das mulheres dos anos 20.",
            detalhes = "A Chain Purse era uma bolsa pequena e elegante, geralmente feita de cetim ou couro com corrente de metal dourado ou prateado. Era grande o suficiente para levar batom, moedas e um lenco de seda.",
            imageUrl = "https://images.unsplash.com/photo-1594223274512-ad4803739b7c?q=80&w=800",
            paisOrigem = "Franca"
        ),

        // === DECADA DE 1930 ===
        FashionItem(
            id = "8",
            nome = "Vestido Hollywood Glamour",
            decada = "1930",
            anoInicio = 1930,
            anoFim = 1939,
            categoria = FashionCategory.ROUPAS,
            descricao = "Vestido longo e fluido inspirado nas estrelas do cinema, com costuras na diagonal e tecidos acetinados.",
            detalhes = "Influenciado por estrelas como Jean Harlow e Greta Garbo, o vestido glamour dos anos 30 usava tecnicas de corte na bias que faziam o tecido cair suavemente sobre o corpo. Sedas, cetins e lames eram os tecidos preferidos.",
            imageUrl = "https://images.unsplash.com/photo-1566174053879-31528523f8ae?q=80&w=800",
            paisOrigem = "Estados Unidos"
        ),
        FashionItem(
            id = "9",
            nome = "Paletó com Ombros Ampliados",
            decada = "1930",
            anoInicio = 1935,
            anoFim = 1939,
            categoria = FashionCategory.ROUPAS,
            descricao = "Paletó masculino com ombros mais largos, marcando o inicio da silhueta angular na moda masculina.",
            detalhes = "O paletó dos anos 30 voltou a ter ombros amplos, influenciado pela moda militar. Possuia gola larga, botoes duplos e era feito em la pesada.",
            imageUrl = "https://images.unsplash.com/photo-1598970434722-5c4c4421c1c8?q=80&w=800",
            paisOrigem = "Estados Unidos"
        ),
        FashionItem(
            id = "10",
            nome = "Broche Art Deco",
            decada = "1930",
            anoInicio = 1930,
            anoFim = 1939,
            categoria = FashionCategory.ACESSORIOS_CIVIS,
            descricao = "Broche geometrico em ouro e pedras semi-preciosas, acessorio popular entre mulheres elegantes.",
            detalhes = "Os broches art deco eram pecas de joalheria com designs geometricos inspirados no movimento artistico da epoca. Usavam platina, ouro e pedras como obsidiana, turquesa e jade.",
            imageUrl = "https://images.unsplash.com/photo-1617038220319-276d3cfab638?q=80&w=800",
            paisOrigem = "Franca"
        ),
        FashionItem(
            id = "11",
            nome = "Mira Telescopica Sniper",
            decada = "1930",
            anoInicio = 1935,
            anoFim = 1939,
            categoria = FashionCategory.ACESSORIOS_MILITARES,
            descricao = "Mira telescopica de precisao utilizada por atiradores de elite nos conflitos pre-guerra.",
            detalhes = "As miras telescopicas da decada de 1930 eram equipamentos de precisao fabricados in aco e vidro optico. Modelos como a Zeiss ZF39 ofereciam ampliacao de 4x a 6x.",
            imageUrl = "https://images.unsplash.com/photo-1605647540924-852290f6b0d5?q=80&w=800",
            paisOrigem = "Alemanha"
        ),

        // === DECADA DE 1940 ===
        FashionItem(
            id = "12",
            nome = "New Look de Dior",
            decada = "1940",
            anoInicio = 1947,
            anoFim = 1949,
            categoria = FashionCategory.ROUPAS,
            descricao = "O revolucionario New Look de Christian Dior com cintura apertada e saia ampla, marcando o fim do austero anos 40.",
            detalhes = "Apresentado em 1947, o New Look de Dior quebrou com a austeridade da guerra. O vestido Bar possuia ombros suaves, cintura extremamente apertada e saia ate os joelhos com muito tecido (ate 15 metros).",
            imageUrl = "https://images.unsplash.com/photo-1581044777550-4cfa60707c03?q=80&w=800",
            paisOrigem = "Franca"
        ),
        FashionItem(
            id = "13",
            nome = "Uniforme Feminino Militar",
            decada = "1940",
            anoInicio = 1940,
            anoFim = 1945,
            categoria = FashionCategory.ROUPAS,
            descricao = "Uniforme militar feminino usado por enfermeiras e auxiliares durante a Segunda Guerra Mundial.",
            detalhes = "Durante a WWII, milhoes de mulheres entraram para o esforço de guerra usando uniformes militares. O uniforme consistia em casaco de la azul-marinho ou khaki, saia ate os joelhos, blusa branca e sapatos rasteiros.",
            imageUrl = "https://images.unsplash.com/photo-1516726817505-f5ed1747c9d6?q=80&w=800",
            paisOrigem = "Estados Unidos"
        ),
        FashionItem(
            id = "14",
            nome = "Boina Beret Militar",
            decada = "1940",
            anoInicio = 1940,
            anoFim = 1945,
            categoria = FashionCategory.ACESSORIOS_MILITARES,
            descricao = "Boina de la usada por forcas especiais e comandos durante a Segunda Guerra Mundial.",
            detalhes = "A boina militar, originaria dos bascos, foi adotada por forcas de elite durante a WWII. O Regimento de Paraquedistas britanico usava boina marrom, enquanto os comandos usavam verde. Tornou-se simbolo de elite militar.",
            imageUrl = "https://images.unsplash.com/photo-1521119989659-a83eee488004?q=80&w=800",
            paisOrigem = "Inglaterra"
        ),
        FashionItem(
            id = "15",
            nome = "Bolsa Nurse Kit",
            decada = "1940",
            anoInicio = 1940,
            anoFim = 1945,
            categoria = FashionCategory.ACESSORIOS_CIVIS,
            descricao = "Kit de enfermeira com instrumentos medicos basicos em estojo de couro.",
            detalhes = "O kit de enfermeira da WWII era um estojo de couro marrom que continha tesoura, pinca, bandagens, termometro e Medicamentos basicos. Era um acessorio essencial para as milhoes de enfermeiras que serviram durante a guerra.",
            imageUrl = "https://images.unsplash.com/photo-1584308666744-24d5c474f2ae?q=80&w=800",
            paisOrigem = "Estados Unidos"
        ),

        // === DECADA DE 1950 ===
        FashionItem(
            id = "16",
            nome = "Vestido Swing",
            decada = "1950",
            anoInicio = 1950,
            anoFim = 1959,
            categoria = FashionCategory.ROUPAS,
            descricao = "Vestido midi com saia rodada, cintura apertada e estampas florais, icone da feminilidade dos anos 50.",
            detalhes = "O vestido swing era a peça definitiva dos anos 50. Com saia que ia do joelho ao meio da panturrilha, cintura marcada e estampas como bolinhas, flores e listras. Elvis Presley e as garotas do Rock and Roll popularizaram este estilo.",
            imageUrl = "https://images.unsplash.com/photo-1572804013309-59a88b7e92f1?q=80&w=800",
            paisOrigem = "Estados Unidos"
        ),
        FashionItem(
            id = "17",
            nome = "Jaqueta Leather Biker",
            decada = "1950",
            anoInicio = 1950,
            anoFim = 1959,
            categoria = FashionCategory.ROUPAS,
            descricao = "Jaqueta de couro preto com zips e rebites, simbolo da rebeldia juvenil dos anos 50.",
            detalhes = "A jaqueta biker de couro foi popularizada por Marlon Brando no filme The Wild One (1953). Feita de couro bovino preto com zips metálicos, gola com aba e corrente. Simbolizava rebeldia e cultura rock.",
            imageUrl = "https://images.unsplash.com/photo-1551028719-00167b16eac5?q=80&w=800",
            paisOrigem = "Estados Unidos"
        ),
        FashionItem(
            id = "18",
            nome = "Cinto Largo Waist",
            decada = "1950",
            anoInicio = 1950,
            anoFim = 1959,
            categoria = FashionCategory.ACESSORIOS_CIVIS,
            descricao = "Cinto largo de couro ou tecido que realçava a cintura fina nas mulheres dos anos 50.",
            detalhes = "O cinto wide waist era essencial para criar a silhueta de ampulheta dos anos 50. Feito de couro, cetim ou tecido estampado, media de 5 a 8 centimetros de largura. Frequentemente combinava com vestidos swing e saias midi.",
            imageUrl = "https://images.unsplash.com/photo-1624222247344-550fb80583dc?q=80&w=800",
            paisOrigem = "Estados Unidos"
        ),

        // === DECADA DE 1960 ===
        FashionItem(
            id = "19",
            nome = "Mini Saia (Mary Quant)",
            decada = "1960",
            anoInicio = 1964,
            anoFim = 1969,
            categoria = FashionCategory.ROUPAS,
            descricao = "Saia curta que chegou acima do joelho, revolucionando a moda feminina nos anos 60.",
            detalhes = "Mary Quant popularizou a mini saia em Londres, tornando-a o simbolo da Swinging London. Comprimentos cada vez mais curtos desafiavam as convenções sociais. Usada com botas altas e blusas simplistas, representou a libertacao feminina.",
            imageUrl = "https://images.unsplash.com/photo-1582142837900-2c97c127903a?q=80&w=800",
            paisOrigem = "Inglaterra"
        ),
        FashionItem(
            id = "20",
            nome = "Traje Mod Espacial",
            decada = "1960",
            anoInicio = 1965,
            anoFim = 1969,
            categoria = FashionCategory.ROUPAS,
            descricao = "Roupas futuristas com materiais sinteticos e cortes geometricos, inspiradas na corrida espacial.",
            detalhes = "Andre Courreges e Pierre Cardin criaram roupas futuristas usando PVC, metal e tecidos sinteticos. Cortes geometricos, cores brancas e prateadas, e acessorios como oculos e luvas longas. Inspirada pela conquista do espaco.",
            imageUrl = "https://images.unsplash.com/photo-1533107862482-0e6974b06ec4?q=80&w=800",
            paisOrigem = "Franca"
        ),
        FashionItem(
            id = "21",
            nome = "Oculos Aviador",
            decada = "1960",
            anoInicio = 1960,
            anoFim = 1969,
            categoria = FashionCategory.ACESSORIOS_CIVIS,
            descricao = "Oculos de lente esverdeada com armação metalica dourada, originalmente para pilotos da Forca Aerea.",
            detalhes = "Criados em 1937 pela Ray-Ban para pilotos, os oculos aviador tornaram-se populares na cultura civil nos anos 60. A lente verde G-15 reduz ofusco sem alterar cores. A armação dourada wire-frame tornou-se classica.",
            imageUrl = "https://images.unsplash.com/photo-1572635196237-14b3f281503f?q=80&w=800",
            paisOrigem = "Estados Unidos"
        ),
        FashionItem(
            id = "22",
            nome = "Capacete M1 com Cover",
            decada = "1960",
            anoInicio = 1960,
            anoFim = 1969,
            categoria = FashionCategory.ACESSORIOS_MILITARES,
            descricao = "Capacete de aco americano M1 com capa de camuflagem para selva, usado na Guerra do Vietna.",
            detalhes = "O capacete M1 era o padrao do Exercito americano desde 1941. Na Guerra do Vietna, ganhou capas de camuflagem em verde e marrom. A concha interna de fibra de vidro oferecia protecao contra estilhacos e impactos.",
            imageUrl = "https://images.unsplash.com/photo-1628155930542-3c7a64e2c833?q=80&w=800",
            paisOrigem = "Estados Unidos"
        ),

        // === DECADA DE 1970 ===
        FashionItem(
            id = "23",
            nome = "Macacao Disco",
            decada = "1970",
            anoInicio = 1975,
            anoFim = 1979,
            categoria = FashionCategory.ROUPAS,
            descricao = "Macacao colante com decote profundo, usado em boates e festas da era disco.",
            detalhes = "O macacao disco era feito em lycra, cetim ou veludo com cintura apertada e pernas afuniladas. Decotes profundos tanto na frente quanto nas costas. Cores vibrantes como dourado, prata e vermelho eram populares. John Travolta em Saturday Night Fever icone.",
            imageUrl = "https://images.unsplash.com/photo-1523381210434-271e8be1f52b?q=80&w=800",
            paisOrigem = "Estados Unidos"
        ),
        FashionItem(
            id = "24",
            nome = "Camisa Hawaii",
            decada = "1970",
            anoInicio = 1970,
            anoFim = 1979,
            categoria = FashionCategory.ROUPAS,
            descricao = "Camisa de manga curta com estampa tropical, popular entre homens no verao dos anos 70.",
            detalhes = "A camisa Hawaii (ou Aloha shirt) era feita em viscose ou poliester com estampas de flores, palmeiras e paisagens tropicais. Cores vibrantes e soltas, usada por cima de regata ou direto na pele.",
            imageUrl = "https://images.unsplash.com/photo-1598911543663-37d77962ebd1?q=80&w=800",
            paisOrigem = "Japao/EUA"
        ),
        FashionItem(
            id = "25",
            nome = "Bolsa Fringe",
            decada = "1970",
            anoInicio = 1970,
            anoFim = 1979,
            categoria = FashionCategory.ACESSORIOS_CIVIS,
            descricao = "Bolsa de couro com franjas longas, acessorio icone da estetica boemia dos anos 70.",
            detalhes = "A bolsa fringe era feita de couro natural ou suede com franjas que podiam ter ate 30cm de comprimento. Usada cruzada no corpo, combinava com minissaias, blusas de croche e sandalias. Inspirada na cultura hippie e nativa americana.",
            imageUrl = "https://images.unsplash.com/photo-1584917865442-de89df76afd3?q=80&w=800",
            paisOrigem = "Estados Unidos"
        ),

        // === DECADA DE 1980 ===
        FashionItem(
            id = "26",
            nome = "Ombros Exagerados (Power Suit)",
            decada = "1980",
            anoInicio = 1980,
            anoFim = 1989,
            categoria = FashionCategory.ROUPAS,
            descricao = "Paletó feminino com ombros enormes, simbolo do poder feminino no corporate dos anos 80.",
            detalhes = "O Power Suit dos anos 80 tinha ombros gigantes preenchidos com enchimentos. Casacos longos ate os quadris, calças retas e cores escuras. Donna Karan e Thierry Mugler foram os designers que definiram este estilo. Representava a mulher que entrava no mercado de trabalho corporativo.",
            imageUrl = "https://images.unsplash.com/photo-1591047139829-d91aecb6caea?q=80&w=800",
            paisOrigem = "Estados Unidos"
        ),
        FashionItem(
            id = "27",
            nome = "Jaqueta Bomber",
            decada = "1980",
            anoInicio = 1980,
            anoFim = 1989,
            categoria = FashionCategory.ROUPAS,
            descricao = "Jaqueta de nylon com forro acetinado e bordado, originaria dos pilotos da USAF.",
            detalhes = "A MA-1 Bomber Jacket era originalmente usada por pilotos da Forca Aerea americana. Feita de nylon com forro laranja visivel para resgate. Tornou-se moda civil nos anos 80, com marcas como Alpha Industries. Cores: verde oliva, preto e azul marinho.",
            imageUrl = "https://images.unsplash.com/photo-1521223890158-f9f7c3d5d504?q=80&w=800",
            paisOrigem = "Estados Unidos"
        ),
        FashionItem(
            id = "28",
            nome = "Pulseira de Silicone",
            decada = "1980",
            anoInicio = 1985,
            anoFim = 1989,
            categoria = FashionCategory.ACESSORIOS_CIVIS,
            descricao = "Pulseiras de silicone coloridas em camadas, acessorio de massa dos anos 80.",
            detalhes = "As pulseiras de silicone (ou Livestrong style) eram usadas in camadas no braco. Cores neon como rosa, verde, amarelo e laranja dominavam. Marcas como Nike criaram as famosas pulseiras amarelas de caridade.",
            imageUrl = "https://images.unsplash.com/photo-1621335829175-95f437384d7c?q=80&w=800",
            paisOrigem = "Estados Unidos"
        ),
        FashionItem(
            id = "29",
            nome = "Capacete PASGT",
            decada = "1980",
            anoInicio = 1983,
            anoFim = 1989,
            categoria = FashionCategory.ACESSORIOS_MILITARES,
            descricao = "Capacete de fibra de aramida (Kevlar) moderno, substituindo o antigo M1 nos EUA.",
            detalhes = "O PASGT (Personnel Armor System for Ground Troops) era feito de 19 camadas de Kevlar. Oferecia protecao superior contra estilhacos e projeteis. Era mais baixo e contorno que o M1, com abas laterais para proteção do ouvido.",
            imageUrl = "https://images.unsplash.com/photo-1585129777188-94600bc7b4b3?q=80&w=800",
            paisOrigem = "Estados Unidos"
        ),

        // === DECADA DE 1990 ===
        FashionItem(
            id = "30",
            nome = "Calça Cargo",
            decada = "1990",
            anoInicio = 1995,
            anoFim = 1999,
            categoria = FashionCategory.ROUPAS,
            descricao = "Calça larga com bolsos laterais, popularizada pela cultura hip-hop e grunge dos anos 90.",
            detalhes = "As calças cargo tinham origem militar (US Army BDU) mas se tornaram moda civil. Feitas em algodão ou ripstop, com multiplos bolsos laterais. Marcas como JNCO e Dickies popularizaram. Cores: khaki, verde oliva, preto e camuflagem.",
            imageUrl = "https://images.unsplash.com/photo-1594633312681-425c7b97ccd1?q=80&w=800",
            paisOrigem = "Estados Unidos"
        ),
        FashionItem(
            id = "31",
            nome = "Camiseta Grunge",
            decada = "1990",
            anoInicio = 1991,
            anoFim = 1999,
            categoria = FashionCategory.ROUPAS,
            descricao = "Camiseta de banda estampada, jeans rasgado e flannel, o visual grunge de Seattle.",
            detalhes = "O movimento grunge liderado por Nirvana e Pearl Jam trouxe o visual desleixado. Camisetas de bandas (Nirvana, Soundgarden), flannels xadrez, jeans rasgados e Converse All Star. Anti-moda que se tornou moda.",
            imageUrl = "https://images.unsplash.com/photo-1576566582419-5778856376b7?q=80&w=800",
            paisOrigem = "Estados Unidos"
        ),
        FashionItem(
            id = "32",
            nome = "Choker de Veludo",
            decada = "1990",
            anoInicio = 1994,
            anoFim = 1999,
            categoria = FashionCategory.ACESSORIOS_CIVIS,
            descricao = "Colar apertado de veludo preto no pescoco, acessorio icone das meninas dos anos 90.",
            detalhes = "O choker de veludo preto era o acessorio mais popular entre adolescentes dos anos 90. Feito de fita de veludo de 2-3cm, usava-se apertado no pescoco. Versoes com pingente de prata ou colar de concha (da serie Baywatch) eram comuns.",
            imageUrl = "https://images.unsplash.com/photo-1601121141461-9d6647bca1ed?q=80&w=800",
            paisOrigem = "Estados Unidos"
        ),

        // === DECADA DE 2000 ===
        FashionItem(
            id = "33",
            nome = "Low-Rise Jeans",
            decada = "2000",
            anoInicio = 2000,
            anoFim = 2009,
            categoria = FashionCategory.ROUPAS,
            descricao = "Calça jeans de cintura baixa que expunha o quadril, trend dominant dos anos 2000.",
            detalhes = "Os low-rise jeans foram popularizados por Britney Spears e Christina Aguilera. A cintura ficava several centimetros abaixo do umbigo. Marcas como True Religion e Seven for All Mankind eram status symbol. Combinados com tops curtos e cintos largos.",
            imageUrl = "https://images.unsplash.com/photo-1541099649105-f69ad21f3246?q=80&w=800",
            paisOrigem = "Estados Unidos"
        ),
        FashionItem(
            id = "34",
            nome = "Bolsa Juicy Couture",
            decada = "2000",
            anoInicio = 2001,
            anoFim = 2009,
            categoria = FashionCategory.ACESSORIOS_CIVIS,
            descricao = "Bolsa de veludo com logotipo embutida, accesoria must-have das influencers dos anos 2000.",
            detalhes = "As bolsas Juicy Couture eram feitas de veludo em cores rosa, turquesa e lavanda. Tinham corrente dourada e logotipo JC ou Juicy Couture em metal dourado. Paris Hilton e Nicole Richie eram fãs declaradas.",
            imageUrl = "https://images.unsplash.com/photo-1566150905458-1bf1fd113f0d?q=80&w=800",
            paisOrigem = "Estados Unidos"
        ),

        // === DECADA DE 2010 ===
        FashionItem(
            id = "35",
            nome = "Yoga Pants / Leggings",
            decada = "2010",
            anoInicio = 2010,
            anoFim = 2019,
            categoria = FashionCategory.ROUPAS,
            descricao = "Calças de compressão em elastano, do estúdio de yoga para a rua, revolucionando a moda casual.",
            detalhes = "Marcas como Lululemon e Nike transformaram as legging de treino em roupa do dia a dia. Feitas em tecnologias como Dri-FIT e Powerlux, ofereciam conforto e estilo. Cores solidas, estampas geometricas e tie-dye eram populares.",
            imageUrl = "https://images.unsplash.com/photo-1506152983158-b4a74a01c721?q=80&w=800",
            paisOrigem = "Canada/EUA"
        ),
        FashionItem(
            id = "36",
            nome = "Sneaker Boost / Air Max",
            decada = "2010",
            anoInicio = 2010,
            anoFim = 2019,
            categoria = FashionCategory.ACESSORIOS_CIVIS,
            descricao = "Tênis esportivo com tecnologia de amortecimento visível, que se tornou item de moda collector.",
            detalhes = "A Adidas Ultra Boost (2015) e Nike Air Max tornaram-se fenomenos de moda. Sola de amortecimento visivel (Air), cabedal de knit (Flyknit/Primeknit). Colecionadores pagam milhares por pares limitados. O sneakerhead cult nasceu nos anos 2010.",
            imageUrl = "https://images.unsplash.com/photo-1542291026-7eec264c27ff?q=80&w=800",
            paisOrigem = "Estados Unidos/Alemanha"
        ),
        FashionItem(
            id = "37",
            nome = "Smartwatch Militar",
            decada = "2010",
            anoInicio = 2015,
            anoFim = 2019,
            categoria = FashionCategory.ACESSORIOS_MILITARES,
            descricao = "Relogio inteligente resistente a agua e impactos, usado por forças especiais e aventureiros.",
            detalhes = "O Garmin Tactix e Suunto Core eram smartwatches militares com GPS, barometro, altimetro e compasso digital. Resistentes a agua (100m+), com tela legível no sol e bateria de longa duracao. Usados por SEALs e operadores especiais.",
            imageUrl = "https://images.unsplash.com/photo-1523275335684-37898b6baf30?q=80&w=800",
            paisOrigem = "Estados Unidos/Finlandia"
        ),

        // === DECADA DE 2020 ===
        FashionItem(
            id = "38",
            nome = "Streetwear Techwear",
            decada = "2020",
            anoInicio = 2020,
            anoFim = 2026,
            categoria = FashionCategory.ROUPAS,
            descricao = "Moda urbana com tecidos tecnicos, zips funcionais e estetica futurista minimalista.",
            detalhes = "O techwear combina funcionalidade militar com estetica cyberpunk. Marcas como Acronym, Outlier e Nike ACG usam tecidos impermeaveis (Gore-Tex), zips YKK e bolsos estrategicos. Cores escuras (preto, cinza) dominam. Silhueta afunilada e camadas.",
            imageUrl = "https://images.unsplash.com/photo-1515886657613-9f3515b0c78f?q=80&w=800",
            paisOrigem = "Global"
        ),
        FashionItem(
            id = "39",
            nome = "Sustainability Fashion",
            decada = "2020",
            anoInicio = 2020,
            anoFim = 2026,
            categoria = FashionCategory.ROUPAS,
            descricao = "Moda sustentavel com materiais reciclados, organic e upcycling, resposta a crise ambiental.",
            detalhes = "Marcas como Patagonia, Stella McCartney e Veja lideram a revolucao sustentavel. Tecidos de garrafas PET recicladas, algodao organico, couro vegetal (Piñatex) e dyes naturais. O movimento slow fashion opoe-se ao fast fashion.",
            imageUrl = "https://images.unsplash.com/photo-1523381294911-8d3cead13475?q=80&w=800",
            paisOrigem = "Global"
        ),
        FashionItem(
            id = "40",
            nome = "Capacete Ballistic Modular",
            decada = "2020",
            anoInicio = 2020,
            anoFim = 2026,
            categoria = FashionCategory.ACESSORIOS_MILITARES,
            descricao = "Capacete modular com sistema de montagem para acessorios: visao noturna, camera, comunicador.",
            detalhes = "O Ops-Core FAST e Team Wendy EXFIL sao capacetes de alta tecnologia. Sistema ARC rail para acessorios, mount para NVG (visao noturna), camera GoPro e comunicador integrado. Feitos em composite de fibra de vidro e aramida, pesam apenas 1.4kg.",
            imageUrl = "https://images.unsplash.com/photo-1628155930542-3c7a64e2c833?q=80&w=800",
            paisOrigem = "Estados Unidos"
        ),
        FashionItem(
            id = "41",
            nome = "Bolsa Crossbody Tech",
            decada = "2020",
            anoInicio = 2020,
            anoFim = 2026,
            categoria = FashionCategory.ACESSORIOS_CIVIS,
            descricao = "Bolsa pequena transversal com compartimentos para dispositivos eletronicos e organizacao urbana.",
            detalhes = "As crossbody bags tech (Peak Design, Bellroy) sao feitas in nylon ripstop resistente a agua. Compartimentos especificos para smartphone, power bank, cartao de acesso e chave. Fivela magnetica e ajuste rapido. Minimalismo funcional.",
            imageUrl = "https://images.unsplash.com/photo-1622560480605-d83c853bc5c3?q=80&w=800",
            paisOrigem = "Global"
        )
    )

    fun getItemsByDecada(decada: String): List<FashionItem> =
        getAllItems().filter { it.decada == decada }

    fun getItemsByCategoria(categoria: FashionCategory): List<FashionItem> =
        getAllItems().filter { it.categoria == categoria }

    fun getItemById(id: String): FashionItem? =
        getAllItems().find { it.id == id }

    fun getDecadas(): List<String> =
        getAllItems().map { it.decada }.distinct().sorted()

    fun searchItems(query: String): List<FashionItem> =
        getAllItems().filter {
            it.nome.contains(query, ignoreCase = true) ||
            it.descricao.contains(query, ignoreCase = true) ||
            it.paisOrigem.contains(query, ignoreCase = true) ||
            it.categoria.displayName.contains(query, ignoreCase = true)
        }
}
