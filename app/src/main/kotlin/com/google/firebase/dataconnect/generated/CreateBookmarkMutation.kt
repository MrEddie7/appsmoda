
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



public interface CreateBookmarkMutation :
    com.google.firebase.dataconnect.generated.GeneratedMutation<
      ExampleConnector,
      CreateBookmarkMutation.Data,
      CreateBookmarkMutation.Variables
    >
{
  
    @kotlinx.serialization.Serializable
  public data class Variables(
  
    val garmentId: @kotlinx.serialization.Serializable(with = com.google.firebase.dataconnect.serializers.UUIDSerializer::class) java.util.UUID,
  
  ) {
    
    
  }
  

  
    @kotlinx.serialization.Serializable
  public data class Data(
  
    val bookmark_insert: BookmarkKey,
  
  ) {
    
    
  }
  

  public companion object {
    public val operationName: String = "CreateBookmark"

    public val dataDeserializer: kotlinx.serialization.DeserializationStrategy<Data> =
      kotlinx.serialization.serializer()

    public val variablesSerializer: kotlinx.serialization.SerializationStrategy<Variables> =
      kotlinx.serialization.serializer()
  }
}

public fun CreateBookmarkMutation.ref(
  
    garmentId: java.util.UUID,

  
  
): com.google.firebase.dataconnect.MutationRef<
    CreateBookmarkMutation.Data,
    CreateBookmarkMutation.Variables
  > =
  ref(
    
      CreateBookmarkMutation.Variables(
        garmentId=garmentId,
  
      )
    
  )

public suspend fun CreateBookmarkMutation.execute(

  
    
      garmentId: java.util.UUID,

  

  ): com.google.firebase.dataconnect.MutationResult<
    CreateBookmarkMutation.Data,
    CreateBookmarkMutation.Variables
  > =
  ref(
    
      garmentId=garmentId,
  
    
  ).execute()


