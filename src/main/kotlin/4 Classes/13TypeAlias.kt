package `4 Classes`

/**
 * Nested ya da typeAlias kullanımı desteklenmiyor.
 *
 * typeAlias'lar arka planda yeni bir class oluşturmazlar.Sadece etiketleme yaparlar.
 *
 * Uzun isimlerdeki classların adını değiştirmeden yeni bir isim vermemizi sağlar.
 * Top-Level oalrak yazılmalıdır.
 */

typealias AccountReferanceVM = ProjectContractChargingPeriodProjectReferanceVM

val projectContractChargingPeriodProjectReferanceVM = ProjectContractChargingPeriodProjectReferanceVM()

// yukardaki gibi uzun nesne oluşturmak yerine typealias ile ismini AccountReferanceVM yaptık ve aşşağıdaki gibi nesne oluşturduk.

val accountReferanceVM = AccountReferanceVM()

class ProjectContractChargingPeriodProjectReferanceVM() {

}
