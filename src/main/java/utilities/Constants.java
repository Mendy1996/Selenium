package utilities;

import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Constants {

    public static final List<String> listActionsTable =
            Collections.unmodifiableList(Arrays.asList("N° d’action", "Libellé","Code structure","Date de création","Date de fermeture","Statut de l'action","Montant initial","Montant restant dû","Documents"));
    public static final List<String> listCreanceTable =
            Collections.unmodifiableList(Arrays.asList("Code structure", "Référence de recouvrement","N° de rôle ou n° d’AMR","Nature imposition","Période d'imposition","Date de mise en recouvrement ou date de notification","Exigibilité immédiate","Date limite de paiement","Solde dû"));

    public static final List<String> listCreanceTableHLT=
            Collections.unmodifiableList(Arrays.asList("Groupe de créances","Référence de recouvrement","N° de rôle ou n° d'AMR","Nature imposition","Période d'imposition","Date de mise en recouvrement ou date de notification","Exigibilité immédiate","Date limite de paiement","Solde dû"));

    public static final List<String> listCreanceTableGestionHLTPage=
            Collections.unmodifiableList(Arrays.asList("Référence de recouvrement","N° de rôle ou n° d'AMR","Nature imposition","Période d'imposition","Date de mise en recouvrement ou date de notification","Exigibilité immédiate","Date limite de paiement","Solde dû"));

    public static final List<String> listCreanceTableGestionAMRPAge =
            Collections.unmodifiableList(Arrays.asList("Référence de recouvrement","N° de rôle ou d'AMR","Nature imposition","Période d'imposition","Date de MER ou de notification","Exigibilité immédiate","Date limite de paiement","Solde dû"));

    public static final List<String> listCreanceTableGestionDDPPAge =
            Collections.unmodifiableList(Arrays.asList("Référence de recouvrement","N° de rôle ou n° d’AMR","Nature imposition","Période d'imposition","Date de mise en recouvrement ou date de notification","Exigibilité immédiate","Date limite de paiement","Solde dû"));


    public static final List<String> listDeroulementHistoriqueHLT =
            Collections.unmodifiableList(Arrays.asList("Nature","Date","Numéro","Motifs","Frais"));

    public static final List<String> listIntervenantTable =
            Collections.unmodifiableList(Arrays.asList("Code THEMIS","Coordonnées","Adresse","Courriel","Numéro de téléphone"));


    public static final List<String> listCreancesANV =
            Collections.unmodifiableList(Arrays.asList("201503350", "20180692K","201710650","201702340"));
    public static final String creancePrescrite ="20130042K";
    public static final String moteurDeRecherchePro = "Moteur de recherche des professionnels";
    public static final String moteurDeRechercheParticulier= "Moteur de recherche des particuliers";
    public static ImmutableMap<String,String> structures = ImmutableMap.<String, String>builder()
            .put("REIMS", "F - 5100301 - SERVICE IMPOTS DES ENTREPRISES REIMS")
            .put("GRDENTREPRISE", "P - A457V10 - RECOUVREMENT DIRECTION GRANDES ENTREPRISES")
            .put("key3", "value3")
            .put("key4", "value4")
            .build();
    public static ImmutableMap<String,String> couloirs = ImmutableMap.<String, String>builder()
            .put("TI10", "Recouvrement forcé(TI10)")
            .put("TI11", "Recouvrement forcé(TI11)")
            .put("TI12", "Recouvrement forcé (TI12)")
            .put("key3", "value3")
            .put("key4", "value4")
            .build();
    public static ImmutableMap<String,String> listeDesActions = ImmutableMap.<String, String>builder()
            .put("BS", "Bordereau Situation")
            .put("OPPVFC", "Opposition Vente FC")
            .put("AffaireManuelleVisiteSurPlace", "Visite sur place")
            .put("AffaireManuelleSuccessions", "Successions")
            .put("AffaireManuelleSaisieRemuneration", "Saisie rémunérations")
            .put("AffaireManuellePVDifficulte", "PV de difficultés")
            .put("AffaireManuelleCCSF", "CCSF")
            .put("AMR", "AMR")
            .put("HLT", "Hypothèque Légale")
            .put("DDP", "Délai de Paiement")
            .put("AAI", "Conciliation")
            .put("RCG", "Réclamation")
            .put("BNIBI", "BNI/BI")
            .put("PC", "Procédure collective")
            .build();
}
