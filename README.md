Exercice  : tour de magie
2.1 Organisation de l'exercice
Dans cet exercice, nous vous demandons d'élaborer un programme orienté objets de manière indépendante pour la première fois. Nous avons donc organisé l'exercice en 2 parties :
1. une première (de 2.2 et 2.3) qui décrit le problème à résoudre et qui, idéalement devrait suffire pour élaborer puis écrire le programme de façon autonome, certainement en plusieurs tentatives;
2. une seconde (partie 2.4), pour aider au cas où la première partie vous semble insuffisante, vu que c'est votre première conception autonome d'un programme. Dans un premier temps, essayez de ne pas la lire et revenez-y si nécessaire.
   2.2 Buts du programme
   On souhaite ici écrire un programme « simulant » le tour de magie élémentaire suivant :
   Un magicien demande à un spectateur d'écrire sur un papier son âge et la somme qu'il a en poche (moins de 100 francs suisses). L'assistant doit ensuite le lire (sans rien dire), puis effectuer secrètement le calcul suivant : multiplier l'âge par 2, lui ajouter 5, multiplier le résultat par 50, ajouter la somme en poche, et soustraire le nombre de jours que contient une année, puis finalement donner le résultat à haute voix.
   En ajoutant mentalement (rapidement !) 115 au chiffre reçu, le magicien trouve tout de suite l'âge et la somme en poche (qui étaient restés secrets).
   Modéliser ce tour de magie, en définissant au moins les classes (simples) Magicien, Assistant et Spectateur. Il pourrait également être utile de disposer d'une classe Papier.
   L'instance de Spectateur devra demander son âge à l'utilisateur du programme ainsi que la somme d'argent en poche, et s'assurer qu'une valeur correcte est entrée (entre 0 et 99).
   Essayer de faire une modélisation la plus exacte possible ; faire notamment usage des droits d'accès là où cela semble pertinent. Pour chaque méthode, effectuer un affichage à l'écran de l'opération en cours et de l'acteur qui la réalise.
   Note :
   Il existe de nombreuses variantes possibles. Commencer par un modèle très simple, et le faire évoluer pour se rapprocher de la situation « réelle » décrite.
   Rappel : pour pouvoir lire une donnée depuis le clavier, il faut avoir au préalable déclaré une variable de type Scanner :
   private final static Scanner clavier = new Scanner(System.in);
   ...
   int i = clavier.nextInt(); // par exemple pour lire un entier
   avec au préalable l'importation import java.util.Scanner en début de programme.
   Vous pourrez déclarer la variable clavier (ou équivalent) dans la classe Spectateur ici (c'est un point sur lequel nous reviendrons plus tard dans le cours).
   2.3 Exemple de déroulement
   Spectateur] (j'entre en scène)
   Quel âge ai-je ? 35
   Combien d'argent ai-je en poche (<100) ? 110
   Combien d'argent ai-je en poche (<100) ? 12
   [Spectateur] (j'ai un montant qui convient)
   [Magicien] un petit tour de magie...
   [Spectateur] (j'écris le papier)
   [Assistant] (je lis le papier)
   [Assistant] (je calcule mentalement)
   [Assistant] J'annonce : 3397 !
   [Magicien] - hum... je vois que vous êtes agé de 35 ans
   et que vous avez 12 francs suisses en poche !
   2.4 Indications plus détaillées
   Vous trouverez sur la page suivante quelques indications en vrac qui peuvent vous être utiles. Ne les lisez pas si vous voulez être complètement indépendant (but premier de l'exercice)...

2.4 Indications plus détaillées
Les « objets » du programme ont déjà été suggérés : Magicien, Assistant, Spectateur et éventuellement Papier ; réfléchissez alors aux attributs : « qui a quoi ? » et surtout aux méthodes : « qui fait quoi ? »
Essayez de définir une méthode pour chaque action élémentaire effectuée : premières actions du spectateur (demander l'âge et la somme d'argent), écrire sur le papier, montrer le papier ; pour l'assistant, lire le papier (qu'il doit donc recevoir), faire le calcul ; etc.
Procédez par étapes, petit à petit.