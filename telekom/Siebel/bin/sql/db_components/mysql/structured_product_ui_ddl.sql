CREATE TABLE sbl_promotion_ui (
	promotion_ui_id		VARCHAR(254)	NOT NULL,
	promotion_id     VARCHAR(254)  NULL,
	promotion_ui_name 		VARCHAR(254)	NULL,
	controller 		VARCHAR(254)	NULL REFERENCES sbl_renderer(renderer_id),
	css_path 		VARCHAR(254)	NULL,
	PRIMARY KEY(promotion_ui_id)
);

CREATE TABLE sbl_promotion_ui_roots (
	promotion_ui_id		VARCHAR(254)	NOT NULL REFERENCES sbl_promotion_ui (promotion_ui_id),
	sequence_num 		INTEGER	NOT NULL,
	product_id 		VARCHAR(254)	NULL,
	PRIMARY KEY(promotion_ui_id, sequence_num)
);

CREATE INDEX sbl_promotion_ui_roots_promotion_idx ON sbl_promotion_ui_roots (promotion_ui_id, sequence_num);

CREATE TABLE sbl_product_ui (
	product_ui_id		VARCHAR(254)	NOT NULL,
	product_id 		VARCHAR(254)	NULL,
	product_name 		VARCHAR(254)	NULL,
	promotion_ui_id 	VARCHAR(254)	NULL REFERENCES sbl_promotion_ui (promotion_ui_id),
	root_product_flag 	NUMERIC(1)	NULL,
	css_path 		VARCHAR(254)	NULL,
	CHECK (root_product_flag IN (0, 1)),
	PRIMARY KEY(product_ui_id)
);

CREATE TABLE sbl_product_blocks (
	product_ui_id		VARCHAR(254)	NOT NULL REFERENCES sbl_product_ui (product_ui_id),
	sequence_num 		INTEGER	NOT NULL,
	block_id 		VARCHAR(254)	NULL REFERENCES sbl_block(block_id),
	PRIMARY KEY(product_ui_id, sequence_num)
);

CREATE INDEX sbl_product_blocks_idx ON sbl_product_blocks(product_ui_id, sequence_num);

CREATE TABLE sbl_attribute_block (
	block_id 		VARCHAR(254)	NOT NULL REFERENCES sbl_block(block_id),
	attribute_id 		VARCHAR(254)	NULL,
	attribute_name 		VARCHAR(254)	NULL,
	PRIMARY KEY(block_id)
);

CREATE INDEX sbl_attribute_block_idx ON sbl_attribute_block(block_id);

CREATE TABLE sbl_relationship_block (
	block_id 		VARCHAR(254)	NOT NULL REFERENCES sbl_block(block_id),
	relationship_id 	VARCHAR(254)	NULL,
	PRIMARY KEY(block_id)
);

CREATE INDEX sbl_relationship_block_idx ON sbl_relationship_block(block_id);

CREATE TABLE sbl_child_product_ui (
	block_id			VARCHAR(254)	NOT NULL REFERENCES sbl_block(block_id),
	sequence_num 		INTEGER	NOT NULL,
	product_ui_id 		VARCHAR(254)	NULL REFERENCES sbl_product_ui(product_ui_id),
	PRIMARY KEY(block_id, sequence_num)
);

CREATE INDEX sbl_child_product_ui_idx ON sbl_child_product_ui (block_id, sequence_num);

CREATE TABLE sbl_block (
	block_id 		VARCHAR(254)	NOT NULL,
	name 			VARCHAR(254)	NULL,
	display_name 		VARCHAR(254)	NULL,
	type 			INTEGER	NULL,
	renderer 		VARCHAR(254)	NULL REFERENCES sbl_renderer(renderer_id),
	active_flag 		NUMERIC(1)	NULL,
	html_attributes		VARCHAR(4064)	NULL,
	CHECK (active_flag IN (0, 1)),
	PRIMARY KEY(block_id)
);

CREATE TABLE sbl_renderer (
	renderer_id 		VARCHAR(254)	NOT NULL,
	jsp_path 		VARCHAR(254)	NULL,
	application_context 	VARCHAR(254)	NULL,
	html_attributes 		VARCHAR(4064)	NULL,
	PRIMARY KEY(renderer_id)
);

