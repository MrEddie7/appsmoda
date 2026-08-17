
@file:Suppress(
  "KotlinRedundantDiagnosticSuppress",
  "PropertyName",
  "MayBeConstant",
  "RedundantVisibilityModifier",
  "RedundantCompanionReference",
  "RemoveEmptyClassBody",
  "SpellCheckingInspection",
  "unused",
)

package com.google.firebase.dataconnect.generated



public interface CreateEraMutation :
    com.google.firebase.dataconnect.generated.GeneratedMutation<
      ExampleConnector,
      CreateEraMutation.Data,
      Unit
    >
{
  

  
    @kotlinx.serialization.Serializable
  public data class Data(
  
    val era_insert: EraKey,
  
  ) {
    
    
  }
  

  public companion object {
    public val operationName: String = "CreateEra"

    public val dataDeserializer: kotlinx.serialization.DeserializationStrategy<Data> =
      kotlinx.serialization.serializer()

    public val variablesSerializer: kotlinx.serialization.SerializationStrategy<Unit> =
      kotlinx.serialization.serializer()
  }
}

public fun CreateEraMutation.ref(
  
): com.google.firebase.dataconnect.MutationRef<
    CreateEraMutation.Data,
    Unit
  > =
  ref(
    
      Unit
    
  )

public suspend fun CreateEraMutation.execute(

  

  ): com.google.firebase.dataconnect.MutationResult<
    CreateEraMutation.Data,
    Unit
  > =
  ref(
    
  ).execute()


