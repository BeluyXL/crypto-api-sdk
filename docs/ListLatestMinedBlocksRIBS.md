

# ListLatestMinedBlocksRIBS


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bits** | **String** | Represents a specific sub-unit of Zcash. Bits have two-decimal precision |  |
|**chainwork** | **String** | Represents a hexadecimal number of all the hashes necessary to produce the current chain. E.g., when converting 0000000000000000000000000000000000000000000086859f7a841475b236fd to a decimal you get 635262017308958427068157 hashes, or 635262 exahashes. |  |
|**difficulty** | **String** | Represents a mathematical value of how hard it is to find a valid hash for this block. |  |
|**merkleRoot** | **String** | Defines the single and final (root) node of a Merkle tree. It is the combined hash of all transactions&#39; hashes that are part of a blockchain block. |  |
|**nonce** | **String** | Represents a random value that can be adjusted to satisfy the proof of work |  |
|**size** | **Integer** | Represents the total size of the block in Bytes. |  |
|**strippedSize** | **Integer** | Defines the numeric representation of the block size excluding the witness data. |  |
|**version** | **Integer** | Represents the transaction version number. |  |
|**versionHex** | **String** | Is the hexadecimal string representation of the block&#39;s version. |  |
|**weight** | **Integer** | Represents a measurement to compare the size of different transactions to each other in proportion to the block size limit. |  |
|**extraData** | **String** | Represents any data that can be included by the miner in the block. |  |
|**gasLimit** | **Integer** | Represents the maximum amount of gas allowed in the block in order to determine how many transactions it can fit. |  |
|**gasUsed** | **Integer** | Defines how much of the gas for the block has been used. |  |
|**minedInSeconds** | **Integer** | Specifies the amount of time required for the block to be mined in second |  |
|**sha3Uncles** | **String** | Defines the combined hash of all uncles for a given parent. |  |
|**totalDifficulty** | **String** | Defines the total difficulty of the chain until this block, i.e. how difficult it is for a specific miner to mine a new block |  |
|**uncles** | **List&lt;String&gt;** |  |  |
|**dsBlock** | **Integer** | Represents the Directory Service block which contains metadata about the miners who participate in the consensus protocol. |  |
|**dsDifficulty** | **String** | Defines how difficult it is to mine the dsBlocks. |  |
|**dsLeader** | **String** | Represents a part of the DS Committee which leads the consensus protocol for the epoch. |  |
|**microBlocks** | **List&lt;String&gt;** |  |  |
|**totalCoins** | [**ListLatestMinedBlocksRIBSXTotalCoins**](ListLatestMinedBlocksRIBSXTotalCoins.md) |  |  [optional] |
|**totalFees** | [**ListLatestMinedBlocksRIBSXTotalFees**](ListLatestMinedBlocksRIBSXTotalFees.md) |  |  |



