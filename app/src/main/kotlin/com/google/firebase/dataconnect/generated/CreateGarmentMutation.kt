
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



public interface CreateGarmentMutation :
    com.google.firebase.dataconnect.generated.GeneratedMutation<
      ExampleConnector,
      CreateGarmentMutation.Data,
      CreateGarmentMutation.Variables
    >
{
  
    @kotlinx.serialization.Serializable
  public data class Variables(
  
    val name: String,
  
    val description: String,
  
    val historicalSignificance: String,
  
    val eraId: @kotlinx.serialization.Serializable(with = com.google.firebase.dataconnect.serializers.UUIDSerializer::class) java.util.UUID,
  
  ) {
    
    
  }
  

  
    @kotlinx.serialization.Serializable
  public data class Data(
  
    val garment_insert: GarmentKey,
  
  ) {
    
    
  }
  

  public companion object {
    public val operationName: String = "CreateGarment"

    public val dataDeserializer: kotlinx.serialization.DeserializationStrategy<Data> =
      kotlinx.serialization.serializer()

    public val variablesSerializer: kotlinx.serialization.SerializationStrategy<Variables> =
      kotlinx.serialization.serializer()
  }
}

public fun CreateGarmentMutation.ref(
  
    name: String,description: String,historicalSignificance: String,eraId: java.util.UUID,

  
  
): com.google.firebase.dataconnect.MutationRef<
    CreateGarmentMutation.Data,
    CreateGarmentMutation.Variables
  > =
  ref(
    
      CreateGarmentMutation.Variables(
        name=name,description=description,historicalSignificance=historicalSignificance,eraId=eraId,
  
      )
    
  )

public suspend fun CreateGarmentMutation.execute(

  
    
      name: String,description: String,historicalSignificance: String,eraId: java.util.UUID,

  

  ): com.google.firebase.dataconnect.MutationResult<
    CreateGarmentMutation.Data,
    CreateGarmentMutation.Variables
  > =
  ref(
    
      name=name,description=description,historicalSignificance=historicalSignificance,eraId=eraId,
  
    
  ).execute()


